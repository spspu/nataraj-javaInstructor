package com.mainapp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter("/inboxurl")
public class InvalidSessionCheckFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req,
                         ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {

        System.out.println("InvalidSessionCheckFilter.doFilter()");

        HttpSession ses = ((HttpServletRequest) req).getSession(false);

        if (ses != null && ses.getAttribute("userDetails") != null) {
            chain.doFilter(req, res);
        }
        else {
            req.setAttribute("errorMsg", "you need sign-In First");

            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            rd.forward(req, res);
        }
    }
}