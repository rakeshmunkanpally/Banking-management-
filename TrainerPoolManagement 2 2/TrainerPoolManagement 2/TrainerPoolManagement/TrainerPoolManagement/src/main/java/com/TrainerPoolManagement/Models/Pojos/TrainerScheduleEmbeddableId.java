package com.TrainerPoolManagement.Models.Pojos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class TrainerScheduleEmbeddableId {

	@ManyToOne
	@JoinColumn(name = "TrainerID")
	private Associate associate;
	@ManyToOne
	@JoinColumn(name = "CourseId")
	private Course course;
	@Column(name="Start_Date")
	private LocalDate startDate;
	
	public TrainerScheduleEmbeddableId() {
		// TODO Auto-generated constructor stub
	}

	public TrainerScheduleEmbeddableId(Associate associate, Course course, LocalDate startDate) {
		super();
		this.associate = associate;
		this.course = course;
		this.startDate = startDate;
	}

	public Associate getAssociate() {
		return associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	

}
