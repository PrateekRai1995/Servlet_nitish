                                                                                                         package jtc6;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name="demo",urlPatterns = "/mydemo.jtc")

public class demoservlet  extends HttpServlet{

	public void init(ServletConfig config) {//run only once work to inatilize object of classes
		System.out.println("init in demoservlet");
	String email	=config.getInitParameter("email");
	String city	=config.getInitParameter("city");
	System.out.println(email);
	System.out.println(city);
	
	
	System.out.println("Another method of calling init method is");
	Enumeration<String> enms1=config.getInitParameterNames();
	List<String> configparam=Collections.list(enms1);
	for(String configname:configparam) {
		String pvalue=config.getInitParameter(configname);
		System.out.println(configname+"		"+pvalue);
	}
	
	
	System.out.println("Now deal with context parametr deatil ");
	ServletContext ctx=config.getServletContext();// It is same for all servlet
	String state=ctx.getInitParameter("state");
	String institute=ctx.getInitParameter("institute");
	String country=ctx.getInitParameter("country");
	
	System.out.println(state);
	System.out.println(institute);
	System.out.println(country);
	
	System.out.println("******Enumeration method ");
	Enumeration<String>enms2=ctx.getInitParameterNames();
	List<String> ctxparamList=Collections.list(enms2);
	for(String pname:ctxparamList) {
		String pvalueString=ctx.getInitParameter(pname);
		System.out.println(pname+"       "+pvalueString);
	}
	
	}
	public void service(HttpServletRequest req,HttpServletResponse res) {
		System.out.println("1.service in demoservlet");
		//1.collect the request parameter
		String fname=req.getParameter("fname");
		String phone=req.getParameter("phone");
		System.out.println(fname);
		System.out.println(phone);
		
	   System.out.println("2.Now we are trying to data receive by another method");
	   Enumeration<String> enms=req.getParameterNames();
	   List<String>paramnam=Collections.list(enms);
	   for(String pname:paramnam) {
		   String values=req.getParameter(pname);
		   System.out.println(pname+" "+values);
	   }
	   
	   System.out.println("3.another method of also is "); 
	   Map<String, String[]> paramMap = req.getParameterMap();
	   Set<String> paramname2=paramMap.keySet();
	   for(String pname:paramname2) {
		  String pvalues[]= paramMap.get(pname);
		
		  System.out.println(pname+"    "+pvalues[0]);
	   }
	   
	   
	   System.out.println("config parameter ");
	   System.out.println("Now we have to access the config parameter data");
	  
	   
	   
	}
	public void destroy() {
		System.out.println("destroy in demoservle");
	}
	
}
