package jtc5;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "hello",urlPatterns = "/hello.jtc",loadOnStartup = 2,initParams = {@WebInitParam(name="email1",value="nitish@gmail.com")})
public class helloservlet extends HttpServlet{

	public void init(ServletConfig config) {
		System.out.println("Init in helloservlet");
		
	}
	
	public void service(HttpServletRequest req,HttpServletResponse res) {
		System.out.println("Service in helloservlet");
	}
	 
	public void destroy() {
		System.out.println("destroy in helloservlet");
	}
	
}
