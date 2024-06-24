package com.TrainerPoolManagement.Models.DAO.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.TrainerPoolManagement.Models.Pojos.SecondaryCategory;

public interface secondaryCategoryId extends JpaRepository<SecondaryCategory, String> {
	
	List<SecondaryCategory> findByPrimaryCategoryPrimaryCategoryId(String primaryCategoryId);
	

}
