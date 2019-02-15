<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="regit_member.css?ver=2" type="text/css" rel="stylesheet"></link>
</head>
<body>

 <form class="modal-content" action="/action_page.php">
    <div class="container">
      <h1>회원가입</h1>
      <%
      String memberType = request.getParameter("member_type");
      if(memberType.equals("customer")){
    	  
      }else if(memberType.equals("company")){
    	  
      }else{
    	  
      }
      %>
      <%@include file="regit_member_cus.jsp" %>

      <div class="clearfix">
        <button type="reset" class="cancelbtn">Cancel</button>
        <button type="submit" class="signupbtn">Sign Up</button>
      </div>
    </div>
  </form>
</body>
</html>