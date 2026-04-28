package com.mainapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginurl")
public class LoginCheckServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String un = req.getParameter("uname");
        String pwd = req.getParameter("pwd");

        UserDetails details = new UserDetails();
        details.setUsername(un);
        details.setPassword(pwd);

        if (un != null && pwd != null && un.equalsIgnoreCase("raja") && pwd.equalsIgnoreCase("rani")) {

            HttpSession ses = req.getSession(true);
            ses.setAttribute("userDetails", details);

            RequestDispatcher rd = req.getRequestDispatcher("/inboxurl");
            rd.forward(req, res);
        }
        else {
            req.setAttribute("errorMsg", "Invalid Credentials");

            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            rd.forward(req, res);
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}