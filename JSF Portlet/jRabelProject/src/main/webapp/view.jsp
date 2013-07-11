<%@ page import="javax.portlet.*"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<portlet:actionURL var="addUser" name="addUser">
</portlet:actionURL>
<%=request.getAttribute("message")%>
<form name="myform" method="post" action="<%=addUser.toString()%>">
	<table align="center" style="width:50%">
		<tr>
			<th colspan="2">Registration Form</th>
		</tr>
		<tr>
			<td>FirstName</td>
			<td><input type="text" name="firstName"></td>
		</tr>
		<tr>
			<td>LastName</td>
			<td><input type="text" name="lastName"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="Submit"></td>
		</tr>
	</table>
</form>