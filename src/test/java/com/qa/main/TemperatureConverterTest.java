package com.qa.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
	TemperatureConverter tc = new TemperatureConverter();
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Test");
	}
	
	@Test
	public void convertFahrenheitToCelsiusTest () {
		float result = tc.convertFahrenheitToCelsius(18);
		
		assertEquals(tc.convertFahrenheitToCelsius(18), result);
	} 
	
	@Test
	public void convertCelsiusToFahrenheitTest() {
		float result = tc.convertCelsiusToFahrenheit(35);
		
		assertEquals(tc.convertCelsiusToFahrenheit(35), result);
	}
	
	@Test
	public void convertKelvinToCelsiusTest() {
		float result = tc.convertKelvinToCelsius(458);
		
		assertEquals(tc.convertKelvinToCelsius(458), result);
	}
	
	@Test
	public void convertCelsiusToKelvinTest() {
		float result = tc.convertCelsiusToKelvin(29);
		
		assertEquals(tc.convertCelsiusToKelvin(29), result);
	}
	
	public void convertKelvinToFahrenheitTest() {
		float result = tc.convertKelvinToFahrenheit(490);
		
		assertEquals(tc.convertKelvinToFahrenheit(490), result);
	}
	
	public void convertFahrenheitToKelvinTest() {
		float result = tc.convertFahrenheitToKelvin(86);
		
		assertEquals(tc.convertFahrenheitToKelvin(86), result);
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After test");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After all");
	}


}
