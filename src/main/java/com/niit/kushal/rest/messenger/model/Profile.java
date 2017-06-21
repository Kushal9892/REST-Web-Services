package com.niit.kushal.rest.messenger.model;

import java.util.Date;

public class Profile {
	
	private long profileID;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date profileCreated;

	
	public Profile(long profileID, String profileName, String firstName, String lastName) {
		this.profileID = profileID;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profileCreated = new Date();
	}
	public long getProfileID() {
		return profileID;
	}
	public void setProfileID(long profileID) {
		this.profileID = profileID;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
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
	public Date getProfileCreated() {
		return profileCreated;
	}
	public void setProfileCreated(Date profileCreated) {
		this.profileCreated = profileCreated;
	}
	
	
}
