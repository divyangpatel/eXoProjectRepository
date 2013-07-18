<%@include file="/init.jsp"%>
<script type="text/javascript">
addUser = function(){
	window.location.href="<%=addUserURL.toString()%>";
	}
EditUser = function(userId) {
	var hiddenId = "editurl_" + userId;
	window.location.href = document.forms["userform"][hiddenId + ""].value;
	}
DeleteUser = function(userId) {
	var hiddenId = "deleteurl_" + userId;
	document.userform.action = document.forms["userform"][hiddenId + ""].value;
	document.userform.submit();
	}
SearchUser = function() {
	document.searchform.submit();
	}
</script>