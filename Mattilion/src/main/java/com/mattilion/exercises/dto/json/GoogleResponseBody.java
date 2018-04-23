package com.mattilion.exercises.dto.json;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class GoogleResponseBody {
	
	private String status;
	
	@JsonProperty("destination_addresses")
	private  List<String> destinationAddresses;
	
	@JsonProperty("origin_addresses")
	private List<String> originAddresses;
	
	private List<LinkedHashMap> rows;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public  List<String> getDestinationAddresses() {
		return destinationAddresses;
	}

	public void setDestinationAddresses( List<String> destinationAddresses) {
		this.destinationAddresses = destinationAddresses;
	}

	public List<String>  getOriginAddresses() {
		return originAddresses;
	}

	public void setOriginAddresses(List<String>  originAddresses) {
		this.originAddresses = originAddresses;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	
	public String getTimeToTravel(){
		
		String totalTime = null;
		
		for (LinkedHashMap linkMap: rows){
			Iterator iter = linkMap.keySet().iterator();
			while(iter.hasNext()){
				List<LinkedHashMap> subList =  (List<LinkedHashMap>) linkMap.get(iter.next());
				for (LinkedHashMap linkElements: subList)
				if ( linkElements.containsKey("duration")){
					//Duration is a linkHashMap that contains the field text with the value
					LinkedHashMap duration = (LinkedHashMap) linkElements.get("duration");
					String text = (String) duration.get("text");
					if (text != null){	
						return text;
					}
				}
			}
			
		}
		
		return totalTime;
	}
	
}
