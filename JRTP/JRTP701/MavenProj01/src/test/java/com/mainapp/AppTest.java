package com.mainapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	
    @Test
    public void testWithPositivesValues() {
    	
    	int a=10;
    	int b=20;
    	int expected=30;
    	App app = new App();
    	int actual = app.sum(a, b);
    	
    	assertEquals(expected,actual);
    }
    
    @Test
    public void testWithNegativesValues() {
    	
    	int a=-10;
    	int b=-20;
    	int expected=-30;
    	App app = new App();
    	int actual = app.sum(a, b);
    	
    	assertEquals(expected,actual);
    }
    
    @Test
    public void testWithMixedValues() {
    	
    	int a=10;
    	int b=-20;
    	int expected=-10;
    	App app = new App();
    	int actual = app.sum(a, b);
    	
        assertEquals(expected,actual);
    }
    
    
}
