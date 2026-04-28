package com.mainapp;

import com.mainapp.recruitment.HireDotNetFresher;

public class Recruiter2 {
	
	public static void main(String[] args) {
		HireDotNetFresher dotNetFresher=new HireDotNetFresher();
		boolean flag=true;
		if(!dotNetFresher.conductAptitudeTest())
			flag=false;
		if(!dotNetFresher.conductGdTest())
			flag=false;
		if(!dotNetFresher.conductDotNetWrittenTest())
			flag=false;
		if(!dotNetFresher.conductDotNetTechnicalTest())
			flag=false;
		if(!dotNetFresher.conductHrTest())
			flag=false;
		if(flag)
			System.out.println("dotNet Fresher Recruited");
		else 
			System.out.println("dotNet Fresher not Recruited");
	}
}
