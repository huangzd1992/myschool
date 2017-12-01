<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
	<p>全部学生</p>
    <table>
    	<c:forEach var="stu" items="${stuList }">
    		
    	
    	<tr>
    		<td>${stu.studentNo }</td>
    		<td>${stu.studentName }</td>
    		<td>${stu.sex }</td>
    	</tr>
    	</c:forEach>
    </table>
  </body>
</html>
