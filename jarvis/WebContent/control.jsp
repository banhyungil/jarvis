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
	String id = "";
	Dao dao;
	if(action.equals("main")){
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
			dao.insert(cusBean);			
		}else if(member_type.equals("company")){
			dao = new CompanyDao();
			dao.insert(comBean);
		}else if(member_type.equals("employee")){
			dao = new EmployeeDao();
			dao.insert(empBean);
		}
		%>
		<script type="text/javascript"> 		//회원가입성공 표시할 수 있는 방법은? ok를 누르면 페이지 넘어가도록
		if(confirm('회원가입이 성공하였습니다.')){		
		</script> 
		<% 
		response.sendRedirect("control.jsp?action=login");
		%>
		<script>
		}
		</script>
		<% 
	} else if(action.equals("login")){
		response.sendRedirect("login.jsp");
	} else if(action.equals("double_check")){
		boolean b;
		if(member_type.equals("customer")){			
			CustomerDao cusDao = new CustomerDao();
			id = request.getParameter("customer_id");
			b = cusDao.doubleCheck(id);
			if(b){		//중복인 경우
				%>
				<script>
				alert("중복된 아이디입니다.");
				</script>
				<% 
			} else{
				%>
				<script>
				alert("사용가능한 아이디입니다.");
				</script>
				<%			
			}
			%>
			<script>
				window.history.back();
			</script>
			<%
		}else if(member_type.equals("company")){
			CompanyDao comDao = new CompanyDao();
			id = request.getParameter("company_id");
			
			b = comDao.doubleCheck(id);
			pageContext.forward("regit_member_com.jsp?isChecked="+ b);
		}else if(member_type.equals("employee")){
			EmployeeDao empDao = new EmployeeDao();
			id = request.getParameter("employee_id");
			
			b = empDao.doubleCheck(id);
			pageContext.forward("regit_member_emp.jsp?isChecked="+ b);
		}
	}
		
	%>
