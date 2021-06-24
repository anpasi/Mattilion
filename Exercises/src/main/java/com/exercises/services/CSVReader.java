package com.exercises.services;

import java.io.InputStream;
import java.util.List;

import com.exercises.dto.City;

public interface CSVReader {
	
	/***
	 * 
	 * Get all cities from a csv file
	 * @return
	 */
	List<City> getAllCities(InputStream is);

}
