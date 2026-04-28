package com.mainapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mainapp.delegate.EmployeeMgmtBusinessDelegate;
import com.mainapp.delegate.EmployeeMgmtBusinessDelegateImpl;
import com.mainapp.exception.InternalProblemException;
import com.mainapp.vo.EmployeeVo;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	private   EmployeeMgmtBusinessDelegate delegate;
	@Override
	public void init() throws ServletException {
	    delegate=new EmployeeMgmtBusinessDelegateImpl();
	}
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//read form data and  store into EmployeeVO class object
		  EmployeeVo evo=new  EmployeeVo();
		  evo.setEname(req.getParameter("ename"));
		  evo.setDesg(req.getParameter("desg"));
		  evo.setAddrs(req.getParameter("eadd"));
		  evo.setSalary(req.getParameter("salary"));
		  // invoke  b.method of  BusinessDelegate
		  try {
			  String result=delegate.registerEmployee(evo);
			  // keep result in request scope
			  req.setAttribute("resultMsg", result);
			  //forward request to  show_result.jsp
			  RequestDispatcher rd=req.getRequestDispatcher("/show_result.jsp");
			  rd.forward(req,res);
		  }
		  catch(InternalProblemException ipe) {
			// keep error in request scope
			  req.setAttribute("errMsg",ipe.getMessage());
			  //forward request to  error.jsp
			  RequestDispatcher rd=req.getRequestDispatcher("/error.jsp");
			  rd.forward(req,res);
		  }
		  catch(Exception e) {
				// keep error in request scope
			  req.setAttribute("errMsg",e.getMessage());
			  //forward request to  error.jsp
			  RequestDispatcher rd=req.getRequestDispatcher("/error.jsp");
			  rd.forward(req,res);

		  }
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	
	@Override
	public void destroy() {
	   delegate=null;
	}

}