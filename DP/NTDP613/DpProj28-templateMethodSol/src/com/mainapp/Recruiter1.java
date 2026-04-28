package com.mainapp;

import com.mainapp.factory.HireFresherFactory;
import com.mainapp.recruitment.HireFresher;

public class Recruiter1 {
	
	public static void main(String[] args) {
		HireFresher fresher=HireFresherFactory.getInstance("java");;
		boolean result=fresher.fresherRecruitmentDrive();
		System.out.println("Fresher Recruited: "+result);
	}
}
