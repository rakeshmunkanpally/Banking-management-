package com.TrainerPoolManagement.Models.Pojos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tblSecondaryCategory")
public class SecondaryCategory {

	@Id
	@Column(name="Secondary_Category_Id", length=12)
	private String secondaryCategoryId;
	@Column(name="Secondary_Category_Desc", length=40, nullable=false)
	private String secondaryCategoryDesc;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="Primary_Category_Id",nullable = false)
	private PrimaryCategory primaryCategory;
	
	@OneToMany(mappedBy = "secondaryCategory", fetch = FetchType.LAZY)
	private List<TertiaryCategory> tertiaryCategories;
	
	public SecondaryCategory() {
		// TODO Auto-generated constructor stub
	}

	public SecondaryCategory(String secondaryCategoryId, String secondaryCategoryDesc, PrimaryCategory primaryCategory,
			List<TertiaryCategory> tertiaryCategories) {
		super();
		this.secondaryCategoryId = secondaryCategoryId;
		this.secondaryCategoryDesc = secondaryCategoryDesc;
		this.primaryCategory = primaryCategory;
		this.tertiaryCategories = tertiaryCategories;
	}

	public String getSecondaryCategoryId() {
		return secondaryCategoryId;
	}

	public void setSecondaryCategoryId(String secondaryCategoryId) {
		this.secondaryCategoryId = secondaryCategoryId;
	}

	public String getSecondaryCategoryDesc() {
		return secondaryCategoryDesc;
	}

	public void setSecondaryCategoryDesc(String secondaryCategoryDesc) {
		this.secondaryCategoryDesc = secondaryCategoryDesc;
	}

	public PrimaryCategory getPrimaryCategory() {
		return primaryCategory;
	}

	public void setPrimaryCategory(PrimaryCategory primaryCategory) {
		this.primaryCategory = primaryCategory;
	}

	public List<TertiaryCategory> getTertiaryCategories() {
		return tertiaryCategories;
	}

	public void setTertiaryCategories(List<TertiaryCategory> tertiaryCategories) {
		this.tertiaryCategories = tertiaryCategories;
	}
	
	
}
