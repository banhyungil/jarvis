<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>    
  </head>
  <style media="screen">
    div{
      border : solid 0.5px;
    }
    div.login_main{
      border : solid 1px;
    }
  </style>
  <script type="text/javascript">
    function login(){
      document.login_form.submit();
    }
	function regitMember(){
		document.login_form.action.value = "regist";
		document.login_form.submit();
    }
  </script>
<body>
	<div class="login_main">
		<div class="login_sub1">
			<p>Welcome! Jarvis�� ���Ű� ȯ���մϴ�</p>
		</div>
		<div class="login_sub2">
			<form name="login_form" method=post action="control.jsp">
				<input type="hidden" name="action" value="main">
				<div>
					���̵�<input type="text"> <br> ���<input type="text">
				</div>
				<div>
					<input type="radio" name="member_type" value="customer" checked>
					�� <input type="radio" name="member_type" value="company">
					��� <input type="radio" name="member_type" value="employee">
					���� <br> <input type="submit" value="�α���"> <input
						type="button" value="ȸ������" onclick="regitMember();">
				</div>
			</form>

		</div>
	</div>
</body>
</html>