<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="label.title" /></title>
</head>
<body>
	<a href="<c:url value="/logout" />"> <spring:message
			code="label.logout" />
	</a>
	<h2>
		<spring:message code="label.title" />
	</h2>
	<form:form method="post" action="add" commandName="client">
		<table>
			<tr>
				<td><form:label path="name">
						<spring:message code="label.firstname" />
					</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="surname">
						<spring:message code="label.lastname" />
					</form:label></td>
				<td><form:input path="surname" /></td>
			</tr>
			<tr>
				<td><form:label path="phoneNumber">
						<spring:message code="label.email" />
					</form:label></td>
				<td><form:input path="phoneNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="passportNumber">
						<spring:message code="label.telephone" />
					</form:label></td>
				<td><form:input path="passportNumber" /></td>
			</tr>
			<!-- tr>
				<td colspan="2"><input type="submit"
					value="<spring:message code="label.addcontact"/>" /></td>
			</tr-->
		</table>
	</form:form>
	<h3>
		<spring:message code="label.contacts" />
	</h3>
	<c:if test="${!empty clientList}">
		<table class="data">
			<tr>
				<th><spring:message code="label.name" /></th>
				<th><spring:message code="label.surname" /></th>
				<th><spring:message code="label.passportNumber" /></th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${clientList}" var="client">
				<tr>
					<td>${client.surname},${client.name}</td>
					<td>${client.passportNumber}</td>
					<td>${client.phoneNumber}</td>
					<td><a href="delete/${client.id}"> <spring:message
								code="label.delete" /></a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>