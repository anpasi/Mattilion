package com.exercises.services.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exercises.dto.City;
import com.exercises.services.CSVReader;

@Service("csvReader")
public class CSVReaderImpl implements CSVReader {

	@Override
	public List<City> getAllCities(InputStream is) {

		List<City> cities = new ArrayList<City>();
		String line;
		City city;
		try (BufferedReader br = new BufferedReader(new  InputStreamReader(is))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] cityDetails = line.split(",");

				city = new City();
				city.setName(cityDetails[0]);
				city.setCounty (cityDetails[1]);
				city.setLocation(cityDetails[2]);

				cities.add(city);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return cities;
	}

}
