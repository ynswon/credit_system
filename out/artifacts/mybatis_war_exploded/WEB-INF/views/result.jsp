<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import ="java.util.*,com.funda.mybatis.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���â</title>
</head>
<body>

<table border="1">
	 <tr>
		 <td width="50px" align="center">id</td>
		 <td align="center">email</td>
		 <td align="center">phone</td>
	 </tr>
	 <!-- result�� contoller�� addObject�� ���� �����´�. -->
	 <c:forEach items="${result}" var="member">
		 <tr>
			 <td>${member._name}</td>
			 <td>${member._email}</td>
			 <td>${member._phone}</td>	
		 </tr>
	 </c:forEach>

</table>

</body>
</html>