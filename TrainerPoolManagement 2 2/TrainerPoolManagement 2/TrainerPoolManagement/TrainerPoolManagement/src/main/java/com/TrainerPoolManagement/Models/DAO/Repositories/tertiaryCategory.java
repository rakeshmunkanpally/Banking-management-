package com.TrainerPoolManagement.Models.DAO.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.TrainerPoolManagement.Models.Pojos.TertiaryCategory;

public interface tertiaryCategory extends JpaRepository<TertiaryCategory, String> {
	List<TertiaryCategory> findBySecondaryCategorySecondaryCategoryId(String secondaryCategoryId );

}
