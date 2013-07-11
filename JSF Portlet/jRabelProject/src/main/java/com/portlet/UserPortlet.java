package com.portlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class UserPortlet extends GenericPortlet {
	private static final String VIEW_PAGE = "/view.jsp";
    private static final String HELP_PAGE = "/help.jsp";

    private PortletRequestDispatcher viewDispatcher;
    private PortletRequestDispatcher helpDispatcher;
    private String viewJSP;
    public void init() throws PortletException {
		 //viewJSP = getInitParameter("view-jsp");
    	viewJSP="/view.jsp";
	}
    public void doView( RenderRequest request, RenderResponse response )
        throws PortletException, IOException {
    	request.setAttribute("message", "Welcome to Exo Platform");
        include(viewJSP,request, response );
       }

    protected void doHelp( RenderRequest request, RenderResponse response )
        throws PortletException, IOException {
        helpDispatcher.include( request, response );
    }

    protected void include(
			String path, RenderRequest renderRequest,
			RenderResponse renderResponse)
		throws IOException, PortletException {

		PortletRequestDispatcher portletRequestDispatcher =
			getPortletContext().getRequestDispatcher(path);
             portletRequestDispatcher.include(renderRequest, renderResponse);
	}
  
    @ProcessAction (name = "addUser")
    public void addUser(ActionRequest actionRequest,ActionResponse actionResponse) throws SQLException,IOException
    {
    	String firstName=actionRequest.getParameter("firstName");
    	String lastName=actionRequest.getParameter("lastName");
    	UserPojo userPojo=new UserPojo();
    	/*userPojo.setUserId(Userid);*/
    	userPojo.setFirstName(firstName);
    	userPojo.setLastName(lastName);
    	UserDataStore userDataStore=new UserDataStore();
    	userDataStore.insert(userPojo);
    	System.out.println(" User inserted Sucessfully");
    	actionResponse.setRenderParameter("jspPage", VIEW_PAGE);
    }

}
