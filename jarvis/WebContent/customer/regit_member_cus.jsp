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
	<form class="modal-content" name=regist_form action="<%=request.getContextPath()%>/control.jsp">

		<input type="hidden" name="action" value="insert">
		<div class="container">
			<input type="hidden" name="member_type" value="customer"> 
			<label for="customer_id"><b>���̵�</b></label> <br>
			<input type="text" class="primary_id" placeholder="Enter id" name="customer_id"> 
			<input type="button" class=double_btn value="�ߺ�Ȯ��" onclick="double_check()"> 
			<label for="CUSTOMER_PW"><b>��й�ȣ</b></label> 
			<input type="password" placeholder="Enter Password" name="CUSTOMER_PW"> 
			<label for="pw_repeat"><b>��й�ȣ Ȯ��</b></label> <input type="password"
				placeholder="Repeat Password" name="pw_repeat"> <label
				for="CUSTOMER_NAME"><b>�̸�</b></label> <input type="text"
				placeholder="Enter Name" name="CUSTOMER_NAME"> <label
				for="BIRTH"><b>�������</b></label><br> <input type="date"
				name="BIRTH" ><br> <label for="CUSTOMER_EMAIL"><b>�̸���</b></label><br>
			<input type="email" placeholder="Enter Email" name="CUSTOMER_EMAIL"><br>

			<label for="CUSTOMER_CONTACT"><b>����ó</b></label> <input type="text"
				placeholder="Enter Contact" name="CUSTOMER_CONTACT"> <label
				for="ADDRESS"><b>�ּ�</b></label> <input type="text"
				placeholder="Enter Address" name="ADDRESS"> <label
				for="ACADEMIC"><b>�з�</b></label> <input type="text"
				placeholder="Enter academic" name="ACADEMIC"> <label>
				<input type="radio" name="CHECK_ARMY" value="y" checked> ����
				<input type="radio" name="CHECK_ARMY" value="n"> ����<br>
			</label> <label> <input type="radio" name="GENDER" value="m"
				checked> ���� <input type="radio" name="GENDER" value="f">
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