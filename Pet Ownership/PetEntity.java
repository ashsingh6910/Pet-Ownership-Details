package com.cg.pod.entity;

public class PetEntity 
{
	private String ownerName;
	private long ownerPhNo;
	private int ownerAge;
	private String vaccineDate;
	private String petType;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public long getOwnerPhNo() {
		return ownerPhNo;
	}
	public void setOwnerPhNo(long ownerPhNo) {
		this.ownerPhNo = ownerPhNo;
	}
	public int getOwnerAge() {
		return ownerAge;
	}
	public void setOwnerAge(int ownerAge) {
		this.ownerAge = ownerAge;
	}
	public String getVaccineDate() {
		return vaccineDate;
	}
	public void setVaccineDate(String vaccineDate) {
		this.vaccineDate = vaccineDate;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	
}
