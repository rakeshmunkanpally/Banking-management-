package com.TrainerPoolManagement.Models.Pojos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblPrimaryCategory")
public class PrimaryCategory {

	@Id
	@Column(name = "Primary_Category_Id", length = 12)
	private String primaryCategoryId;
	@Column(name = "Primary_Category_desc", length = 40, nullable = false)
	private String primaryCategoryName;
    @JsonBackReference
	@OneToMany(mappedBy = "primaryCategory", fetch = FetchType.LAZY)
	private List<SecondaryCategory> secondaryCategories;
	public PrimaryCategory() {
		// TODO Auto-generated constructor stub
	}
	public PrimaryCategory(String primaryCategoryId, String primaryCategoryName,
			List<SecondaryCategory> secondaryCategories) {
		super();
		this.primaryCategoryId = primaryCategoryId;
		this.primaryCategoryName = primaryCategoryName;
		this.secondaryCategories = secondaryCategories;
	}
	public String getPrimaryCategoryId() {
		return primaryCategoryId;
	}
	public void setPrimaryCategoryId(String primaryCategoryId) {
		this.primaryCategoryId = primaryCategoryId;
	}
	public String getPrimaryCategoryName() {
		return primaryCategoryName;
	}
	public void setPrimaryCategoryName(String primaryCategoryName) {
		this.primaryCategoryName = primaryCategoryName;
	}
	public List<SecondaryCategory> getSecondaryCategories() {
		return secondaryCategories;
	}
	public void setSecondaryCategories(List<SecondaryCategory> secondaryCategories) {
		this.secondaryCategories = secondaryCategories;
	}

	
	

}
