<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="bean.*" %>
    <%@ page import="dao.*" %>
    <jsp:useBean id="projDao" class="dao.ProjectDao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>포트폴리오</h2>
	<div class="tbl-header">
		</div>
		<div class="tbl-content">
			<table cellpadding="0" cellspacing="0" border="0">
				<tbody>
					<tr>
						<th>ID</th>
						<th>PROJECT_NAME</th>
						<th>CUSTOMER_ID</th>
						<th>PROJECT_ID</th>
						<th>PROJECT_NAME</th>
						<th>PROJECT_START_DATE</th>
						<th>PROJECT_END_DATE</th>
						<th>PROJECT_JOB</th>	
						<th>PARTICIPATION_PERIOD</th>
						<th>BRIEFING</th>
										
					</tr>
					<%	
					CustomerBean cusBean2 = (CustomerBean)session.getAttribute("cusBean");   
					ArrayList<Bean> list2 = projDao.getList(cusBean2.getCustomer_id());
						for (Bean b : (ArrayList<Bean>) list2) {
							ProjoinBean pjBean = (ProjoinBean)b;
					%>
					<tr>
					
						<td><%=pjBean.getPortfolio_id()%></td>
						<td><%=pjBean.getPortfolio_name()%></td>
						<td><%=pjBean.getCustomer_id()%></td>
						<td><%=pjBean.getProject_id()%></td>
						<td><%=pjBean.getProject_name()%></td>
						<td><%=pjBean.getProject_start_date()%></td>
						<td><%=pjBean.getProject_end_date()%></td>
						<td><%=pjBean.getProject_job()%></td>
						<td><%=pjBean.getParticipation_period()%></td>
						<td><%=pjBean.getBriefing()%></td>

																	<!-- 수정 -->
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</div>
</body>
</html>