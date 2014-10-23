package com.vizuri.vizangular.domain;

import org.jongo.marshall.jackson.oid.Id;
import org.jongo.marshall.jackson.oid.ObjectId;

public class Member {
	
	@Id @ObjectId
	private String key;
	private String name;
	private String shortname;
	private String reknown;
	private String bio;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortname() {
		return shortname;
	}
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	public String getReknown() {
		return reknown;
	}
	public void setReknown(String reknown) {
		this.reknown = reknown;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	@Override
	public String toString() {
		return "Member [key=" + key + ", name=" + name + ", shortname="
				+ shortname + ", reknown=" + reknown + ", bio=" + bio + "]";
	}

}
