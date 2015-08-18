<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	<form:form method="post" commandName="UserCommand">
 		<table>
 			<tr>	
 				<td>Username :</td>
 				<td><form:input path="name"/></td>
 			</tr>
 			
 			<tr>	
 				<td>Password :</td>
 				<td><form:password path="password"/></td>
 			</tr>
 			
 			<tr>	
 				<td>Age :</td>
 				<td><form:input path="age"/></td>
 			</tr>
 			
 				<tr>
					<td>Gender: </td>
					<td><form:radiobuttons path="gender" items="${glist}" /></td>	
				</tr>
				<tr>			
					<td>Hobbies: </td>
					<td><form:select multiple="true" path="hobby">
							<form:options items="${hlist}" />
						</form:select></td>
				</tr>
				<tr>		
					<td>Technology:</td>
					<td><form:checkboxes path="technologies" items="${tlist}" />	</td>
				</tr>
				
 			<tr>	
 				<td>Address :</td>
 				<td><form:textarea path="address"/></td>
 			</tr>
 			
 			<tr>
 				<td><input type="submit" value="Submit"/></td>
 				<td><input type="reset" value="Clear"/></td>
 			</tr>
 			
 		</table>
 	
 	</form:form>
</body>
</html>