package com.TrainerPoolManagement.Models.Pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblLocationTable")
public class Location {
	@Id
	@Column(name = "LocationID", length = 12)
	private String locationId;
	@Column(name = "LocationName", length = 40, nullable = false)
	private String locationName;

	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location(String locationId, String locationName) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
