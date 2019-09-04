package algorithms.searchingalgorithms.linear;

import logging.ArrayLogger;
import logging.ValueLogger;
import testdata.TestDataGenerator;

public class LinearSearchTest {

	public static void main(String[] args) {

		// Generates list of random values.
		TestDataGenerator generator = new TestDataGenerator();
		int[] somelist = generator.generateRandomNumbers(20, 100);

		// Generates a random value.
		int value = generator.generateRandomValue(100);

		// Prints random list.
		System.out.print("Searched list: ");
		ArrayLogger.log(somelist);

		// Prints searched value.
		ValueLogger.logValue(value);

		// Creates new reference type LinearSearch and links it with object next.
		LinearSearch next = new LinearSearch();
		int answer = next.searchLinearly(somelist, value);
		
		// Prints result of search.
		//TODO - move to logging package 
		if (answer >= 0) {
			System.out.print("Searched value position number:  " + answer);
		} else {
			System.out.print("Searched value is not on the list.");
		}

	}

}
