package com.jtc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Annotation Syntax type
@WebServlet(name="hello",urlPatterns = "/myhello.jtc")


public class loginservlet   extends HttpServlet {

	public void init(ServletConfig Sc) {}
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//1.Collect input data
	String name=	req.getParameter("sname");

		
		//2.process the request
		String msg="<h2> Hello "+name+"</h2>";
		
		msg= msg +"<h3>Welcome to JTC</h3>";
		
		//3.send Response back to client 
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print(msg);
		
	}
	public void destroy() {}
}
