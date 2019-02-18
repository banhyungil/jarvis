<%@ page language="java" contentType="text/html; 
charset=EUC-KR" pageEncoding="EUC-KR"%>
    <%@page import="bean.*" %>
    <%@page import="dao.*" %>
    <%@ page import="java.util.ArrayList" %>
    <jsp:useBean id="cusBean" class="bean.CustomerBean"></jsp:useBean>
    <jsp:setProperty property="*" name="cusBean"/>
    <!--<jsp:useBean id="empBean" class="bean.EmployeeBean"></jsp:useBean>
    <jsp:setProperty property="*" name="empBean"/>
    <jsp:useBean id="comBean" class="bean.CompanyBean"></jsp:useBean>  
    <jsp:setProperty property="*" name="comBean"/>-->
    
	<%
	String action = request.getParameter("action");
	String member_type = request.getParameter("member_type");
	Dao dao;
	if(action.equals("login")){
		if(member_type.equals("customer")){
			pageContext.forward("cus_main.jsp");
		}else if(member_type.equals("company")){
			
		}
	}else if(action.equals("regist")){
		if(member_type.equals("customer")){
			pageContext.forward("regit_member_cus.jsp");
		}else if(member_type.equals("employee")){
			pageContext.forward("regit_member_emp.jsp");
		}else if(member_type.equals("company")){
			pageContext.forward("regit_member_com.jsp");
		}
		
	}else if(action.equals("insert")){
		if(member_type.equals("customer")){			
			dao = new CustomerDao();
			boolean b = dao.insert(cusBean);
			out.println(b);
		}else if(member_type.equals("company")){
			dao = new CompanyDao();
			dao.insert(comBean);
		}else if(member_type.equals("employee")){
			dao = new EmployeeDao();
			dao.insert(empBean);
		}
		//response.sendRedirect("control.jsp?action=login");
	}
	%>
