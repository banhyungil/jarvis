<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="bean.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="Seoul" class="tabcontent">
		<div class="tbl-header">
		</div>
		<div class="tbl-content">
			<table cellpadding="0" cellspacing="0" border="0">
				<tbody>
					<tr>
						<th>ID</th>
						<th>성격장단점</th>
						<th>성장배경</th>
						<th>사회생활</th>
						<th>학교생활</th>
						<th>입사 후 포부</th>
						<th>피드백</th>					
					</tr>
					<%
						ArrayList<Bean> list = 
						for (Bean b : (ArrayList<Bean>) list) {
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
	</div>
</body>
</html>