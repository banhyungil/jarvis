<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/regit_member.css" type="text/css" rel="stylesheet"></link>
</head>
<script>

	function submit1(){
		document.regist_form.motive.value = "sad";
			//document.getElementById("motive").value;
		document.regist_form.personality.value = document.getElementById("personality").value;
		document.regist_form.background.value = document.getElementById("background").value;
		document.regist_form.social.value = document.getElementById("social").value;
		document.regist_form.school.value = document.getElementById("school").value;
		document.regist_form.plan.value = document.getElementById("plan").value;
		console.log(document.regist_form.motive.value);
		//document.regist_form.submit();
	}	
</script>
<body>
	<h1 align="center">자소서등록</h1>
	<form class="modal-content" name=regist_form action="<%=request.getContextPath()%>/customer/cus_control.jsp">

		  <input type="hidden" name="action" value="insert" />
		<input type="text" name="motive" value="insert" />
		<input type="hidden" name="personality" value="insert" />
		<input type="hidden" name="background" value="insert" />
		<input type="hidden" name="social" value="insert" />
		<input type="hidden" name="school" value="insert" />
		<input type="hidden" name="plan" value="insert" />
		<div class="container">
			<input type="hidden" name="table_type" value="resume"> 
			<b>입사동기</b> <br>			
			<textarea id="motive" name="motive1" rows="20" cols="200"></textarea> <br>
			
			<b>성격장단점</b> <br>			
			<textarea id="personality" rows="20" cols="200"></textarea> <br>
			
			<b>성장배경</b> <br>			
			<textarea id="background" rows="20" cols="200"></textarea> <br>
			
			<b>사회생활</b> <br>			
			<textarea id="social" rows="20" cols="200"></textarea> <br>
			
			<b>학교생활</b> <br>			
			<textarea id="school" rows="20" cols="200"></textarea> <br>
			
			<b>입사후포부</b> <br>			
			<textarea id="plan" rows="20" cols="200"></textarea> <br>
					 
			<label for="company_id"><b>기업이름</b></label> <br>
			<input type="text" name="company_id">
			
			<div class="clearfix">
				<button type="reset" class="cancelbtn">Cancel</button>
				<button	type="button" class="signupbtn" onclick="submit1()">Sign Up</button>
			</div>
			
			
		</div>
	</form>
</body>
</html>