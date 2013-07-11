<%@include file="/init.jsp"%>
<portlet:renderURL var="addUserURL">
	<portlet:param name="view" value="create" />
</portlet:renderURL>
<%
    ResultSet resultSet = null;
    Statement stmt = null; 
    Connection conn = DBConnection.getConnection();
    stmt = conn.createStatement();
    String sqlQuery="";
    sqlQuery = "SELECT * FROM user" ;
    resultSet = stmt.executeQuery(sqlQuery);
    String userId="";
%>
<br/>
<div>
	<input type="button" value='AddUser' onclick="addUser()"/>
</div>
<br/>
<form name="userform" method="post">
	<div>
		<table border=1 align="center">
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Address</th>
				<th>Gender</th>
				<th>Phone No</th>
				<th>Actions</th>
			</tr>
			<%
while(resultSet.next())	
{
 %>
      <tr>
				<td align="center"><%=resultSet.getString("firstName")%></td>
				<td align="center"><%=resultSet.getString("lastName")%></td>
				<td align="center"><%=resultSet.getString("email")%></td>
				<td align="center"><%=resultSet.getString("address")%></td>
				<td align="center"><%=resultSet.getString("gender")%></td>
				<td align="center"><%=resultSet.getString("phoneNo")%></td>
				<%
         	    userId = resultSet.getString("UserId");
         	%>
				<portlet:renderURL var="editUserURL">
					<portlet:param name="view" value="edit" />
					<portlet:param name="userid" value='<%= userId%>' />
				</portlet:renderURL>
				<portlet:actionURL var="deleteUserURL" name="deleteUser">
					<portlet:param name="userid" value='<%= userId%>' />
				</portlet:actionURL>
				<input type="hidden" name="editurl_<%=userId%>"
					value="<%=editUserURL.toString()%>">
				<input type="hidden" name="deleteurl_<%=userId%>"
					value="<%=deleteUserURL.toString()%>" />
				<td align="center"><input type="button" name="edit" id="edit"
					value="Edit" onclick="EditUser('<%=userId%>')" /> <input
					type="button" name="delete" id="delete" value="Delete"
					onclick="DeleteUser('<%=userId%>')" /></td>
			</tr>
			<%
  }
resultSet.close();
stmt.close();
conn.close();
	%>
		</table>
	</div>
</form>
<%@ include file="/view_js.jsp"%>
