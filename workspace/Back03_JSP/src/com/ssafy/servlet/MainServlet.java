package com.ssafy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.dto.Person;
import com.ssafy.manager.PersonManager;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet({ "/MainServlet", "/main" })
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "regist":
			doRegist(request, response);
			break;
			
		case "list":
			doList(request, response);
			break;
			
		default:
			break;
		}
	}

	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonManager pm = PersonManager.getInstance();
		
		request.setAttribute("list", pm.getList());
		
		request.getRequestDispatcher("/WEB-INF/list.jsp").forward(request, response);
		
	}

	private void doRegist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name"); 		
		int age = Integer.parseInt(request.getParameter("age")); 		
		String gender = request.getParameter("gender"); 
		String[] hobbies = request.getParameterValues("hobby");
		
		Person p = new Person(name, age, gender, hobbies);
		
		PersonManager pm = PersonManager.getInstance();
		pm.regist(p);
		
		// 요청 객체에 생성한 인스턴스를 집어넣겠다
		request.setAttribute("person", p);
		request.setAttribute("size", pm.getList().size());
		
		// requestDispatcher에서 /를 쓰면 컨텍스트패쓰까지의 경로를 포함한다
//		RequestDispatcher disp = request.getRequestDispatcher("/result.jsp");
//		disp.forward(request, response);
		
		// 컨텍스트패쓰를 줘야한다
		response.sendRedirect("https://www.naver.com");
	}
}
