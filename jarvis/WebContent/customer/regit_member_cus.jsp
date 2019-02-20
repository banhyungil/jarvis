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
	<h1 align="center">고객 회원가입</h1>
	<form class="modal-content" name=regist_form action="<%=request.getContextPath()%>/control.jsp">

		<input type="hidden" name="action" value="insert">
		<div class="container">
			<input type="hidden" name="member_type" value="customer"> 
			<label for="customer_id"><b>아이디</b></label> <br>
			<input type="text" class="primary_id" placeholder="Enter id" name="customer_id"> 
			<input type="button" class=double_btn value="중복확인" onclick="double_check()"> 
			<label for="CUSTOMER_PW"><b>비밀번호</b></label> 
			<input type="password" placeholder="Enter Password" name="CUSTOMER_PW"> 
			<label for="pw_repeat"><b>비밀번호 확인</b></label> <input type="password"
				placeholder="Repeat Password" name="pw_repeat"> <label
				for="CUSTOMER_NAME"><b>이름</b></label> <input type="text"
				placeholder="Enter Name" name="CUSTOMER_NAME"> <label
				for="BIRTH"><b>생년월일</b></label><br> <input type="date"
				name="BIRTH" ><br> <label for="CUSTOMER_EMAIL"><b>이메일</b></label><br>
			<input type="email" placeholder="Enter Email" name="CUSTOMER_EMAIL"><br>

			<label for="CUSTOMER_CONTACT"><b>연락처</b></label> <input type="text"
				placeholder="Enter Contact" name="CUSTOMER_CONTACT"> <label
				for="ADDRESS"><b>주소</b></label> <input type="text"
				placeholder="Enter Address" name="ADDRESS"> <label
				for="ACADEMIC"><b>학력</b></label> <input type="text"
				placeholder="Enter academic" name="ACADEMIC"> <label>
				<input type="radio" name="CHECK_ARMY" value="y" checked> 군필
				<input type="radio" name="CHECK_ARMY" value="n"> 미필<br>
			</label> <label> <input type="radio" name="GENDER" value="m"
				checked> 남성 <input type="radio" name="GENDER" value="f">
				여성<br>
			</label>

			<div class="clearfix">
				<button type="reset" class="cancelbtn">Cancel</button>
				<button	type="submit" class="signupbtn">Sign Up</button>
			</div>
		</div>
	</form>
</body>
</html>