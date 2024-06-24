package com.TrainerPoolManagement.Models.Pojos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tblTrainer_Status")
public class TrainerStatus {

	@EmbeddedId
	private TrainerStatusEmbbedableId trainerStatusEmbbedableId;
	
	@Column(name="Status_Code", length = 40, nullable = false)
	private String statusCode;
	@Column(name="Reason_Code", length = 40, nullable = false)
	private String reasonCode;
	
	@Column(name="Availability_Technical_Discussion")
	private LocalDate availabilityTechnicalDiscussion;
	
	@Column(name="Nomination_Date")
	private LocalDate nominationDate;
	@Column(name="Comments", length = 40)
	private String comment;
	
	public TrainerStatus() {
		// TODO Auto-generated constructor stub
	}

	public TrainerStatus(TrainerStatusEmbbedableId trainerStatusEmbbedableId, String statusCode, String reasonCode,
			LocalDate availabilityTechnicalDiscussion, LocalDate nominationDate, String comment) {
		super();
		this.trainerStatusEmbbedableId = trainerStatusEmbbedableId;
		this.statusCode = statusCode;
		this.reasonCode = reasonCode;
		this.availabilityTechnicalDiscussion = availabilityTechnicalDiscussion;
		this.nominationDate = nominationDate;
		this.comment = comment;
	}

	public TrainerStatusEmbbedableId getTrainerStatusEmbbedableId() {
		return trainerStatusEmbbedableId;
	}

	public void setTrainerStatusEmbbedableId(TrainerStatusEmbbedableId trainerStatusEmbbedableId) {
		this.trainerStatusEmbbedableId = trainerStatusEmbbedableId;
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

	public LocalDate getNominationDate() {
		return nominationDate;
	}

	public void setNominationDate(LocalDate nominationDate) {
		this.nominationDate = nominationDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
}
