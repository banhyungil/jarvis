<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <jsp:useBean id="comDao" class="dao.CompanyDao"></jsp:useBean>
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

    <hr>
    	<h1 align="center">기업 회원가입</h1>
	<form class="modal-content" name=regist_form action="control.jsp">

		<input type="hidden" name="action" value="insert">
		<div class="container">
			<input type="hidden" name="member_type" value="company"> <label
				for="COMPANY_ID"><b>아이디</b></label> <br><input type="text"
				class="primary_id" placeholder="Enter id" name="COMPANY_ID" required>
			<input type="button" class=double_btn value="중복확인" onclick="double_check()">
			<label for="COMPANY_PW"><b>비밀번호</b></label> <input type="password"
				placeholder="Enter Password" name="COMPANY_PW" required> <label
				for="pw_repeat"><b>비밀번호 확인</b></label> <input type="password"
				placeholder="Repeat Password" name="pw_repeat" required> <label
				for="COMPANY_NAME"><b>이름</b></label> <input type="text"
				placeholder="Enter Name" name="COMPANY_NAME" > <label
				for="COMPANY_TYPE"><b>기업업종</b></label><br> <input type="text"
				name="COMPANY_TYPE" required><br> <label for="OWNER"><b>대표자명</b></label><br>
			<input type="text" placeholder="Enter owner" name="OWNER" ><br>

			<label for="CHARGER"><b>담당자명</b></label> <input type="text"
				placeholder="Enter charger" name="CHARGER" required> <label
				for="COMPANY_CONTACT"><b>연락처</b></label> <input type="text"
				placeholder="Enter contact" name="COMPANY_CONTACT" >

			<label for="SALES"><b>기업매출</b></label> <input type="text"
				placeholder="Enter sales" name="SALES" > <label
				for="PROFIT"><b>기업순수익</b></label><br> <input type="text"
				placeholder="Enter profit" name="PROFIT" ><br>

			<label for="LOCATION"><b>위치</b></label> <input type="text"
				placeholder="Enter location" name="LOCATION" > <label
				for="FOUND_DATE"><b>설립일</b></label> <input type="date"
				placeholder="Enter found_date" name="FOUND_DATE" > <label
				for="SCALE"><b>기업규모</b></label> <input type="text"
				placeholder="Enter scale" name="SCALE" required> <label
				for="REGIST_NUM"><b>사업자번호</b></label> <input type="text"
				placeholder="Enter regist_num" name="REGIST_NUM" > <label
				for="COMPANY_MAIL"><b>이메일</b></label> <input type="text"
				placeholder="Enter company_mail" name="COMPANY_MAIL" >

			<label for="WORKERS"><b>근로자수</b></label> <input type="text"
				placeholder="Enter workers" name="WORKERS" >

			<div class="clearfix">
				<button type="reset" class="cancelbtn">Cancel</button>
				<button	type="submit" class="signupbtn">Sign Up</button>
			</div>
		</div>
	</form>
	
</body>
</html>