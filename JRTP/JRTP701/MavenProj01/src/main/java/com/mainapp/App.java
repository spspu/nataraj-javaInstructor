package com.mainapp;

public class App {
	
	public int sum(int x, int y) {
		return x+y;
	}
	
    public static void main(String[] args) {
        App app = new App();
        System.out.println("Two Number Sum = "+app.sum(10, 20));
    }
    
}
