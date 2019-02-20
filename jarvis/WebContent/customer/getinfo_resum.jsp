<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>채용상세정보확인</h2>
	<div class="tbl-header">
		</div>
		<div class="tbl-content">
			<table cellpadding="0" cellspacing="0" border="0">
				<tbody>
					<tr>
						<th>id</th>
						<th>PREFERENTIAL_TREATMENT</th>
						<th>RECRUITMENT_NUMBER</th>
						<th>SALARY</th>
						<th>EMPLOYMENT_TYPE</th>	
						<th>EMPLOYMENT_CONDITION</th>
						<th>RECRUIT_INFO_ID</th>
						<th>JOB_ID</th>
						<th>CHECK_CAREER</th>					
					</tr>
					<%
						ArrayList<Bean> list = (ArrayList<Bean>)request.getAttribute("list");
						for (Bean b : (ArrayList<Bean>) list) {
							RecruitlistBean recLBean = (RecruitlistBean)b;
					%>
					<tr>
						<td><%=recLBean.getRECRUIT_LIST_ID()%></td>
						<td><%=recLBean.getPREFERENTIAL_TREATMENT()%></td>
						<td><%=recLBean.getRECRUITMENT_NUMBER()%></td>
						<td><%=recLBean.getSALARY()%></td>
						<td><%=recLBean.getEMPLOYMENT_TYPE()%></td>
						<td><%=recLBean.getEMPLOYMENT_CONDITION()%></td>
						<td><%=recLBean.getRECRUIT_INFO_ID()%></td>
						<td><%=recLBean.getJOB_ID()%></td>
						<td><%=recLBean.getCHECK_CAREER()%></td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</div>
</body>
</html>