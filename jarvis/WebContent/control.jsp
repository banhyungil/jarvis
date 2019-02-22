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
		
	}else if(action.equals("insert")){			//ȸ������ ��ư�� ������ ��
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
		<script type="text/javascript"> 		//ȸ�����Լ��� ǥ���� �� �ִ� �����? ok�� ������ ������ �Ѿ����
		if(confirm('ȸ�������� �����Ͽ����ϴ�.')){		
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
				response.sendRedirect(request.getContextPath() + "/customer/cus_main.jsp");	//bean��ü�� session�������ؾ���			
			}else {		
				%>
				<script>
				alert("ID/Password�� ��ġ���� �ʽ��ϴ�.");
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
				response.sendRedirect(request.getContextPath() + "/customer/com_main.jsp");	//bean��ü�� session�������ؾ���			
			}else {		
				%>
				<script>
				alert("ID/Password�� ��ġ���� �ʽ��ϴ�.");
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
				response.sendRedirect(request.getContextPath() + "/customer/emp_main.jsp?");	//bean��ü�� session�������ؾ���			
			}else {		
				%>
				<script>
				alert("ID/Password�� ��ġ���� �ʽ��ϴ�.");
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
			if(b){		//�ߺ��� ���
				%>
				<script>
				alert("�ߺ��� ���̵��Դϴ�.");
				</script>
				<% 
			} else{
				%>
				<script>
				alert("��밡���� ���̵��Դϴ�.");
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
			if(b){		//�ߺ��� ���
				%>
				<script>
				alert("�ߺ��� ���̵��Դϴ�.");
				</script>
				<% 
			} else{
				%>
				<script>
				alert("��밡���� ���̵��Դϴ�.");
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
			if(b){		//�ߺ��� ���
				%>
				<script>
				alert("�ߺ��� ���̵��Դϴ�.");
				</script>
				<% 
			} else{
				%>
				<script>
				alert("��밡���� ���̵��Դϴ�.");
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
