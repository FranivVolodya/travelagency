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
#h1{
    	position: absolute;
    	left: 250px;
    	top: 325px;
}
#t1 {
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
	<h3><a href="index">Clients</a></h3> 
	<h3><a href="index">Hotels</a></h3> 
	<h3><a href="index">Visas</a></h3> 
	<h3><a href="index">Reservations</a></h3> 
	
	<form:form method="post" action="add" commandName="client">
		<table id="t1">
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
					value="<spring:message code="label.addcontact"/>" /></td>
			</tr>
		</table>
	</form:form>
	<h3 id="h1">
		<spring:message code="label.contacts" />
	</h3>
	<c:if test="${!empty clientList}">
		<table class="data" id="t2">
			<tr>
				<th><spring:message code="label.name" /></th>
				<th><spring:message code="label.surname" /></th>
				<th><spring:message code="label.phoneNumber" /></th>
				<th><spring:message code="label.passportNumber" /></th>
				<th><spring:message code="label.city" /></th>
				<th><spring:message code="label.street" /></th>
				<th><spring:message code="label.house" /></th>
				<th><spring:message code="label.apartment" /></th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${clientList}" var="client">
				<tr>
					<td>${client.name}</td>
					<td>${client.surname}</td>
					<td>${client.phoneNumber}</td>
					<td>${client.passportNumber}</td>
					<td>${client.city}</td>
					<td>${client.street}</td>
					<td>${client.house}</td>
					<td>${client.apartment}</td>
					
					<td><a href="delete/${client.id}"> <spring:message
								code="label.delete" /></a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>