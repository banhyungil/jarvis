<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="bean.*"%>
<jsp:useBean id="recDao" class="dao.RecruitsDao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%=request.getContextPath()%>/css/getjob.css"
	type="text/css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/table_style.css"
	type="text/css" rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/getjob.js"></script>
</head>
<body>

	<h2>채용정보확인</h2>

	<div class="tab">
		<button class="tablinks" onclick="openCity(event, 'Seoul')">전체
			채용정보</button>
		<button class="tablinks" onclick="openCity(event, 'London')">마감전
			채용정보</button>
		<button class="tablinks" onclick="openCity(event, 'Paris')">나의
			채용정보</button>
		<button class="tablinks" onclick="openCity(event, 'Tokyo')">채용이력</button>
		<button class="tablinks" onclick="openCity(event, 'Monaco')">
			<a href="cus_main.jsp">메인으로</a>
		</button>
	</div>

	<div id="Seoul" class="tabcontent">
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
						ArrayList<Bean> list = recDao.getList();
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

	<div id="London" class="tabcontent">
		<h3>관심있는 채용정보</h3>
		<p>Paris is the capital of France.</p>
	</div>

	<div id="Paris" class="tabcontent">
		<h3>나의 채용정보</h3>
		<p>Tokyo is the capital of Japan.</p>
	</div>

	<div id="Tokyo" class="tabcontent">
		<h3>채용이력</h3>
		<p>Tokyo is the capital of Japan.</p>
	</div>

	<div id="monaco" class="tabcontent">
		<h3>메인으로</h3>
		<p>Paris is the capital of France.</p>
	</div>

</body>
</html>

