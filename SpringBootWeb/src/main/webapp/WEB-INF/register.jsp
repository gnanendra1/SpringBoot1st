<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="register" modelAttribute="student">
<h1 align="center">***STUDENT REGISTRATION FORM***</h1>
<table align="center" bgcolor="skyblue">
<%-- <tr><th>Student Id</th><td><form:input path="sId"/></td></tr> --%>
<tr><th>Student Name</th><td><form:input path="sName"/></td></tr>
<tr><th>Student Gender</th><td><form:input path="sGender"/></td></tr>
<tr><th>Student PhoneNo</th><td><form:input path="sPhoneNo"/></td></tr>
<tr><th>Student Email</th><td><form:input path="sEmail"/></td></tr>
<tr><td colspan="6" align="center"><input type="submit" value="Register"/> </td></tr>
</table>
</form:form>
</body>
</html>