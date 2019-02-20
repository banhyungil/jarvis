<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="bean.*" %>
    <%@ page import="dao.*" %>
    <jsp:useBean id="skillncsDao" class="dao.SkillStmnDao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>보유기술명세서</h2>
	<div class="tbl-header">
		</div>
		<div class="tbl-content">
			<table cellpadding="0" cellspacing="0" border="0">
				<tbody>
					<tr>
						<th>ID</th>
						<th>NCS_ID</th>
						<th>NCS_NAME</th>
						<th>NCS_LEVEL</th>
						<th>NCS_CLASS</th>	
						<th>CUSTOMER_ID</th>
										
					</tr>
					<%
					CustomerBean cusBean4 = (CustomerBean)session.getAttribute("cusBean");   
					ArrayList<Bean> list4 = skillncsDao.getList(cusBean4.getCustomer_id());
						for (Bean b : (ArrayList<Bean>) list4) {
							SkillNcsBean skncsBean = (SkillNcsBean)b;
					%>
					<tr>
						<td><%=skncsBean.getSKILL_STMN_ID()%></td>
						<td><%=skncsBean.getNCS_ID()%></td>
						<td><%=skncsBean.getNCS_NAME()%></td>
						<td><%=skncsBean.getNCS_LEVEL()%></td>
						<td><%=skncsBean.getNCS_CLASS()%></td>
						<td><%=skncsBean.getCUSTOMER_ID()%></td>
					
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</div>
</body>
</html>