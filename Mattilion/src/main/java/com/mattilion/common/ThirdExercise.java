package com.mattilion.common;

import java.io.InputStream;
import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mattilion.exercises.controller.GoogleApiController;
import com.mattilion.exercises.dto.City;
import com.mattilion.exercises.services.CSVReader;

public class ThirdExercise {
	
	public static void main(String[] args) throws Exception{ 
		
		ApplicationContext appContext = 
				new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		CSVReader csvReader = (CSVReader)appContext.getBean("csvReader");

		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		List<City> cities = csvReader.getAllCities(classloader.getResourceAsStream("test_three.csv"));
		
		if (cities.size()<2){
			throw new Exception("There is not enough number of cities");
		}
		
		Random randomObj = new Random();
		int randomNumFrom = randomObj.nextInt((cities.size()));
		
		City fromCity = cities.get(randomNumFrom);
		
		int randomNumTo = randomObj.nextInt((cities.size()));
		while (randomNumTo==randomNumFrom ){
			randomNumTo = randomObj.nextInt((cities.size()));
		}
		City toCity = cities.get(randomNumTo);
		
		GoogleApiController googleApi = new GoogleApiController();
		String time = googleApi.calculateTimeToTravel(fromCity,  toCity);
		
		System.out.println(time);
		
	}

}
