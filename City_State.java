package com.surya.beans;

public class City_State {
	public String state;
	public String city;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public City_State(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}

}
