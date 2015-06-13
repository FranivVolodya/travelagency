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
	<h3><a href="hotel">Hotels</a></h3> 
	<h3><a href="index">Visas</a></h3> 
	<h3><a href="index">Reservations</a></h3> 
	
	<form:form method="post" action="addHotel" commandName="hotel">
		<table id="t1">
			<tr>
				<td><form:label path="name">
						<spring:message code="label.hotelName" />
					</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
		<tr>
				<td><form:label path="city">
						<spring:message code="label.hotelCity" />
					</form:label></td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td><form:label path="isAvaliable">
						<spring:message code="label.isAvaliable" />
					</form:label></td>
				<td><form:input path="isAvaliable" /></td>
			</tr>
					<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message code="label.addhotel"/>" /></td>
			</tr>
		</table>
	</form:form>
	<h3 id="h1">
		<spring:message code="label.hotelList" />
	</h3>
	<c:if test="${!empty hotelList}">
		<table class="data" id="t2">
			<tr>
				<th><spring:message code="label.hotelName" /></th>
				<th><spring:message code="label.hotelCity" /></th>
				<th><spring:message code="label.isAvaliable" /></th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${hotelList}" var="hotel">
				<tr>
					<td>${hotel.name}</td>
					<td>${hotel.city}</td>
					<td>${hotel.isAvaliable}</td>					
					<td><a href="deleteHotel/${hotel.id}"> <spring:message
								code="label.delete" /></a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>