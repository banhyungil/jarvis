<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="bean.*" %>
    <%@ page import="dao.*" %>
    <jsp:useBean id="resumDao" class="dao.ResumesDao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	function double_check(){
		document.regist_form.action.value = "double_check";
		document.regist_form.submit();
	}	
</script>

</head>
<body>
	<h2>자기소개서</h2>
	
	<button onclick="">등록</button>
	
	<div class="tbl-header">
		</div>
		<div class="tbl-content">
			
			<table cellpadding="0" cellspacing="0" border="0">
				<tbody>
					<tr>
						<th>ID</th> <!-- sssssss -->
						<th>MOTIVE</th>
						<th>PERSONALITY</th>
						<th>BACKGROUND</th>
						<th>SOCIAL</th>	
						<th>SCHOOL</th>
						<th>PLAN</th>
						<th>EMPLOYEE_ID</th>
						<th>CUSTOMER_ID</th>
						<th>COMPANY_ID</th>
						<th>RESUME_REV_DATE</th>
						<th>FEEDBACK</th>					
					</tr>
					<%	
					CustomerBean cusBean1 = (CustomerBean)session.getAttribute("cusBean");   
					ArrayList<Bean> list1 = resumDao.getList(cusBean1.getCustomer_id());
						for (Bean b : (ArrayList<Bean>) list1) {
							ResumesBean resuBean = (ResumesBean)b;
					%>
					<tr>
						<td><%=resuBean.getResume_id()%></td>
						<td><%=resuBean.getMotive()%></td>
						<td><%=resuBean.getPersonality()%></td>
						<td><%=resuBean.getBackground()%></td>
						<td><%=resuBean.getSocial()%></td>
						<td><%=resuBean.getSchool()%></td>
						<td><%=resuBean.getPlan()%></td>
						<td><%=resuBean.getEmployee_id()%></td>
						<td><%=resuBean.getCustomer_id()%></td>
						<td><%=resuBean.getCompany_id()%></td>
						<td><%=resuBean.getResume_rev_date()%></td>
						<td><%=resuBean.getFeedback()%></td>
											<!-- 수정 -->
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
			<input type="
		</div>
</body>
</html>