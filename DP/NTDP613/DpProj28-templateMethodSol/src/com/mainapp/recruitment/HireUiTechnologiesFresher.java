package com.mainapp.recruitment;

public class HireUiTechnologiesFresher extends HireFresher{

	@Override
	public boolean conductTechnicalWrittenTest() {
		System.out.println("HireUiTechnogiesFresher.conductTechnicalWrittenTest()[ui]");
		return true;
	}

	@Override
	public boolean conductTechnicalInterviewTest() {
		System.out.println("HireUiTechnogiesFresher.conductTechnicalInterviewTest()[ui]");
		return true;
	}

}
