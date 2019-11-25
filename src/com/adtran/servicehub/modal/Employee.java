package com.adtran.servicehub.modal;

import java.util.Date;

/**
 * @author skoduri
 *
 */
public class Employee {

	private String id;
	private String corpId;
	private String firstName;
	private String lastName;
	private String accessCardNumber;
	private Date joiningDate;
	private Date lastWorkingDate;
	private String phoneNumber;
	private String voip;
	private String emergencyContactNumber;
	private String workStationNumber;
	private String emailId;
	private String bloodGroup;
	private String department;
	private String teamName;
	private Date dob;
	private int floorNumber;
	private boolean twoWheelerParkingOpted;
	private String twoWheelerNumber;
	private boolean fourWheelerParkingOpted;
	private String fourWheelerNumber;
	private String managerId;
	private String permanentAddressPinCode;
	private String permanentAddress;
	private String temporaryAddressPinCode;
	private String temporaryAddress;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCorpId() {
		return corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccessCardNumber() {
		return accessCardNumber;
	}
	public void setAccessCardNumber(String accessCardNumber) {
		this.accessCardNumber = accessCardNumber;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Date getLastWorkingDate() {
		return lastWorkingDate;
	}
	public void setLastWorkingDate(Date lastWorkingDate) {
		this.lastWorkingDate = lastWorkingDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getVoip() {
		return voip;
	}
	public void setVoip(String voip) {
		this.voip = voip;
	}
	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}
	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}
	public String getWorkStationNumber() {
		return workStationNumber;
	}
	public void setWorkStationNumber(String workStationNumber) {
		this.workStationNumber = workStationNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public boolean isTwoWheelerParkingOpted() {
		return twoWheelerParkingOpted;
	}
	public void setTwoWheelerParkingOpted(boolean twoWheelerParkingOpted) {
		this.twoWheelerParkingOpted = twoWheelerParkingOpted;
	}
	public String getTwoWheelerNumber() {
		return twoWheelerNumber;
	}
	public void setTwoWheelerNumber(String twoWheelerNumber) {
		this.twoWheelerNumber = twoWheelerNumber;
	}
	public boolean isFourWheelerParkingOpted() {
		return fourWheelerParkingOpted;
	}
	public void setFourWheelerParkingOpted(boolean fourWheelerParkingOpted) {
		this.fourWheelerParkingOpted = fourWheelerParkingOpted;
	}
	public String getFourWheelerNumber() {
		return fourWheelerNumber;
	}
	public void setFourWheelerNumber(String fourWheelerNumber) {
		this.fourWheelerNumber = fourWheelerNumber;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getPermanentAddressPinCode() {
		return permanentAddressPinCode;
	}
	public void setPermanentAddressPinCode(String permanentAddressPinCode) {
		this.permanentAddressPinCode = permanentAddressPinCode;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getTemporaryAddressPinCode() {
		return temporaryAddressPinCode;
	}
	public void setTemporaryAddressPinCode(String temporaryAddressPinCode) {
		this.temporaryAddressPinCode = temporaryAddressPinCode;
	}
	public String getTemporaryAddress() {
		return temporaryAddress;
	}
	public void setTemporaryAddress(String temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", corpId=" + corpId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", accessCardNumber=" + accessCardNumber + ", joiningDate=" + joiningDate + ", lastWorkingDate="
				+ lastWorkingDate + ", phoneNumber=" + phoneNumber + ", voip=" + voip + ", emergencyContactNumber="
				+ emergencyContactNumber + ", workStationNumber=" + workStationNumber + ", emailId=" + emailId
				+ ", bloodGroup=" + bloodGroup + ", department=" + department + ", teamName=" + teamName + ", dob="
				+ dob + ", floorNumber=" + floorNumber + ", twoWheelerParkingOpted=" + twoWheelerParkingOpted
				+ ", twoWheelerNumber=" + twoWheelerNumber + ", fourWheelerParkingOpted=" + fourWheelerParkingOpted
				+ ", fourWheelerNumber=" + fourWheelerNumber + ", managerId=" + managerId + ", permanentAddressPinCode="
				+ permanentAddressPinCode + ", permanentAddress=" + permanentAddress + ", temporaryAddressPinCode="
				+ temporaryAddressPinCode + ", temporaryAddress=" + temporaryAddress + "]";
	}
	
	
}
