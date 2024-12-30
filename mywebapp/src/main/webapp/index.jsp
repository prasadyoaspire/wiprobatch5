<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>First Jsp</h2>

<!-- Delcaration -->
<%!
int cube(int n) {
	return n*n*n;
}
%>

<!-- scriptlet -->
<%
  int a = 10;
  int b = 20;
  int c = a+b;
  /*   out.println("<h3>Sum: "+c+"</h3>"); */
%>

<!-- expression -->
<h2> Sum : <%= c %> </h2>
<h4> Result:  <%= 2*2*2 %></h4>
<h1> Cube of a Number : <%= cube(3) %> </h1>
</body>
</html>