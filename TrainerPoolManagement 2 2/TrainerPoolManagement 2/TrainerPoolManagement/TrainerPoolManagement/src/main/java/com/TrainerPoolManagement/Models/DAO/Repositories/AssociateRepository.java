package com.TrainerPoolManagement.Models.DAO.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.TrainerPoolManagement.Models.Pojos.Associate;

import jakarta.transaction.Transactional;

public interface AssociateRepository extends JpaRepository<Associate, String> {

	@Query("SELECT  A.associateId FROM Associate A "
			+ "INNER JOIN TrainerLocationPreference LP ON A.associateId = LP.trainerLocationEmbeddableId.associate.associateId "
			+ "INNER JOIN TrainerAvailability AV ON AV.associate.associateId = A.associateId "
			+ "INNER JOIN TrainerStatus TS ON TS.trainerStatusEmbbedableId.associate.associateId = A.associateId "
			+ "INNER JOIN Course TC ON TS.trainerStatusEmbbedableId.course.courseCode = TC.courseCode "
			+ "INNER JOIN TertiaryCategory T ON T.tertiaryCategoryId = TC.tertiaryCategory.tertiaryCategoryId "
			+ "INNER JOIN SecondaryCategory S ON T.secondaryCategory.secondaryCategoryId = S.secondaryCategoryId "
			+ "INNER JOIN PrimaryCategory P ON S.primaryCategory.primaryCategoryId = P.primaryCategoryId "
			+ "WHERE LP.trainerLocationEmbeddableId.location.locationId = :locationId "
			+ "AND AV.availability BETWEEN TO_DATE('1990-01-01', 'YYYY-MM-DD') AND TO_DATE('2025-12-31', 'YYYY-MM-DD') "
			+ "AND P.primaryCategoryId = :primaryCategoryId " + "AND S.secondaryCategoryId = :secondaryCategoryId "
			+ "AND T.tertiaryCategoryId = :tertiaryCategoryId")
	List<Object> findAssociatesWithLocationAndCategories(@Param("locationId") String locationId,
			@Param("primaryCategoryId") String primaryCategoryId,
			@Param("secondaryCategoryId") String secondaryCategoryId,
			@Param("tertiaryCategoryId") String tertiaryCategoryId);
	
	

	@Query("SELECT A.associateId, A.associateName, A.grade, TC.courseCode, TC.courseName, TC.courseOwner, TC.courseLevel, TS.statusCode, TS.reasonCode,AV.comment FROM Associate A " +
            "INNER JOIN TrainerLocationPreference LP ON A.associateId = LP.trainerLocationEmbeddableId.associate.associateId " +
            "INNER JOIN TrainerAvailability AV ON AV.associate.associateId = A.associateId " +
            "INNER JOIN TrainerStatus TS ON TS.trainerStatusEmbbedableId.associate.associateId = A.associateId " +
            "INNER JOIN Course TC ON TS.trainerStatusEmbbedableId.course.courseCode = TC.courseCode " +
            "INNER JOIN TertiaryCategory T ON T.tertiaryCategoryId = TC.tertiaryCategory.tertiaryCategoryId " +
            "INNER JOIN SecondaryCategory S ON T.secondaryCategory.secondaryCategoryId = S.secondaryCategoryId " +
            "INNER JOIN PrimaryCategory P ON S.primaryCategory.primaryCategoryId = P.primaryCategoryId " +
            "WHERE A.associateId IN :associateIds and TS.statusCode='Approved' ")
    List<Object[]> findAssociatesWithDetails(@Param("associateIds") List<Object> associateIds);

	@Transactional

	@Modifying

	@Query("UPDATE TrainerStatus ts SET ts.statusCode = :statusCode, ts.reasonCode = :reasonCode WHERE ts.trainerStatusEmbbedableId.associate.associateId = :trainerId")

	void updateStatusAndReason(@Param("trainerId") String trainerId, @Param("statusCode") String statusCode,
			@Param("reasonCode") String reasonCode);
	
	
	
	

}
