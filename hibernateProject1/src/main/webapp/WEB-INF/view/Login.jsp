<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.error {
	color: red;
}

.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
	position: relative;
}

img.avatar {
	width: 8%;
	border-radius: 4%;
}

input[type=submit] {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 40%;
}

input[type=text], input[type=password] {
	width: 40%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

.login-box {
	width: 700px;
	position: absolute;
	top: 45%;
	left: 65%;
	transform: translate(-50%, -50%);
	color:white;
}

.textbox {
	width: 100%;
	overflow: hidden;
	font-size: 17px;
	padding: 8px 0;
	margin: 8px 0;
	align-items: center;
}

.login-box a.forgotpassword {
	color: #1366eb;
	font-family: sans-seriff;
	align-self: center;
}

.login-box a.register {
	color: #1366eb;
	font-family: sans-seriff;
	align-self: center;
}


body {
	background-image:
	url("https://media.gettyimages.com/photos/pasta-ingredients-picture-id635920906?s=2048x2048"); 
	height: 100%; 
	background-position: center;
	background-repeat: no-repeat;
	background-size: auto;
	position: relative;
	}
</style>
</head>
<body>

	<form:form action="/hibernateProject1/validate" method="POST" modelAttribute="employeedetails">
		<div class="imgcontainer">

			<img src="<c:url value="/resources/images/user.png"/>" alt="Avatar"
				class="avatar">
		</div>

		<div class="login-box">
			<div class="textbox">
				<b>EMAIL</b><br>
				<form:input path="email" placeholder="Enter Email"/>
				
				<form:errors path="email" cssClass="error"></form:errors>
			</div>

			<div class="textbox">

				<b>PASSWORD</b><br>
				<form:input path="password" placeholder="Enter Password"></form:input>
				<form:errors path="password" type="password" cssClass="error"></form:errors>

			</div>
			
			
			

				<td colspan="3">
                    <c:choose>
                        <c:when test="${hasError}">
                           <center> <h4 class="error">Invalid Credentials</h4></center>
                        </c:when>
                        <c:otherwise>
                        
                        </c:otherwise>
                    </c:choose>
                </td>
			<input type="submit" value="Login" /><br> <a
				class="forgotpassword" href="url">Forget Password</a><br> <a
				class="register" href="url">Register</a>

		</div>


	</form:form>


</body>
</html>