package com.mainapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/inboxurl")
public class InboxPageServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("InboxPageServlet.doGet()");
        
        //get PrintWriter
        PrintWriter pw = res.getWriter();
        
        //set response content type
        res.setContentType("text/html");

        //show Inbox content
        pw.println("<h1 style='color:blue;text-align:center'> Inbox Page content </h1>");
        pw.println("<br>................................<br>");
        pw.println("<br>................................<br>");
        
        pw.println("<br><a href='signouturl'>Logout</a>");
    }//doGet(-,-)

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("InboxPageServlet.doPost()");
        doGet(req, res);
    }//doPost(-,-)

}//class