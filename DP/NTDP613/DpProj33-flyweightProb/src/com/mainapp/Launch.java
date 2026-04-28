package com.mainapp;

import com.mainapp.components.Circle;
import com.mainapp.components.Square;

public class Launch {
	
	public static void main(String[] args) {
		System.out.println("======= Drawing Circle Shape ======");
		for(int i=1;i<=1000;++i) {
			Circle circle=new Circle();
			circle.draw(i+10, "red", "dashed");
		}
		System.out.println("====== Drawing ====== Square ======= Shape ========");
		for(int i=1;i<=1000;++i) {
			Square square=new Square();
			square.draw(i+10, "blue", "dashed");
		}
	}
}
