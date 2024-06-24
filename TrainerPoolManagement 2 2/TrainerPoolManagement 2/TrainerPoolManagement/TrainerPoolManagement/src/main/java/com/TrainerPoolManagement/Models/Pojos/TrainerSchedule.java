package com.TrainerPoolManagement.Models.Pojos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tblTrainer_Schedule")
public class TrainerSchedule {

	@EmbeddedId
	private TrainerScheduleEmbeddableId trainerScheduleEmbeddableId;
	@Column(name="End_Date")
	private LocalDate endDate;
	@OneToOne
	@JoinColumn(name="LocationId")
	private Location location;

	
	public TrainerSchedule() {
		// TODO Auto-generated constructor stub
	}




	public TrainerSchedule(TrainerScheduleEmbeddableId trainerScheduleEmbeddableId, LocalDate endDate,
			Location location) {
		super();
		this.trainerScheduleEmbeddableId = trainerScheduleEmbeddableId;
		this.endDate = endDate;
		this.location = location;
	}




	public TrainerScheduleEmbeddableId getTrainerScheduleEmbeddableId() {
		return trainerScheduleEmbeddableId;
	}


	public void setTrainerScheduleEmbeddableId(TrainerScheduleEmbeddableId trainerScheduleEmbeddableId) {
		this.trainerScheduleEmbeddableId = trainerScheduleEmbeddableId;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}



	
}
