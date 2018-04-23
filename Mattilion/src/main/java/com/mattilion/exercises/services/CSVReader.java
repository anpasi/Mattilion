package com.mattilion.exercises.services;

import java.io.InputStream;
import java.util.List;

import com.mattilion.exercises.dto.City;

public interface CSVReader {
	
	/***
	 * 
	 * Get all cities from a csv file
	 * @return
	 */
	List<City> getAllCities(InputStream is);

}
