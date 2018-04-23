package com.mattilion.exercises.dto;

/***
 * 
 * DTO with the detalls of a city
 * @author Antonio
 *
 */
public class City {

	private String name;

	private String county;

	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String toString(){
		
		return this.name + "," + this.county + ", " + this.location;
	}
}
