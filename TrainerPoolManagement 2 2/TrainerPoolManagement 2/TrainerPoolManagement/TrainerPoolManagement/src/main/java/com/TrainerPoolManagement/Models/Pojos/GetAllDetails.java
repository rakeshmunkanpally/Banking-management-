package com.TrainerPoolManagement.Models.Pojos;

import java.time.LocalDate;



public class GetAllDetails {
	
	private String associateId;
	
	private String associateName;
	
	private String grade;
	
	private String courseCode;
	
	private String courseName;
	
	private String courseOwner;
	
	private EnumCourseLevel courseLevel;
	
	private String statusCode;
	
	private String reasonCode;
	
	private LocalDate availabilityTechnicalDiscussion;
	
	private String comment;
	
	public GetAllDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetAllDetails(String associateId, String associateName, String grade, String courseCode, String courseName,
			String courseOwner, EnumCourseLevel courseLevel, String statusCode, String reasonCode,
			LocalDate availabilityTechnicalDiscussion, String comment) {
		super();
		this.associateId = associateId;
		this.associateName = associateName;
		this.grade = grade;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.courseOwner = courseOwner;
		this.courseLevel = courseLevel;
		this.statusCode = statusCode;
		this.reasonCode = reasonCode;
		this.availabilityTechnicalDiscussion = availabilityTechnicalDiscussion;
		this.comment = comment;
	}

	public String getAssociateId() {
		return associateId;
	}

	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseOwner() {
		return courseOwner;
	}

	public void setCourseOwner(String courseOwner) {
		this.courseOwner = courseOwner;
	}

	public EnumCourseLevel getCourseLevel() {
		return courseLevel;
	}

	public void setCourseLevel(EnumCourseLevel courseLevel) {
		this.courseLevel = courseLevel;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public LocalDate getAvailabilityTechnicalDiscussion() {
		return availabilityTechnicalDiscussion;
	}

	public void setAvailabilityTechnicalDiscussion(LocalDate availabilityTechnicalDiscussion) {
		this.availabilityTechnicalDiscussion = availabilityTechnicalDiscussion;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
}
