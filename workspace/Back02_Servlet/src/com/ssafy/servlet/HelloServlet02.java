package com.ssafy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet02
 */
@WebServlet("/HelloServlet02")
public class HelloServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글을 읽기 위한 UTF8
		response.setContentType("text/html; charset=UTF8");
		
		PrintWriter writer = response.getWriter();
		
		writer.append("<html>");
		writer.append("<head>");
		writer.append("<title>Hello</title>");
		writer.append("</head>");
		writer.append("<body>");
		writer.append("<h1>Hello Servlet!</h1>");
		writer.append("<h1>안녕하세요!</h1>");
		writer.append("</body>");
		writer.append("<html>");
	}

}
