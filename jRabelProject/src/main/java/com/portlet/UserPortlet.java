package com.portlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.pluto.tags.ParamTag;
import org.apache.taglibs.standard.tag.common.core.ParamSupport.ParamManager;
import org.omg.CORBA.Request;

public class UserPortlet extends GenericPortlet {
	private PortletRequestDispatcher helpDispatcher;
	private String viewJSP;
	private String addUserJSP;

	public void init() throws PortletException {
		viewJSP = "/view.jsp";
		addUserJSP = "/adduser.jsp";
	}

	public void doView(RenderRequest rendeRequest, RenderResponse renderResponse)
			throws PortletException, IOException {
	/*renderResponse.addProperty("org.gatein.javascript.dependency", "SHARED/jquery-1.9.1");*/
		boolean isCreate = false;
		boolean isEdit = false;
		String view = rendeRequest.getParameter("view");
		if (view != null) {
			if (view.equals("create")) {
				isCreate = true;

				System.out.println("isCreate=" + isCreate);
				rendeRequest.setAttribute("isNew", true);
				include(addUserJSP, rendeRequest, renderResponse);
			}
			if (view.equals("edit")) {
				isEdit = true;
				System.out.println("isEdit=" + isEdit);
				String userId = (String) rendeRequest.getParameter("userid");
				System.out.println("UserId=" + userId);
				UserDataStore userDataStore = new UserDataStore();
				UserPojo userPojo = null;
				try {
					userPojo = userDataStore.getUser(userId);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				rendeRequest.setAttribute("UserList", userPojo);
				include(addUserJSP, rendeRequest, renderResponse);
			}
		} else {
			rendeRequest.setAttribute("message", "Welcome to Exo Platform");
			include(viewJSP, rendeRequest, renderResponse);
		}
	}

	protected void doHelp(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		helpDispatcher.include(request, response);
	}

	protected void include(String path, RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		PortletRequestDispatcher portletRequestDispatcher = getPortletContext()
				.getRequestDispatcher(path);
		portletRequestDispatcher.include(renderRequest, renderResponse);
	}

	@ProcessAction(name = "addEditUser")
	public void addEditUser(ActionRequest actionRequest,
			ActionResponse actionResponse) throws SQLException, IOException {
		String firstName = actionRequest.getParameter("firstName");
		String lastName = actionRequest.getParameter("lastName");
		String email = actionRequest.getParameter("email");
		String address = actionRequest.getParameter("address");
		String gender = actionRequest.getParameter("gendergrp");
		String phoneNo = actionRequest.getParameter("phoneNo");
		boolean isNewUser = false;
		String isNew = "", userId = "";
		if (actionRequest.getParameter("isNew") != null) {
			isNew = actionRequest.getParameter("isNew");
			System.out.println("isNew======>>>" + isNew);
			isNewUser = Boolean.parseBoolean(isNew);
			System.out.println("isNewUser======>>>" + isNewUser);
		}
		if (actionRequest.getParameter("userId") != null) {
			userId = actionRequest.getParameter("userId");
		}
		UserPojo userPojo = new UserPojo();
		userPojo.setUserId(userId);
		userPojo.setFirstName(firstName);
		userPojo.setLastName(lastName);
		userPojo.setEmail(email);
		userPojo.setAddress(address);
		if (gender.equals("Male")) {
			userPojo.setGender(gender);
		} else {
			userPojo.setGender(gender);
		}
		userPojo.setPhoneNo(phoneNo);
		UserDataStore userDataStore = new UserDataStore();
		if (isNewUser) {
			userDataStore.insertUser(userPojo);
			System.out.println(" User inserted Sucessfully");
		} else {
			userDataStore.updateUser(userPojo);
			System.out.println("User Updated SucessFully");
		}
		actionResponse.setRenderParameter("isNew", isNew);
		actionResponse.setRenderParameter("jspPage", viewJSP);
	}

	@ProcessAction(name = "deleteUser")
	public void deleteUser(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, SQLException {
		System.out.println("in delete user method");
		String userId = actionRequest.getParameter("userid");
		System.out.println("UserId=" + userId);
		UserDataStore userDataStore = new UserDataStore();
		userDataStore.deleteUser(userId);
		System.out.println("User Deleted Sucessfully");
		actionResponse.setRenderParameter("jspPage", viewJSP);
	}

}
