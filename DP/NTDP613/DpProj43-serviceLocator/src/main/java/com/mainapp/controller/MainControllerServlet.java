package com.mainapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mainapp.delegate.IUpStoxStockMgmtBusinessDelegate;
import com.mainapp.delegate.UpstoxStockMgmtBusinessDelegateImpl;
import com.mainapp.dto.StockDetailsDTO;
import com.mainapp.exception.InternalProblemException;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	 IUpStoxStockMgmtBusinessDelegate delegate; 
	@Override
	public void init() throws ServletException {
	    delegate=new UpstoxStockMgmtBusinessDelegateImpl();
	}
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
         //read form data
		String stockName=req.getParameter("stockName");
		//use BusinessDelegate
		try {
			StockDetailsDTO dto=delegate.fetchStockDetailsByName(stockName);
			//keep result in request scope
			req.setAttribute("result",dto);
			//forward to show_stock_details.jsp
			RequestDispatcher rd=req.getRequestDispatcher("/show_stock_details.jsp");
			rd.forward(req, res);
		}
		catch(InternalProblemException ipe) {
			ipe.printStackTrace();
			req.setAttribute("errMsg",ipe.getMessage());
			RequestDispatcher rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req, res);
		}
		catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg",e.getMessage());
			RequestDispatcher rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req, res);
		}
		
		
	}//doGet(-,-)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
         doGet(req,res);
	}//doPost(-,-)
	
	@Override
	public void destroy() {
	  delegate=null;
	}

}