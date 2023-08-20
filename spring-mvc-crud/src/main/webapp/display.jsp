<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
     th{
     color: blue;
     }
</style>
</head>
<body>
    <table border="2px" style="border-collapse: collapse;">
       <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>AGE</th>
            <th>SAL</th>
            <th>EMAIL</th>
            <th>EDIT</th>
            <th>DELETE</th>
       </tr>
       <c:forEach var="emp" items="${list}">
       <tr>
           <td>${emp.getId() }</td>
           <td>${emp.getName() }</td>
           <td>${emp.getAge() }</td>
           <td>${emp.getSal() }</td>
           <td>${emp.getEmail() }</td>
           <td><a href="editemployee?id=${emp.getId() }">edit</a></td>
           <td><a href="deleteemployee?id=${emp.getId()}">delete</a></td>
           
       </tr>
              </c:forEach>
       
    </table>
</body>
</html>