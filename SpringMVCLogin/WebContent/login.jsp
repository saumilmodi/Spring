<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="LoginCheck" method="post" commandName="LoginCommand">
	<table>
		<tr>
			<td>UserName :</td>
			<td><form:input path="username"/></td>
		</tr>
		
		<tr>
			<td>Password :</td>
			<td><form:password path="password"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit"/></td>
			
		</tr>
	</table>	
	</form:form>
</body>
</html>