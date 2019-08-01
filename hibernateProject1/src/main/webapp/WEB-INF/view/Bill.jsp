<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="" method="POST" modelAttribute="billing">
	<table>
	<tr>
	
	<td><b>BILL_ID</b></td>
	<td>backend_value</td>
	</tr>
	<tr>
	<td><b>CUSTOMER_NAME</b></td>
	<td>backend_value</td>
	</tr>
	<tr>
	<td><b>PRODUCT_DETAILS</b></td>
	<td>
	   <table border="1">
	     <tr>
	        <th>Id</th>
	        <th>FoodName</th>
	        <th>Quantity</th>
	        <th>Price</th>
	        <th>Amount</th>
	     </tr>
	     
	   
	   </table>
	
	
	</td>
	</tr>
	
	</table>
	
	</form:form>
  
  
</body>
</html>