<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="bean.CustomerBean" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%=request.getContextPath()%>/css/regit_member.css" type="text/css" rel="stylesheet"></link>
<script>
	function double_check(){
		document.regist_form.action.value = "double_check";
		document.regist_form.submit();
	}	
</script>
</head>
<body>
<%
CustomerBean cusBean = (CustomerBean)session.getAttribute("cusBean");
%>
	<h1 align="center">구직신청</h1>
	<form class="modal-content" name=regist_form action="<%=request.getContextPath()%>/customer/cus_control.jsp">

		<input type="hidden" name="action" value="insert">
		<input type="hidden" name="CUSTOMER_ID" value="<%=cusBean.getCustomer_id()%>">
		<div class="container">
			<input type="hidden" name="table_type" value="job_app"> <label
				for="EMPLOYMENT_TYPE"><b>희망고용형태</b></label> <br> <input type="text"
				 placeholder="Enter Employment_type" name="EMPLOYMENT_TYPE"
				required>  <label for="WELFARE_LEVEL"><b>희망복지수준</b></label>
			<input type="text" placeholder="Enter Password" name="WELFARE_LEVEL" > 
			<label for="WORKING_AREA"><b>희망근무지역</b></label> 
				<input type="text" placeholder="Enter WorkingArea" name="WORKING_AREA" > 

			<label for="REQ_SALARY"><b>희망연봉</b></label><br> 
			<input type="number" name="REQ_SALARY"  placeholder="Enter Req_Salay" ><br> 
			
			<label for="JOB_ID"><b>Job ID</b></label><br> 
			<input type="text" name="JOB_ID"  placeholder="Enter Job_ID" ><br> 
			
			<div class="clearfix">
				<button type="submit" class="signupbtn">구직신청</button>
				<button type="reset" class="cancelbtn">취소</button>				
			</div>
		</div>
	</form>
</body>
</html> 

