package com.mainapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest{
	
	private static CalculatorService service;
	
	@BeforeAll
	public static void setupOnce() {
		service=new CalculatorService();
	}
	
	@Test
	public void testAndWithPositive() {
//		CalculatorService service = new CalculatorService();
		int actual=service.add(10,20);
		int expected=30;
		assertEquals(expected,actual);
	}
    
	@Test
	public void testAndWithNegative() {
//		CalculatorService service = new CalculatorService();
		int actual=service.add(-10,-20);
		int expected=-30;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testAndWithZeros() {
//		CalculatorService service = new CalculatorService();
		int actual=service.add(0,0);
		int expected=0;
		assertEquals(expected,actual);
	}
    
	@Test
	public void testMulWithPositive() {
//		CalculatorService service = new CalculatorService();
		int actual=service.mul(10,20);
		int expected=200;
		assertEquals(expected,actual);
	}
    
	@Test
	public void testMulWithNegative() {
//		CalculatorService service = new CalculatorService();
		int actual=service.mul(-10,-20);
		int expected=200;
		assertEquals(expected,actual);
	}
    
	@Test
	public void testMulWithMixed() {
//		CalculatorService service = new CalculatorService();
		int actual=service.mul(10,-20);
		int expected=-200;
		assertEquals(expected,actual);
	}
    
	@AfterAll
	public static void tearDownOnce() {
		service=null;
	}
    
}
