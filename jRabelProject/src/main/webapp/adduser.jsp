<%@include file="/init.jsp"%>
<portlet:renderURL var="BackToUserViewURL">
</portlet:renderURL>
<portlet:actionURL var="addEditUser" name="addEditUser">
</portlet:actionURL>
<head>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/main-style.css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/jquery-ui.css" />
</head>
 <div id="validationMsg" title="Validation Message">
</div>
<form name="myform" method="post">
      <input type="hidden" value="${isNew}" name="isNew">
      <input type="hidden" value="${UserList.userId}" name="userId">
      <div style="text-align: center;">
          <div>
             <span>Registration Form</span>
          </div>
          <div>
          <span>FirstName:</span>
          <span><input type="text" name="firstName" id="firstName" value="${UserList.firstName}"/></span>
          </div>
          <div>
          <span>LastName:</span>
          <span><input type="text" name="lastName" id="lastName" value="${UserList.lastName}"/></span>
          </div>
          <div>
          <span style="margin-left: 21px;text-align: center;">Email:</span>
          <span style=" margin-left: 6px;"><input type="text" name="email" id="email" value="${UserList.email}"/></span>
          </div>
          <div>
          <span style="margin-left: 5px;text-align: left;">Address:</span>
          <span style="margin-left: 8px;"><textarea rows="5" cols="5" name="address" id="address">${UserList.address}</textarea></span>
          </div>
          <div>
          <span style="margin-left: 395px;float: left;">Gender:</span>
          <span style="margin-left: 17px;"><input type="radio" name="gendergrp" id="gendergrp" value="Male" checked="checked" style="margin-top: -2px;margin-left: -328px;">Male
			<input type="radio" name="gendergrp" id="gendergrp" value="Female" style="margin-top: -2px;">Female</span>
          </div>
          <div>
          <span style="margin-left: 4px;">Phone No:</span>
          <span style="margin-left: 3px;"><input type="text" name="phoneNo" id="phoneNo" value="${UserList.phoneNo}" maxlength="10"/></span>
          </div>
          <div>
          <input type="hidden" name="addurl_" value="<%=addEditUser.toString()%>"> 
              &nbsp;&nbsp;&nbsp;
			<input type="button" onclick="<portlet:namespace/>SubmitUserForm()" value="Submit" style="width: 75px;margin-left: 50px;">
			&nbsp;&nbsp;&nbsp;
			<input type="button" value="Reset" style="width:75px;" onclick="<portlet:namespace />ResetUserForm()" />
				&nbsp;&nbsp;&nbsp;
			<input type="button" value="Cancel" style="width:75px;" onclick="<portlet:namespace />CancelEventForm()" />
          </div>
     </div>
</form>
 <%@ include file="/adduser_js.jsp"%>