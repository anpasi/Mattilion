package com.exercises;

import static org.apache.commons.lang3.StringUtils.isEmpty;

public class LocalStringUtils {


	/***
	 * 
	 * Given two Strings check how many differences they have. The method is case sensitive, so 
	 * for example, "D" is different than "d".
	 * 
	 * @param stringOne
	 * @param stringTwo
	 * @return
	 */
	public static int getNumberOfDifferenceBetweenStrings(String stringOne, String stringTwo) throws Exception{

		int numOfDifferences = 0;

		if ( isEmpty(stringOne) || isEmpty(stringTwo)  ){
			throw new Exception("Null strings are not allowed!");
		}

		if (stringOne.length()!=stringTwo.length()){
			throw new Exception("Both string must have the same length!");
		}


		for (int index = 0; index < stringOne.length() ; index++) {
			if (stringOne.charAt(index) != stringTwo.charAt(index)) {
				numOfDifferences++;
			}
		}

		return numOfDifferences;
	}
}
