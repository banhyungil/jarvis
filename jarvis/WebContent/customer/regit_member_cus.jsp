<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
     <jsp:useBean id="cusBean" class="bean.CustomerBean"></jsp:useBean>
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
	<h1 align="center">�� ȸ������</h1>
	<form class="modal-content" name=regist_form action="control.jsp">

		<input type="hidden" name="action" value="insert">
		<div class="container">
			<input type="hidden" name="member_type" value="customer"> 
			<label for="customer_id"><b>���̵�</b></label> <br>
			<input type="text" class="primary_id" placeholder="Enter id" name="customer_id"> 
			<input type="button" class=double_btn value="�ߺ�Ȯ��" onclick="double_check()"> 
			<label for="customer_pw"><b>��й�ȣ</b></label> <input type="password"
				placeholder="Enter Password" name="customer_pw"> <label
				for="pw_repeat"><b>��й�ȣ Ȯ��</b></label> <input type="password"
				placeholder="Repeat Password" name="pw_repeat"> <label
				for="customer_name"><b>�̸�</b></label> <input type="text"
				placeholder="Enter Name" name="customer_name"> <label
				for="birth"><b>�������</b></label><br> <input type="date"
				name="birth" required><br> <label for="customer_email"><b>�̸���</b></label><br>
			<input type="email" placeholder="Enter Email" name="customer_email"><br>

			<label for="customer_contact"><b>����ó</b></label> <input type="text"
				placeholder="Enter Contact" name="customer_contact"> <label
				for="address"><b>�ּ�</b></label> <input type="text"
				placeholder="Enter Address" name="address"> <label
				for="academic"><b>�з�</b></label> <input type="text"
				placeholder="Enter academic" name="academic"> <label>
				<input type="radio" name="check_army" value="y" checked> ����
				<input type="radio" name="check_army" value="n"> ����<br>
			</label> <label> <input type="radio" name="gender" value="male"
				checked> ���� <input type="radio" name="gender" value="female">
				����<br>
			</label>

			<div class="clearfix">
				<button type="reset" class="cancelbtn">Cancel</button>
				<button	type="submit" class="signupbtn">Sign Up</button>
			</div>
		</div>
	</form>
</body>
</html>