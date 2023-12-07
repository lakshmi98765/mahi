package com.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	ServletContext ctx = getServletContext();
	String city =ctx.getInitParameter("city");
	String st =ctx.getInitParameter("state");
	out.println("Servlet1:"+city+"state:"+st);
	String data =city+"state"+st;
	ctx.setAttribute("info",data);
	ServletConfig cfg = getServletConfig();
	String user = cfg.getInitParameter("user");
	out.println("< href = 'Servlet2'>nextpage</a>");
	
	}

}
