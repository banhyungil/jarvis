<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="empBean" class="bean.EmployeeBean"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="regit_member.css?aaaaa" type="text/css" rel="stylesheet"></link>
<script>
	function double_check{
		EmployeeDao empDao = new EmployeeDao();
		b = empDao.doubleCheck(id);
		pageContext.forward("regit_member_emp.jsp?isChecked="+ b);
		
		document.regist_form.action.value = "double_check";
		document.login_form.submit();
	}	
</script>
</head>
<body>
	<h1 align="center">���� ȸ������</h1>
	<form class="modal-content" name=regist_form action="control.jsp">
	
	 <input type="hidden" name="action" value="insert">
		<div class="container">
	 <input type="hidden" name="member_type" value="employee">
	<label for="employee_id"><b>���̵�</b></label>
      <input type="text" class="primary_id" placeholder="Enter id" name="employee_id" required>
	<input type="button" class=double_btn value="�ߺ�Ȯ��" onclick="">
      <label for="customer_pw"><b>��й�ȣ</b></label>
      <input type="password" placeholder="Enter Password" name="customer_pw" required>

      <label for="pw_repeat"><b>��й�ȣ Ȯ��</b></label>
      <input type="password" placeholder="Repeat Password" name="pw_repeat" required>
      
      <label for="employee_name"><b>�̸�</b></label>
      <input type="text" placeholder="Enter Name" name="employee_name" >
      
      <label for="department_name"><b>�μ��̸�</b></label><br>
      <input type="text" name="department_name" required><br>
      
      <label for="employee_position"><b>����</b></label><br>
      <input type="text" placeholder="Enter Email" name="employee_position" ><br>
      
      <div class="clearfix">
				<button type="reset" class="cancelbtn">Cancel</button>
				<button	type="submit" class="signupbtn">Sign Up</button>
			</div>
		</div>
	</form>
</body>
</html>