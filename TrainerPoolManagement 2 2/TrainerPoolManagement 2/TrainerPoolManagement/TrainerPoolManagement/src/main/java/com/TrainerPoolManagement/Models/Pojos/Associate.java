package com.TrainerPoolManagement.Models.Pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblAssociate")
public class Associate {

	@Id
	@Column(name = "AssociateId", length = 12)
	private String associateId;
	@Column(name = "AssociateName", length = 40, nullable = false)
	private String associateName;
	@Column(name = "Grade", length = 6, nullable = false)
	private String grade;

	public Associate() {
		super();
	}

	public Associate(String associateId, String associateName, String grade) {
		super();
		this.associateId = associateId;
		this.associateName = associateName;
		this.grade = grade;
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

	
}
