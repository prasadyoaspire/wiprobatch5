<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="register" method="post" modelAttribute="regForm">

		FirstName <form:input path="firstName"/>
		LastName <form:input path="lastName" /> 
		DOB <form:input path="dob" type="date"/>	
		
		<form:input type="submit" value="login"  path=""/>

	</form:form>
</body>
</html>