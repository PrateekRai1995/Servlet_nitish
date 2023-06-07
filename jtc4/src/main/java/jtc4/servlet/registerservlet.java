package jtc4.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="hello" , urlPatterns="/myregister.jtc")

public class registerservlet extends HttpServlet {

	//private ServletRequest req;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		//1.collect the data from input 
		String fname  =req.getParameter("fname");
		String email  =req.getParameter("email");
		String phone  =req.getParameter("phone");
		String gender  =req.getParameter("gender");
		String course[] =req.getParameterValues("mycourse");
		String  timing =req.getParameter("timing");
		String remark  =req.getParameter("remarks");
		
		//2.Process
		System.out.println(fname);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(gender);
		System.out.println(timing);
		System.out.println(remark);
		for(String c: course) {
			System.out.println(c);
		}

       //3.print response 
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println(fname+"<br>");
		out.println(email+"<br>");
		out.println(phone+"<br>");
		out.println(gender+"<br>");
		out.println(timing+"<br>");
		out.println(remark+"<br>");
		for(String c: course) {
			out.println(c+"<br>");
		}
		
	}
	
	
	
}
