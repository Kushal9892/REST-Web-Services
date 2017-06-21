package com.niit.kushal.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.niit.kushal.rest.messenger.database.DatabaseClass;
import com.niit.kushal.rest.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService() {
		profiles.put("Kushal", new Profile(1L, "Kushal A Majithia", "Kushal", "Majithia"));
	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setProfileID(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public void deleteProfile(String profileName) {
		profiles.remove(profileName);
	}
	
}
