<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form:form action="saveEmployee" modelAttribute="load">
       Name: <form:input path="name" /> <br><br>
      Age : <form:input path="age" /><br><br>
      Sal: <form:input path="sal" /> <br><br>
      Email: <form:input path="email" /><br><br>
      password: <form:input path="password" /> <br><br>
      <form:button>Register</form:button>
   </form:form>
</body>
</html>