package com.mainapp.components;

public class Square implements Shape{
	private String label;
	public Square() {
		System.out.println("Square:: 0-param constructor");
		label="square";
	}
	@Override
	public void draw(int sideLength, String fillColor, String lineStyle) {
		System.out.println("drawing square with side length:: "+sideLength+" having fillColor:: "+fillColor+" and line style:: "+lineStyle);
	}
}
