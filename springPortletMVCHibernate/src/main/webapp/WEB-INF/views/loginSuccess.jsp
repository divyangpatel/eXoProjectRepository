<%@include file="init.jsp"%>
<%@page isELIgnored="false"%>
<portlet:renderURL var="loginFormGoBack">
</portlet:renderURL>
<portlet:renderURL var="homePageURL">
	<portlet:param name="action" value="home" />
	<portlet:param name="param1" value="value of param1" />
	<portlet:param name="param2" value="value of param2" />
</portlet:renderURL>

${login.username} is successfully login.

<a href="${loginFormGoBack}">Go Back</a>

<a href="${homePageURL}">Go to View Page</a>



