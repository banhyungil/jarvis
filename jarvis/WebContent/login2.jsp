<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/login.css?aaaaaaa" type="text/css" rel="stylesheet"></link>

<script type="text/javascript">
	function regitMember(){
		document.login_form.action.value = "regist";
		document.login_form.submit();
    }
  </script>
</head>
<body>
	<form class="modal-content animate" name="login_form" action="control.jsp">
	<input type="hidden" name="action" value="login">
		<div class="imgcontainer">

			<img src="<%=request.getContextPath()%>/img/login_image.png"
				alt="Avatar" class="avatar">
		</div>

		<div class="container">
			<label for="id"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="id" required> <label
				for="pw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="pw" required>

			<button type="submit">Login</button>

			고객<input type="radio" name="member_type" value="customer" checked>
			기업 <input type="radio" name="member_type" value="company"> 
			직원<input type="radio" name="member_type" value="employee"> 
			<input type="button" class="regist_btn" value="회원가입" onclick="regitMember();">

		</div>

		<div class="container" style="background-color: #f1f1f1">
			<button type="reset" onclick="regitMember()" class="cancelbtn">Cancel</button>
			<span class="psw">Forgot <a href="#">password?</a></span>
		</div>
	</form>
</body>
</html>