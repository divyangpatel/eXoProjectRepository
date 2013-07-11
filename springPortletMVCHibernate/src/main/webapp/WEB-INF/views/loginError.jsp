<%@include file="init.jsp"%>
<%@page isELIgnored="false"%>

<portlet:renderURL var="loginFormGoBack">
</portlet:renderURL>
<portlet:renderURL var="loginFormURL">
	<portlet:param name="action" value="loginForm2" />
</portlet:renderURL>

sorry wrong User Id Password <br/>

<a href="${loginFormURL}">Go to Login Page</a>



