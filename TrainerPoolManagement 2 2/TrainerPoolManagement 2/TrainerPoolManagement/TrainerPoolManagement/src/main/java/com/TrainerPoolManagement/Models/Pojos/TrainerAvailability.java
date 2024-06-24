package com.TrainerPoolManagement.Models.Pojos;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tblTrainer_Availability")
public class TrainerAvailability {
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "associateId")
	private Associate associate;
	
	@Column(name="Availability", length = 40)
	private LocalDate availability;
	@Column(name = "Comments", length = 40)
	private String comment;
	
	public TrainerAvailability() {
		// TODO Auto-generated constructor stub
	}

	public TrainerAvailability(Associate associate, LocalDate availability, String comment) {
		super();
		this.associate = associate;
		this.availability = availability;
		this.comment = comment;
	}

	public Associate getAssociate() {
		return associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	public LocalDate getAvailability() {
		return availability;
	}

	public void setAvailability(LocalDate availability) {
		this.availability = availability;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
	
}
