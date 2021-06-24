package com.exercises;

import static com.exercises.LocalStringUtils.getNumberOfDifferenceBetweenStrings;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;


/**
 * Unit test for simple App.
 */
@RunWith(DataProviderRunner.class)
public class StringUtilsTest 
{

	@Test
	public void testExceptionWithNullValues() throws Exception {
		
		try {
			//When
			getNumberOfDifferenceBetweenStrings(null,  null);
			fail();
		} catch (Exception expected) {
			//Then
			assertEquals("Null strings are not allowed!", expected.getMessage());
		}
	}
		
	
	@Test
	public void testExceptionWithDifferentLengths() throws Exception {
		
		final String stringWithLengthFive = "ABCDE";
		final String stringWithLengthSix = "ABCDEF";
		
		try {
			//When
			getNumberOfDifferenceBetweenStrings(stringWithLengthFive,  stringWithLengthSix);
			fail();
		} catch (Exception expected) {
			//Then
			assertEquals("Both string must have the same length!", expected.getMessage());
		}
	}
	
	@DataProvider
	public static Object[][] pairOfStringAndExpectedResult() {
		return new Object[][] { 
				{"Test1", "Test1", 0}, 
				{"Test1", "AAAAA", 5}, 
				{"D23W8MCCIZQOP9", "D236862CEZQOPS", 5}, 
				{"11111", "22221", 4}
		};
	}
    
    
    @Test
    @UseDataProvider("pairOfStringAndExpectedResult")
	public void test(String firstString, String secondString, int expectedNumberOfDifferences) throws Exception {
    	//When
    	int differences = getNumberOfDifferenceBetweenStrings(firstString,  secondString);
    	//Then
    	assertEquals(differences, expectedNumberOfDifferences);
	}

}
