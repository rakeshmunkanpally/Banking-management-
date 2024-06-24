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
@Table(name="tblTertiaryCategory")
public class TertiaryCategory {

	@Id
	@Column(name="Tertiary_Category_Id")
	private String tertiaryCategoryId;
	@Column(name="Tertiary_Category_Desc", length = 40, nullable=false)
	private String tertiaryCategoryDesc;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="Secondary_Category_Id")
	private SecondaryCategory secondaryCategory;
	
	@OneToMany(mappedBy = "courseCode",fetch = FetchType.LAZY)
	private List<Course> courses;
	
	
	public TertiaryCategory() {
		// TODO Auto-generated constructor stub
	}


	public TertiaryCategory(String tertiaryCategoryId, String tertiaryCategoryDesc, SecondaryCategory secondaryCategory,
			List<Course> courses) {
		super();
		this.tertiaryCategoryId = tertiaryCategoryId;
		this.tertiaryCategoryDesc = tertiaryCategoryDesc;
		this.secondaryCategory = secondaryCategory;
		this.courses = courses;
	}


	public String getTertiaryCategoryId() {
		return tertiaryCategoryId;
	}


	public void setTertiaryCategoryId(String tertiaryCategoryId) {
		this.tertiaryCategoryId = tertiaryCategoryId;
	}


	public String getTertiaryCategoryDesc() {
		return tertiaryCategoryDesc;
	}


	public void setTertiaryCategoryDesc(String tertiaryCategoryDesc) {
		this.tertiaryCategoryDesc = tertiaryCategoryDesc;
	}


	public SecondaryCategory getSecondaryCategory() {
		return secondaryCategory;
	}


	public void setSecondaryCategory(SecondaryCategory secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}


	public List<Course> getCourses() {
		return courses;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	
}
