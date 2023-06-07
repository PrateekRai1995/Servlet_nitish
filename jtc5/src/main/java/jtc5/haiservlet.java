package jtc5;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "hai",urlPatterns = "/hai.jtc",loadOnStartup = 1 ,initParams = {@WebInitParam(name="email",value="123n@gmail.com")})
public class haiservlet extends HttpServlet {

	public void init(ServletConfig config) {
		System.out.println("init in haiservlet");
	}
	
	public void service( HttpServletRequest req,HttpServletResponse res) {
		System.out.println("service in haiservlet");
	}
	
	public void destroy() {
		System.out.println("destroy in haiservlet ");
	}
}
