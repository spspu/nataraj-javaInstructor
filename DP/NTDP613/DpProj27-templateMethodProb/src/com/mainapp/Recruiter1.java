package com.mainapp;

import com.mainapp.recruitment.HireJavaFresher;

public class Recruiter1 {
	
	public static void main(String[] args) {
		HireJavaFresher javaFresher=new HireJavaFresher();
		boolean flag=true;
		if(!javaFresher.conductAptitudeTest())
			flag=false;
		if(!javaFresher.conductGdTest())
			flag=false;
		if(!javaFresher.conductWrittenTest())
			flag=false;
		if(!javaFresher.conductTechnicalTest())
			flag=false;
		if(!javaFresher.conductHrTest())
			flag=false;
		if(flag)
			System.out.println("Java Fresher Recruited");
		else 
			System.out.println("Java Fresher not Recruited");
	}
}
