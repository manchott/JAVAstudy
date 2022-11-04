<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>현재 내 브라우저에 있는 쿠키 정보</h2>
	<hr>
	<%
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(Cookie c : cookies){
				String key = c.getName();
				String value = c.getValue();
				%>
				<h3><%=key %>:<%=value %></h3>
				<%
			}
		} else{
			out.print("쿠키 없음");
		}
	
	
	%>
	<h2>쿠키설정</h2>
	<form action="make" method="get">
		이름: <input type="text" name="key"> <br>
		값: <input type="text" name="value"> <br>
		<input type="submit" value="쿠키생성">
		
	</form>

</body>
</html>