package com.TrainerPoolManagement.Models.Pojos;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class TrainerLocationEmbeddableId {

	@ManyToOne
	@JoinColumn(name="TrainerId")
	private Associate associate;
	@ManyToOne
	@JoinColumn(name="LocationID")
	private Location location;
	public TrainerLocationEmbeddableId() {
		// TODO Auto-generated constructor stub
	}
	public TrainerLocationEmbeddableId(Associate associate, Location location) {
		super();
		this.associate = associate;
		this.location = location;
	}
	public Associate getAssociate() {
		return associate;
	}
	public void setAssociate(Associate associate) {
		this.associate = associate;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	
}
