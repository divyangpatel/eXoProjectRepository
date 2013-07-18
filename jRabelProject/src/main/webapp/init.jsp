<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.sql.Connection"%>
<%@page import="com.portlet.DBConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@ page import="javax.portlet.*"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="com.portlet.*" %>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="javax.portlet.ActionResponse"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ page isELIgnored="false" %>
<portlet:defineObjects/>
<script src="<%=request.getContextPath() %>/js/jquery.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/js/jquery.validate.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/js/main.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/js/jquery-widgets.js" type="text/javascript"></script>
