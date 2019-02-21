<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="<%=request.getContextPath()%>/css/regit_member.css" type="text/css" rel="stylesheet">
	</link>
</head>

<body>
	<script>
		function submit1() {
			document.regist_form.motive.value = document.getElementById("motive1").value;
			document.regist_form.personality.value = document.getElementById("personality1").value;
			document.regist_form.background.value = document.getElementById("background1").value;
			document.regist_form.social.value = document.getElementById("social1").value;
			document.regist_form.school.value = document.getElementById("school1").value;
			document.regist_form.plan.value = document.getElementById("plan1").value;
			console.log(document.regist_form.motive.value);
			console.log(document.regist_form.motive1.value);
			document.regist_form.submit();
		}	
	</script>

	<h1 align="center">자소서등록</h1>
	<form class="modal-content" name="regist_form" action="<%=request.getContextPath()%>/customer/cus_control.jsp">

		<div class="container">
			<input type="hidden" name="action" value="insert" />
			<input type="hidden" name="motive" value="insert" />
			<input type="hidden" name="personality" value="insert" />
			<input type="hidden" name="background" value="insert" />
			<input type="hidden" name="social" value="insert" />
			<input type="hidden" name="school" value="insert" />
			<input type="hidden" name="plan" value="insert" />
			<input type="hidden" name="table_type" value="resume" />

			<b>입사동기</b> <br>
			<textarea id="motive1" rows="3" cols="200"></textarea> <br>

			<b>성격장단점</b> <br>
			<textarea id="personality1" rows="3" cols="200"></textarea> <br>

			<b>성장배경</b> <br>
			<textarea id="background1" rows="3" cols="200"></textarea> <br>

			<b>사회생활</b> <br>
			<textarea id="social1" rows="3" cols="200"></textarea> <br>

			<b>학교생활</b> <br>
			<textarea id="school1" rows="3" cols="200"></textarea> <br>

			<b>입사후포부</b> <br>
			<textarea id="plan1" rows="3" cols="200"></textarea> <br>

			<label for="company_id"><b>기업이름</b></label> <br>
			<input type="text" name="company_id">

			<div class="clearfix">
				<button type="reset" class="cancelbtn">Cancel</button>
				<button type="button" class="signupbtn" onclick="submit1()">Sign Up</button>
			</div>

		</div>
	</form>
</body>

</html>