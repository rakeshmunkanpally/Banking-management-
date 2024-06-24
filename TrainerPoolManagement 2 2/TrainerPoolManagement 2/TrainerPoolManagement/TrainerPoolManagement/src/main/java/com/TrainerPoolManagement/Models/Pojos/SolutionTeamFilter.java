package com.TrainerPoolManagement.Models.Pojos;



public class SolutionTeamFilter {
	private String locationId;
	private String primaryCategoryId;
	private String secondaryCategoryId;
	private String tertiaryCategoryId;
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getPrimaryCategoryId() {
		return primaryCategoryId;
	}
	public void setPrimaryCategoryId(String primaryCategoryId) {
		this.primaryCategoryId = primaryCategoryId;
	}
	public String getSecondaryCategoryId() {
		return secondaryCategoryId;
	}
	public void setSecondaryCategoryId(String secondaryCategoryId) {
		this.secondaryCategoryId = secondaryCategoryId;
	}
	public String getTertiaryCategoryId() {
		return tertiaryCategoryId;
	}
	public void setTertiaryCategoryId(String tertiaryCategoryId) {
		this.tertiaryCategoryId = tertiaryCategoryId;
	}
	public SolutionTeamFilter(String locationId, String primaryCategoryId, String secondaryCategoryId,
			String tertiaryCategoryId) {
		super();
		this.locationId = locationId;
		this.primaryCategoryId = primaryCategoryId;
		this.secondaryCategoryId = secondaryCategoryId;
		this.tertiaryCategoryId = tertiaryCategoryId;
	}
	public SolutionTeamFilter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
