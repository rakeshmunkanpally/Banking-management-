package com.techwave.controllers.models.DTO;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public class location {

	@NotBlank(message = "*")
	private String locationId;
	@NotBlank(message = "*")
	private String primaryCategoryId;
	
	private String secondaryCategoryId;
	
	private String tertiaryCategoryId;
	
	private LocalDate FromDate;
		private LocalDate ToDate;
		public location() {
			super();
			// TODO Auto-generated constructor stub
		}
		public location(@NotBlank(message = "*") String locationId, @NotBlank(message = "*") String primaryCategoryId,
				String secondaryCategoryId, String tertiaryCategoryId,
				LocalDate fromDate, LocalDate toDate) {
			super();
			this.locationId = locationId;
			this.primaryCategoryId = primaryCategoryId;
			this.secondaryCategoryId = secondaryCategoryId;
			this.tertiaryCategoryId = tertiaryCategoryId;
			FromDate = fromDate;
			ToDate = toDate;
		}
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
		public LocalDate getFromDate() {
			return FromDate;
		}
		public void setFromDate(LocalDate fromDate) {
			FromDate = fromDate;
		}
		public LocalDate getToDate() {
			return ToDate;
		}
		public void setToDate(LocalDate toDate) {
			ToDate = toDate;
		}
		
		
	
	
	
	

}
