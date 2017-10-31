package com.teaminternational.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teaminternational.HelloWorldGenerator;

public class NewServlet extends BaseHttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
		HelloWorldGenerator hellowWorldGenerator = getBean(HelloWorldGenerator.COMPONENT_NAME);
		hellowWorldGenerator.sayHello();
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hola</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"white\">");
		out.println(hellowWorldGenerator.sayHello());
		out.println("</body>");
		out.println("</html>");
		
	}

}
