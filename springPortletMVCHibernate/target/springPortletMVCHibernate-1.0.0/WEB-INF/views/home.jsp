<%@include file="init.jsp"%>
<%@page isELIgnored="false"%>
<portlet:renderURL var="loginURL">
</portlet:renderURL>
<portlet:renderURL var="createUserURL">
	<portlet:param name="action" value="createUser"/>
</portlet:renderURL>
<c:set var="serverTime" value="<%=new java.util.Date()%>"/>
<h1>Hello world!</h1>
<P>The time on the server is ${serverTime}.</P>
<table border="1">
	<tr>
		<th>ID</th>
		<th>FirstName</th>
		<th>LastName</th>
		<th>email</th>
		<th>Address</th>
		<th>PhoneNo</th>
		<th colspan="2">operations</th>
	</tr>
	<c:forEach var="user" items="${usersList}">
		<portlet:renderURL var="editUserURL">
			<portlet:param name="action" value="editUserInfo" />
			<portlet:param name="userId" value="${user.userId}" />
		</portlet:renderURL>
		<portlet:actionURL var="deleteUserURL">
			<portlet:param name="action" value="deleteUserInfo" />
			<portlet:param name="userId" value="${user.userId}" />
		</portlet:actionURL>
		<tr align="center">
			<td><c:out value="${user.userId}" /></td>
			<td><c:out value="${user.firstName}" /></td>
			<td><c:out value="${user.lastName}" /></td>
			<td><c:out value="${user.email}"/></td>
			<td><c:out value="${user.address}"/></td>
			<td><c:out value="${user.phoneNo}" /></td>
			<td><a href="${editUserURL}"> <input type="button"
					value="Edit" onclick="editUser(${user.userId})" /></a></td>
			<td>
				<form id="userList" name="userList" method="post"
					action="${deleteUserURL}" htmlEscape = "false">
					<input type="submit" value="Remove" />
				</form>
			</td>
		</tr>	
	</c:forEach>
</table>
<a href="${createUserURL}">Create New User</a>
<%@include file="home_js.jsp"%>
