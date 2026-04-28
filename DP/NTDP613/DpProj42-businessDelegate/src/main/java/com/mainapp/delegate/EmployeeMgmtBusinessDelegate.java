package com.mainapp.delegate;

import com.mainapp.exception.InternalProblemException;
import com.mainapp.vo.EmployeeVo;

public interface EmployeeMgmtBusinessDelegate {
	public String registerEmployee(EmployeeVo vo) throws InternalProblemException;
}
