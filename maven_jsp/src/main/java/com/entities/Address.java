package com.entities;

public class Address extends IdEntity {
	private String city;
	private String country;
	private long userId;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", userId=" + userId + ", id=" + id + "]";
	}
	
}
