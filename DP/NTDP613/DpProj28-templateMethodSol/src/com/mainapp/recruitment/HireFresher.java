package com.mainapp.recruitment;

public abstract class HireFresher {
	public boolean conductAptitudeTest() {
		System.out.println("HireFresher.conductAptitudeTest()");
		return true;
	}
	public boolean conductGdTest() {
		System.out.println("HireFresher.conductGdTest()");
		return true;
	}
	public abstract boolean conductTechnicalWrittenTest();
	public abstract boolean conductTechnicalInterviewTest();
	public boolean conductHrInterviewTest() {
		System.out.println("HireFresher.conductInterviewTest()");
		return true;
	}
	public boolean fresherRecruitmentDrive() {
		boolean result=conductAptitudeTest();
		if(result)
			result=conductGdTest();
		if(result)
			result=conductTechnicalWrittenTest();
		if(result)
			result=conductTechnicalInterviewTest();
		if(result)
			result=conductHrInterviewTest();
		return result;
	}
	
}
