<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="bean.*"%>
<%@ page import="dao.*"%>
<jsp:useBean id="resumDao" class="dao.ResumesDao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function delete_selected(){
		 console.log(document.getElementsByName("regist_form")[0].getAttribute("action"));
		 var action = document.getElementsByName("regist_form")[0].getAttribute("action");
		var checkBox = document.getElementsByClassName("checkBox");
		action += "?resum=";
		  for (i = 0; i < checkBox.length -1; i++) {
			  if(checkBox[i].checked)
			 	action += checkBox[i].value + ",";
		  }
		  action += checkBox[checkBox.length - 1].value;
		  document.getElementsByName("regist_form")[0].setAttribute("action",action);		
		
		  document.getElementsByName("regist_form")[0].submit();
	}
</script>
</head>
	<h2>자기소개서</h2>

	<button onclick="">
		<a href="<%=request.getContextPath()%>/customer/getinfo/regist_resum.jsp">등록</a>
	</button>
	<button onclick="delete_selected()" value="삭제">삭제</button>
	<div class="tbl-header"></div>
	<div class="tbl-content">
		<table cellpadding="0" cellspacing="0" border="0">
			<tbody>
				<tr>
					<th>ID</th>
					<!-- sssssss -->
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
					int i = 1;
						for (Bean b :  list1) {					
							ResumesBean resuBean = (ResumesBean)b;
					%>
				<tr>
					<td><%=i%></td>
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
					<td>
					<form name="regist_form" id="regist_form" method="post" action="<%=request.getContextPath()%>/customer/cus_control.jsp">
					<input type="hidden" name="action" value="delete">
					<input type="checkbox" class="checkBox" value="<%=resuBean.getResume_id()%>">
					</form>				 
					</td>
					<!-- 수정 -->
				</tr>
					<%
				i += 1;
				}
				%>
				
			</tbody>
		</table>
		</div>
</html>