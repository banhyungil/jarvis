<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="bean.*" %>
    <jsp:useBean id="recDao1" class="dao.RecruitsDao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="tbl-header">
		</div>
		<div class="tbl-content">
			<table cellpadding="0" cellspacing="0" border="0">
				<tbody>
					<tr>
						<th>id</th>
						<th>start_date</th>
						<th>end_date</th>
						<th>welfare_level</th>
						<th>company_id</th>					
					</tr>
					<%
						ArrayList<Bean> list1 = recDao1.getList("deadline");
						for (Bean b : (ArrayList<Bean>) list1) {
							RecruitsBean recBean = (RecruitsBean)b;
					%>
					<tr>
						<td><a
							href="<%=request.getContextPath()%>/customer/cus_control.jsp?action=rec_list&rec_info_id=<%=recBean.getRECRUIT_INFO_ID()%>"><%=recBean.getRECRUIT_INFO_ID()%></a></td>
						<td><%=recBean.getRECRUIT_START_DATE()%></td>
						<td><%=recBean.getRECRUIT_END_DATE()%></td>
						<td><%=recBean.getWELFARE_LEVEL()%></td>
						<td><%=recBean.getCOMPANY_ID()%></td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</div>	
</body>
</html>