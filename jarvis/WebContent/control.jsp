<%@ page language="java" contentType="text/html; 
charset=EUC-KR" pageEncoding="EUC-KR"%>
    <%@page import="bean.*" %>
    <%@page import="dao.*" %>
    <%@ page import="java.util.ArrayList" %>
    <jsp:useBean id="cusBean" class="bean.CustomerBean"></jsp:useBean>
    <jsp:setProperty property="*" name="cusBean"/>
    <jsp:useBean id="comBean" class="bean.CompanyBean"></jsp:useBean>
    <jsp:setProperty property="*" name="comBean"/>
    <jsp:useBean id="empBean" class="bean.EmployeeBean"></jsp:useBean>
    <jsp:setProperty property="*" name="empBean"/>
    
	<%
	String action = request.getParameter("action");
	String member_type = request.getParameter("member_type");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	Dao dao;
	if(action.equals("main")){
		if(member_type.equals("customer")){
			pageContext.forward("cus_main.jsp");
		}else if(member_type.equals("company")){
			
		}
	}else if(action.equals("regist")){
		if(member_type.equals("customer")){
			pageContext.forward("/customer/regit_member_cus.jsp");
		}else if(member_type.equals("employee")){
			pageContext.forward("/employee/regit_member_emp.jsp");
		}else if(member_type.equals("company")){
			pageContext.forward("/company/regit_member_com.jsp");
		}
		
	}else if(action.equals("insert")){			//회원가입 버튼을 눌렀을 때
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
		response.sendRedirect("login.jsp");
		%>
		<script>
		}
		</script>
		<% 
	} else if(action.equals("login")){
		boolean b = false;
		
		if(member_type.equals("customer")){			
			CustomerDao cusDao = new CustomerDao();
			b = cusDao.loginCheck(id, pw);		
			if(b){
				cusBean = null;
				cusBean = (CustomerBean)cusDao.getSingle(id);
				session.setAttribute("cusBean", cusBean);
				response.sendRedirect(request.getContextPath() + "/customer/cus_main.jsp");	//bean객체를 session에저장해야함			
			}else {		
				%>
				<script>
				alert("ID/Password가 일치하지 않습니다.");
				window.history.back();
				</script>
				<% 
			}
		}else if(member_type.equals("company")){
			CompanyDao comDao = new CompanyDao();
			b = comDao.loginCheck(id, pw);	
			if(b){
				comBean = null;
				comBean = (CompanyBean)comDao.getSingle(id);
				session.setAttribute("comBean", comBean);
				response.sendRedirect(request.getContextPath() + "/customer/com_main.jsp");	//bean객체를 session에저장해야함			
			}else {		
				%>
				<script>
				alert("ID/Password가 일치하지 않습니다.");
				window.history.back();
				</script>
				<% 
			}
		}else if(member_type.equals("employee")){
			EmployeeDao empDao = new EmployeeDao();
			b = empDao.loginCheck(id, pw);	
			if(b){
				empBean = null;
				empBean = (EmployeeBean)empDao.getSingle(id);
				session.setAttribute("empBean", empBean);
				response.sendRedirect(request.getContextPath() + "/customer/emp_main.jsp?");	//bean객체를 session에저장해야함			
			}else {		
				%>
				<script>
				alert("ID/Password가 일치하지 않습니다.");
				window.history.back();
				</script>
				<% 
			}
		}
	} else if(action.equals("double_check")){
		boolean b;
		if(member_type.equals("customer")){			
			CustomerDao cusDao = new CustomerDao();
			String cus_id;
			cus_id = request.getParameter("customer_id");
			b = cusDao.doubleCheck(cus_id);
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
			String com_id;
			com_id = request.getParameter("company_id");
			b = comDao.doubleCheck(com_id);
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
			

		}else if(member_type.equals("employee")){
			EmployeeDao empDao = new EmployeeDao();
			String emp_id;
			emp_id = request.getParameter("employee_id");
			b = empDao.doubleCheck(emp_id);
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
		}
	}
		
	%>
