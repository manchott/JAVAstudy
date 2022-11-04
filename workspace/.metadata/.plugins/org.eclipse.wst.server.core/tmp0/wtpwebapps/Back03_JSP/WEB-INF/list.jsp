<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.ssafy.dto.Person" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>인간목록</h2>
	<%
		ArrayList<Person> list = (ArrayList<Person>) request.getAttribute("list");
	for(int i = 0; i < list.size(); i++){
		out.print(list.get(i).getName());
	}
	
	%>
</body>
</html>