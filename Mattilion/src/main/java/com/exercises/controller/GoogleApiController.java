package com.exercises.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;

import com.exercises.dto.City;
import com.exercises.dto.json.GoogleResponseBody;


@Controller
public class GoogleApiController {

	private static final String GOOGLE_API_URL ="https://maps.googleapis.com/maps/api/distancematrix/json?origins=FROM_CITY&destinations=TO_CITY&mode=walking&language=en";
	private static final String RESULT_OK ="It will take TOTAL_TIME to walk from FROM_CITY to TO_CITY.";
	private static final String RESULT_ERROR ="No time available between FROM_CITY and TO_CITY";

	
	public String calculateTimeToTravel(City fromCity, City toCity){
		
		ObjectMapper mapper = new ObjectMapper();
		String result = null;
		String googleUrl = GOOGLE_API_URL.replace("FROM_CITY", parseCity(fromCity));
		googleUrl = googleUrl.replace("TO_CITY", parseCity(toCity));
		try {
			URL url = new URL(googleUrl);
			String response = getResponse( url );
			GoogleResponseBody googleResponseBody = mapper.readValue(response, GoogleResponseBody.class);
			
			String time = googleResponseBody.getTimeToTravel();
			
			if (time != null){
				result = RESULT_OK.replace("FROM_CITY", fromCity.getName());
				result = result.replace("TO_CITY", toCity.getName());
				result = result.replace("TOTAL_TIME", time);

			}else{
				result = RESULT_ERROR.replace("FROM_CITY", fromCity.getName());
				result = result.replace("TO_CITY", toCity.getName());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}


	private String getResponse(URL url ) throws IOException{

		StringBuilder response = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String str = "";

		while (null != (str = br.readLine())) {
			response.append(str);
		}
		System.out.println(response.toString());
		return response.toString();
	}

	private String parseCity(City city){

		StringBuilder builder = new StringBuilder();
		builder.append(city.getName().replace(" ", "+") + "|");
		builder.append(city.getCounty().replace(" ", "+") + "|");
		builder.append(city.getLocation().replace(" ", "+"));

		return builder.toString();
	}

}
