<%@include file="init.jsp"%>
<%@page isELIgnored="false"%>
<script type="text/javascript">
	function editUser(userId , action) {
		/* alert("hi " + userId + " Path : " + urlPath );
		var form = document.getElementById("userList");
		console.log(urlPath);
		form.setAttribute("action",urlPath );
		form.submit();
 */
 		/* var hiddenId = "editUrl_"+userId;
 		alert(hiddenId);
 		alert(document.forms["userList"][hiddenId+""].value);
 		document.userList.action = document.forms["userList"][hiddenId+""].value;
 		document.userList.submit(); */
	}
	function deleteUser(userId) {
		alert("hi " + userId);
	}
</script>