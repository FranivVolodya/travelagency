<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
#h1 {
	position: absolute;
	left: 250px;
	top: 325px;
}


#t3 {
	position: absolute;
	left: 250px;
	top: 75px;
}

#t2 {
	position: absolute;
	left: 250px;
	top: 375px;
}

body {
	background-color: #3366CC;
}
</style>
<title><spring:message code="label.title" /></title>
</head>
<body>
	<a href="<c:url value="/logout" />"> <spring:message
			code="label.logout" />
	</a>
	<h2>
		<spring:message code="label.title" />
	</h2>
	<h3>
		<a href="index">Clients</a>
	</h3>
	<h3>
		<a href="hotel">Hotels</a>
	</h3>
	<h3>
		<a href="index">Visas</a>
	</h3>
	<h3>
		<a href="index">Reservations</a>
	</h3>

	<form:form method="post" action="update" commandName="client">
		<table id="t3">
			<tr>
				<td><form:label path="name">
						<spring:message code="label.name" />
					</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="surname">
						<spring:message code="label.surname" />
					</form:label></td>
				<td><form:input path="surname" /></td>
			</tr>
			<tr>
				<td><form:label path="phoneNumber">
						<spring:message code="label.phoneNumber" />
					</form:label></td>
				<td><form:input path="phoneNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="passportNumber">
						<spring:message code="label.passportNumber" />
					</form:label></td>
				<td><form:input path="passportNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="city">
						<spring:message code="label.city" />
					</form:label></td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td><form:label path="street">
						<spring:message code="label.street" />
					</form:label></td>
				<td><form:input path="street" /></td>
			</tr>
			<tr>
				<td><form:label path="house">
						<spring:message code="label.house" />
					</form:label></td>
				<td><form:input path="house" /></td>
			</tr>
			<tr>
				<td><form:label path="apartment">
						<spring:message code="label.apartment" />
					</form:label></td>
				<td><form:input path="apartment" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"
					value="Submit changes" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>