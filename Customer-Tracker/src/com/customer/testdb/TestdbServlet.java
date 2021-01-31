package com.customer.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestdbServlet")
public class TestdbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user="springstudent";
		String password="springstudent";
		
		String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?userSSL=false";
		String driver="com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out= response.getWriter();
			out.println("Connecting to the database : " + jdbcUrl);
			Class.forName(driver);
			Connection myConn=DriverManager.getConnection(jdbcUrl,user,password);
			out.println("Success!!!");
			
			myConn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
	}

}
