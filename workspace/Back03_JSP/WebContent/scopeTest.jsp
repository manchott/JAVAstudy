<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Scope</h2>
	<%= pageContext %>
	<br>
	<%= request.getContextPath() %>
	<br>
	<!-- url에서 넘겨받는 값을 저장할 수 있다 -->
	<%= request.getParameter("name") %>
	
	<br>
	<a href="gugu.jsp">구구단</a>

</body>
</html>