 <%@page import="model.Student"%>
 <%@page import="java.util.ArrayList"%> 
<%@page import="java.util.List"%> 
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%> 
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Lists</title><meta charset="utf-8"/>
    <link rel="stylesheet" type="text/css" href="collection.css" />
</head>
<body>
    <h2>Lists</h2>
    <form action ="/WebApp_Collections/list" method ="post">
        <div class = "form-group">
            <div class="text">
                <label for = "stringText">Enter Student Name<br><br></label>
                <input type="text" class="form-text" id="name" placeholder="Enter any sentence" name="name"><br><br>
                
                <input type="submit" value="ADDITEM" name="add">
                <input type="submit" value="REMOVE" name="remove"><br><br>
                <input type="submit" value="VEIW NAMES" name="view"><br><br>
                <input type="submit" value="ASCENDING" name="ascending">
                <input type="submit" value="DESCENDING" name="descending">
                <input type="submit" value="CLEAR" name="clear"><br>
                <input type="submit" value="GO NEXT" name="next"><br><br>
          		
          		<% if (request.getAttribute("studentListadd") != null) { %>
          		<p> Student Name of ${studentListadd}  is added</p>
          		<% } %>
          		<% if (request.getAttribute("studentListremove") != null) { %>
          		<p> Student Name of ${studentListremove} is removed</p>
          		<% } %>
          		
          		
          		<c:forEach var="student" items="${requestScope.studentList}">
          	    <% out.print("\n"); %>
          	    <c:out value="${student}"/>
        		</c:forEach>
        		
        		<% if (request.getAttribute("studentListclear") != null) { %>
          		<p>${studentListclear}</p>
          		<% } %>
      		</div>
 
        </div>
    </form>
</body>
</html>