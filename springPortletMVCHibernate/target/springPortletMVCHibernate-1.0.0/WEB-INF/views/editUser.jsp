<%@include file="init.jsp"%>
<<portlet:renderURL var="BackToUserViewURL"></portlet:renderURL>
<portlet:actionURL var="userCreationFormURL">
	<portlet:param name="action" value="userCreateEditAction" />
</portlet:actionURL>
<head>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/main-style.css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/jquery-ui.css" />
</head>
<div id="validationMsg" title="Validation Message">
</div>
<form:form commandName="user" method="POST" name="userform"
	htmlEscape="false">
	<div style="text-align: center;">
          <div>
             <span>Registration Form</span>
          </div>
          <div>
          <span></span>
		 <span><form:hidden path="userId" name="userId" /></span>
		  </div>
		<div>
			<span>First Name:</span>
			<span><form:input path="firstName" name="firstName" /></span>
		</div>
		<div>
			<span>Last Name:</span>
			<span><form:input path="lastName" name="lastName" /></span>
		</div>
		<div>
			<span style="margin-left: 21px;text-align: center;">Email:</span>
			<span style=" margin-left: 6px;"><form:input path="email" name="email" /></span>
		</div>
		<div>
			<span style="margin-left: 5px;text-align: left;">Address</span>
			<span style="margin-left: 8px;"><form:textarea path="address" name="address"/></span>
	    </div>
	    <div></div>
		<div>
			<span style="margin-left: 4px;">PhoneNo</span>
			<span style="margin-left: 3px;"><form:input path="phoneNo" name="phoneNo" maxlength="10" /></span>
		</div>
		<input type="hidden" name="addediturl_" value="<%=userCreationFormURL.toString()%>"> 
		<div>
             <span><input type="button" value="Submit" onclick="<portlet:namespace/>SubmitUserForm()" style="width: 75px;margin-left: 50px;"/></span> <%-- <form:button path="submit" id="submitForm" value="Create User" name="createUser"/> --%>
			 <span><input type="button" value="Reset" style="width:75px;" onclick="<portlet:namespace/>ResetUserForm()"/></span>
			 <span><input type="button" value="Cancel" style="width:75px;" onclick="<portlet:namespace/>CancelUserForm()"/></span>
       </div>
	</div>
</form:form>
<%@include file="editUser_js.jsp"%>