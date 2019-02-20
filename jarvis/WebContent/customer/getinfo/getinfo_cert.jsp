<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="bean.*" %>
    <%@ page import="dao.*" %>
    <jsp:useBean id="certDao" class="dao.CertificationslistDao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>자격증</h2>
	<div class="tbl-header">
		</div>
		<div class="tbl-content">
			<table cellpadding="0" cellspacing="0" border="0">
				<tbody>
					<tr>
						<th>ID</th>
						<th>CERTIFICATION_NAME</th>
						<th>CERTIFICATION_CLASS</th>
						<th>INSTITUTION</th>
						<th>CERTIFICATION_LIST_ID</th>	
						<th>ACQUIRE_DATE</th>
						<th>EXPIRE_DATE</th>
						<th>CUSTOMER_ID</th>
										
					</tr>
					<%
					CustomerBean cusBean3 = (CustomerBean)session.getAttribute("cusBean");   
					ArrayList<Bean> list3 = certDao.getList(cusBean3.getCustomer_id());
						for (Bean b : (ArrayList<Bean>) list3) {
							CertjoinBean cerjlBean = (CertjoinBean)b;
					%>
					<tr>
						<td><%=cerjlBean.getCERTIFICATION_ID()%></td>
						<td><%=cerjlBean.getCERTIFICATION_NAME()%></td>
						<td><%=cerjlBean.getCERTIFICATION_CLASS()%></td>
						<td><%=cerjlBean.getINSTITUTION()%></td>
						<td><%=cerjlBean.getCERTIFICATION_LIST_ID()%></td>
						<td><%=cerjlBean.getACQUIRE_DATE()%></td>
						<td><%=cerjlBean.getEXPIRE_DATE()%></td>
						<td><%=cerjlBean.getCUSTOMER_ID()%></td>
						
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</div>
</body>
</html>