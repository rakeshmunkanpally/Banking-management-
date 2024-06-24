package com.TrainerPoolManagement.Models.Pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblCourse")
public class Course {

	@Id
	@Column(name = "CourseCode", length = 12)
	private String courseCode;
	@Column(name = "CourseName", length = 40, nullable = false)
	private String courseName;
	@Column(name="CourseOwner", length=40, nullable = false)
	private String courseOwner;
	@Enumerated(EnumType.STRING)
	@Column(name="Course_Level", length=15,nullable = false)
	private EnumCourseLevel courseLevel;
	@Column(name="ClassRoom_Training_Hours",nullable = false)
	private int classroomTrainingHours;
	@Column(name="Virtual_ClassRoom_Hours",nullable=false)
	private int virtualClassroomHours;
	@ManyToOne
	@JoinColumn(name="Tertiary_Category_Id",nullable = false)	
	private TertiaryCategory tertiaryCategory;

	public Course() {
		super();
	}

	public Course(String courseCode, String courseName, String courseOwner, EnumCourseLevel courseLevel,
			int classroomTrainingHours, int virtualClassroomHours, TertiaryCategory tertiaryCategory) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.courseOwner = courseOwner;
		this.courseLevel = courseLevel;
		this.classroomTrainingHours = classroomTrainingHours;
		this.virtualClassroomHours = virtualClassroomHours;
		this.tertiaryCategory = tertiaryCategory;
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

	public int getClassroomTrainingHours() {
		return classroomTrainingHours;
	}

	public void setClassroomTrainingHours(int classroomTrainingHours) {
		this.classroomTrainingHours = classroomTrainingHours;
	}

	public int getVirtualClassroomHours() {
		return virtualClassroomHours;
	}

	public void setVirtualClassroomHours(int virtualClassroomHours) {
		this.virtualClassroomHours = virtualClassroomHours;
	}

	public TertiaryCategory getTertiaryCategory() {
		return tertiaryCategory;
	}

	public void setTertiaryCategory(TertiaryCategory tertiaryCategory) {
		this.tertiaryCategory = tertiaryCategory;
	}
	
}
