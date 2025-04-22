package com.Web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyFirstAppInServlets")
public class MyFirstAppInServlets extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
			PrintWriter pw = res.getWriter();
			pw.println("<!DOCTYPE html>");
			pw.println("<html>");
			pw.println("<head><title>GREETINGS FOR THE WEB APP</title></head>");
			pw.println("<body>");
			pw.println("<h1 style='color:green'>HELLO WORLD 11</h1>");
			pw.println("</body></html>");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
