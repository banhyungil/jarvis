<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="dao.ResumesDao"></jsp:useBean>
<jsp:useBean id="bean" class="bean.ResumesBean"></jsp:useBean>

<%
String action = request.getParameter("action");

if(action.equals("insert")){
	dao.insert(bean);
	
	pageContext.forward("/customer/getjob_list.jsp");
}
%>





<%
String action = request.getParameter("action");

if(action.equals("insert")){
	dao.insert(bean);
	
	pageContext.forward("/customer/getjob_list.jsp");
}
%>

