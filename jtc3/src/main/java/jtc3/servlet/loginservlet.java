package jtc3.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.Region;

@WebServlet(name = "hello",urlPatterns = "/myhello.jtc")

public class loginservlet extends HttpServlet {

	//1.collect the data from input 
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name =req.getParameter("sname");
		String pw=req.getParameter("mypassword");
		
	//2.process the request
		
		String msg="";
		if(name.equals(pw)) {
			msg="<h2> Hello "+name+"</h2> <h3> Login success Welcome to JTC</h3>";
			
			//msg=msg+"<h3> Login success Welcome to JTC</h3>";
		}
		else {
			msg=msg+"<h3>Loggin failed </h3>";
		}
		
		//3.send response to client 
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print(msg);
		
	}
	
	
}
