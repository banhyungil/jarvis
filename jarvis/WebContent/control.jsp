<%@ page language="java" contentType="text/html; 
charset=EUC-KR" pageEncoding="EUC-KR"%>
    <%@page import="bean.*" %>
    <%@ page import="java.util.ArrayList" %>
    <jsp:useBean id="cusBean" class="bean.CustomerBean"></jsp:useBean>
    <jsp:useBean id="empBean" class="bean.EmployeeBean"></jsp:useBean>
    <jsp:useBean id="comBean" class="bean.CompanyBean"></jsp:useBean>  
    
	<%
	String action = request.getParameter("action");
	String category = request.getParameter("meber_type");
	if(action.equals("login")){
		if(category.equals("customer")){
			pageContext.forward("cus_main.jsp");
		}else if(category.equals("company")){
			
		}
	}else if(action.equals("regist")){
		pageContext.forward("regit_member.jsp?member_type=" + category);
	}
	%>
