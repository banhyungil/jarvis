<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <jsp:useBean id="comDao" class="dao.CompanyDao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="regit_member.css?aaaaa" type="text/css" rel="stylesheet"></link>

<script>
	function double_check(){
		alert("id �ߺ�");
		document.regist_form.company_id.value
	}	
</script>
</head>
<body>

    <hr>
    	<h1 align="center">��� ȸ������</h1>
	<form class="modal-content" name=regist_form action="control.jsp">

		<input type="hidden" name="action" value="insert">
		<div class="container">
			<input type="hidden" name="member_type" value="company"> <label
				for="company_id"><b>���̵�</b></label> <input type="text"
				class="primary_id" placeholder="Enter id" name="company_id" required>
			<input type="button" class=double_btn value="�ߺ�Ȯ��" onclick="double_check()">
			<label for="company_pw"><b>��й�ȣ</b></label> <input type="password"
				placeholder="Enter Password" name="company_pw" required> <label
				for="pw_repeat"><b>��й�ȣ Ȯ��</b></label> <input type="password"
				placeholder="Repeat Password" name="pw_repeat" required> <label
				for="company_name"><b>�̸�</b></label> <input type="text"
				placeholder="Enter Name" name="company_name" > <label
				for="company_type"><b>�������</b></label><br> <input type="text"
				name="company_type" required><br> <label for="owner"><b>��ǥ�ڸ�</b></label><br>
			<input type="text" placeholder="Enter owner" name="owner" ><br>

			<label for="charger"><b>����ڸ�</b></label> <input type="text"
				placeholder="Enter charger" name="charger" required> <label
				for="company_contact"><b>����ó</b></label> <input type="text"
				placeholder="Enter contact" name="company_contact" >

			<label for="sales"><b>�������</b></label> <input type="text"
				placeholder="Enter sales" name="sales" > <label
				for="profit"><b>���������</b></label><br> <input type="text"
				placeholder="Enter profit" name="profit" ><br>

			<label for="location"><b>��ġ</b></label> <input type="text"
				placeholder="Enter location" name="location" > <label
				for="found_date"><b>������</b></label> <input type="date"
				placeholder="Enter found_date" name="found_date" > <label
				for="scale"><b>����Ը�</b></label> <input type="text"
				placeholder="Enter scale" name="scale" required> <label
				for="regist_num"><b>����ڹ�ȣ</b></label> <input type="text"
				placeholder="Enter regist_num" name="regist_num" > <label
				for="company_mail"><b>�̸���</b></label> <input type="text"
				placeholder="Enter company_mail" name="company_mail" >

			<label for="workers"><b>�ٷ��ڼ�</b></label> <input type="text"
				placeholder="Enter workers" name="workers" >

			<div class="clearfix">
				<button type="reset" class="cancelbtn">Cancel</button>
				<button	type="submit" class="signupbtn">Sign Up</button>
			</div>
		</div>
	</form>
	
</body>
</html>