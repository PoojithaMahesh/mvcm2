<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="edit" modelAttribute="student">
Id<form:input path="id" readonly="true"/>
Name<form:input path="name"/>
Address<form:input path="address"/>
Phone<form:input path="phone"/>
<input type="submit" value="Edit">
</form:form>
</body>
</html>