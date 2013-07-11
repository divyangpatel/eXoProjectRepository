<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="org.apache.pluto.tags.ActionURLTag"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="org.scalsys.springPortletMVCHibernate.SchemaModel.User"%>
<%@page isELIgnored="false"%>

<script src="<%=request.getContextPath() %>/js/jquery.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/js/jquery.validate.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/js/main.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/js/jquery-widgets.js" type="text/javascript"></script>