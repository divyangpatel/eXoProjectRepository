<script type="text/javascript">
jQuery(document).ready(function(){
	 jQuery('#validationMsg').hide();
});
<portlet:namespace/>CancelUserForm = function()
{
	window.location.href = "<%=BackToUserViewURL.toString()%>";
} 

	<portlet:namespace/>SubmitUserForm = function() {

		if (<portlet:namespace/>validateUserForm()) {
			var hiddenId = "addediturl_";
			document.userform.action = document.forms["userform"][hiddenId + ""].value;
			document.userform.submit();
		}
	}
	<portlet:namespace/>validateUserForm = function() {
		var firstName = document.forms["userform"]["firstName"].value;
		var lastName = document.forms["userform"]["lastName"].value;
		var address = document.forms["userform"]["address"].value;
		var email = document.forms["userform"]["email"].value;
		var phoneNo = document.forms["userform"]["phoneNo"].value;

		if (firstName.trim() == '') {
			jQuery('#validationMsg').html("! FirstName-is-Required");
			jQuery('#validationMsg').dialog({
			      resizable: false,
			      modal: true,
			      buttons: {
			        "OK": function() {
			        	jQuery( this ).dialog( "close" );
			        },
			        "Cancel":function() {
			        	jQuery( this ).dialog( "close" );
			        }
			      }
			    });
			return false;
		}
		if (lastName.trim() == '') {
			jQuery('#validationMsg').html("! LastName-is-Required");
			jQuery('#validationMsg').dialog({
			      resizable: false,
			      modal: true,
			      buttons: {
			        "OK": function() {
			        	jQuery( this ).dialog( "close" );
			        },
			        "Cancel":function() {
			        	jQuery( this ).dialog( "close" );
			        }
			      }
			    });
			return false;
		}
		if (email.trim() == '') {
			jQuery('#validationMsg').html("! Email-is-Required");
			jQuery('#validationMsg').dialog({
			      resizable: false,
			      modal: true,
			      buttons: {
			        "OK": function() {
			        	jQuery( this ).dialog( "close" );
			        },
			        "Cancel":function() {
			        	jQuery( this ).dialog( "close" );
			        }
			      }
			    });
			return false;
		}
		if (validateEmailAddress(email) == false) {
			jQuery('#validationMsg').html("! Enter Valid Email Address");
			jQuery('#validationMsg').dialog({
			      resizable: false,
			      modal: true,
			      buttons: {
			        "OK": function() {
			        	jQuery( this ).dialog( "close" );
			        },
			        "Cancel":function() {
			        	jQuery( this ).dialog( "close" );
			        }
			      }
			    });
			return false;
		}
		if (address.trim() == '') {
			jQuery('#validationMsg').html("! Address-is-Required");
			jQuery('#validationMsg').dialog({
			      resizable: false,
			      modal: true,
			      buttons: {
			        "OK": function() {
			        	jQuery( this ).dialog( "close" );
			        },
			        "Cancel":function() {
			        	jQuery( this ).dialog( "close" );
			        }
			      }
			    });
			return false;
		}
		if (phoneNo.trim() == '') {
			jQuery('#validationMsg').html("!PhoneNo-is-Required");
			jQuery('#validationMsg').dialog({
			      resizable: false,
			      modal: true,
			      buttons: {
			        "OK": function() {
			        	jQuery( this ).dialog( "close" );
			        },
			        "Cancel":function() {
			        	jQuery( this ).dialog( "close" );
			        }
			      }
			    });
			return false;
		}
		if (validatePhoneNo(phoneNo) == false) {
			jQuery('#validationMsg').html("! Enter 10 characters");
			jQuery('#validationMsg').dialog({
			      resizable: false,
			      modal: true,
			      buttons: {
			        "OK": function() {
			        	jQuery( this ).dialog( "close" );
			        },
			        "Cancel":function() {
			        	jQuery( this ).dialog( "close" );
			        }
			      }
			    });
			return false;
		}
		jQuery('#validationMsg').hide();
		return true;
	}

	validateEmailAddress = function(email) {
		var filter = /^((\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*?)\s*;?\s*)+/;
		if (filter.test(email)) {
			return true;
		} else {
			return false;
		}
	}
	validatePhoneNo = function(phoneNo) {

		if (phoneNo.length == 10) {
			return true;
		} else {
			return false;
		}
	}
   <portlet:namespace />ResetUserForm = function() {
		document.forms["userform"]["firstName"].value = "";
		document.forms["userform"]["lastName"].value = "";
		document.forms["userform"]["email"].value = "";
		document.forms["userform"]["address"].value = "";
		document.forms["userform"]["phoneNo"].value = "";
	} 
</script>
