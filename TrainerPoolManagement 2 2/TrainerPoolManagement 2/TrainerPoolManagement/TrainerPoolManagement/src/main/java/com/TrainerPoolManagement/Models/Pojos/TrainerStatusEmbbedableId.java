package com.TrainerPoolManagement.Models.Pojos;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class TrainerStatusEmbbedableId {

	@ManyToOne
	@JoinColumn(name="TrainerId")
	private Associate associate;
	@ManyToOne
	@JoinColumn(name="CourseCode")
	private Course course;
	
	public TrainerStatusEmbbedableId() {
		// TODO Auto-generated constructor stub
	}

	public TrainerStatusEmbbedableId(Associate associate, Course course) {
		super();
		this.associate = associate;
		this.course = course;
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
	

}
