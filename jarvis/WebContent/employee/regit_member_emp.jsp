<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="empBean" class="bean.EmployeeBean"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/regit_member.css" type="text/css" rel="stylesheet"></link>
<script>
function double_check(){
	document.regist_form.action.value = "double_check";
	document.regist_form.submit();
}	
</script>
</head>
<body>
	<h1 align="center">���� ȸ������</h1>
	<form class="modal-content" name=regist_form action="control.jsp">
	
	 <input type="hidden" name="action" value="insert">
		<div class="container">
	 <input type="hidden" name="member_type" value="employee">
	<label for="EMPLOYEE_ID"><b>���̵�</b></label>
      <input type="text" class="primary_id" placeholder="Enter id" name="EMPLOYEE_ID" required>
	<input type="button" class=double_btn value="�ߺ�Ȯ��" onclick="double_check()">
      <label for="EMPLOYEE_PW"><b>��й�ȣ</b></label>
      <input type="password" placeholder="Enter Password" name="EMPLOYEE_PW" required>

      <label for="pw_repeat"><b>��й�ȣ Ȯ��</b></label>
      <input type="password" placeholder="Repeat Password" name="pw_repeat" required>
      
      <label for="EMPLOYEE_NAME"><b>�̸�</b></label>
      <input type="text" placeholder="Enter Name" name="EMPLOYEE_NAME" >
      
      <label for="DEPARTMENT_NAME"><b>�μ��̸�</b></label><br>
      <input type="text" name="DEPARTMENT_NAME" required><br>
      
      <label for="EMPLOYEE_POSITION"><b>����</b></label><br>
      <input type="text" placeholder="Enter Email" name="EMPLOYEE_POSITION" ><br>
      
      <div class="clearfix">
				<button type="reset" class="cancelbtn">Cancel</button>
				<button	type="submit" class="signupbtn">Sign Up</button>
			</div>
		</div>
	</form>
</body>
</html>