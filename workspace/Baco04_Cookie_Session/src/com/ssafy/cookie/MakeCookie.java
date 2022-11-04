package com.ssafy.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/make")
public class MakeCookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		
		// 쿠키를 생성하자
		Cookie cookie = new Cookie(key, value);
		
		// 유효시간은 초단위
		cookie.setMaxAge(60);
		
		// 직접 지우기
		// cookie.setMaxAge(0);
		
		response.addCookie(cookie);
		
		response.sendRedirect("cookie1.jsp");
	}

}
