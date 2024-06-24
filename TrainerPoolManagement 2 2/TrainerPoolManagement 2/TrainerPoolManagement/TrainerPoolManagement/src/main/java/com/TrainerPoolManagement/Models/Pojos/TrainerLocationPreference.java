package com.TrainerPoolManagement.Models.Pojos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tblTrainer_Location_Preference")
public class TrainerLocationPreference {

	@EmbeddedId
	private TrainerLocationEmbeddableId trainerLocationEmbeddableId;
	public TrainerLocationPreference() {
		// TODO Auto-generated constructor stub
	}
	public TrainerLocationPreference(TrainerLocationEmbeddableId trainerLocationEmbeddableId) {
		super();
		this.trainerLocationEmbeddableId = trainerLocationEmbeddableId;
	}
	public TrainerLocationEmbeddableId getTrainerLocationEmbeddableId() {
		return trainerLocationEmbeddableId;
	}
	public void setTrainerLocationEmbeddableId(TrainerLocationEmbeddableId trainerLocationEmbeddableId) {
		this.trainerLocationEmbeddableId = trainerLocationEmbeddableId;
	}

	
}
