package com.mainapp;

public class Launch_MultiThreaded {
	
	public static void main(String[] args) {
		TicketBookingOperation operation=new TicketBookingOperation();
		Thread th1=new Thread(operation);
		Thread th2=new Thread(operation);
		Thread th3=new Thread(operation);
		
		th1.start();
		th2.start();
		try {
			Thread.sleep(20000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		th3.start();
	}
}
