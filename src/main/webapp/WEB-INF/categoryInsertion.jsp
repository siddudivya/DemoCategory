<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Insertion</title>
</head>
<body>

<form:form method="post" modelAttribute="insert" action="insertData">
	<form:input path="category" type="text"/>
	<form:input path="description" type="text"/>
	<input type="submit" value="Submit"/> &nbsp;&nbsp;&nbsp;
	<input type="reset" value="Reset"/>
</form:form>

</body>
</html>