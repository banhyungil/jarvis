<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/regit_member.css" type="text/css" rel="stylesheet"></link>
</head>
<body>
	<h1 align="center">자소서등록</h1>
	<form class="modal-content" name=regist_form action="<%=request.getContextPath()%>/control.jsp">

		<input type="hidden" name="action" value="insert">
		<div class="container">
			<input type="hidden" name="member_type" value="customer"> 
			<label for="COMPANY_ID"><b>아이디</b></label> <br>			
			<input type="text"  placeholder="Enter id" name="COMPANY_ID"> 

			<div class="clearfix">
				<button type="reset" class="cancelbtn">Cancel</button>
				<button	type="submit" class="signupbtn">Sign Up</button>
			</div>
		</div>
	</form>
</body>
</html>