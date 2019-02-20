<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="bean.*" %>
     <%@ page import="dao.*" %>
     <jsp:useBean id="carDao" class="dao.CareerDao"></jsp:useBean> <!-- 해당dao로 -->
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
						<th>ID</th>		<!-- 컬럼 -->
						<th>CAREER_JOB</th>
						<th>CAREER_POSITION</th>
						<th>CAREER_COMPANY</th>
						<th>CAREER_START_DATE</th>	
						<th>CAREER_END_DATE</th>
						<th>CAREER_PERIOD</th>
						<th>CUSTOMER_ID</th>			
					</tr>
					<%
					CustomerBean cusBean = (CustomerBean)session.getAttribute("cusBean");   
						ArrayList<Bean> list = carDao.getList(cusBean.getCustomer_id()); //해당 dao로 get list 후 dao도 get list복사해서 추가후 수정
						for (Bean b : (ArrayList<Bean>) list) {
							CareerBean carBean = (CareerBean)b;		//해당 bean으로 받아서 고침
					%>
					<tr>
						<td><%=carBean.getCAREER_ID()%></td>		<!-- 컬럼이랑 맞추면댐 -->
						<td><%=carBean.getCAREER_JOB()%></td>
						<td><%=carBean.getCAREER_POSITION()%></td>
						<td><%=carBean.getCAREER_COMPANY()%></td>
						<td><%=carBean.getCAREER_START_DATE()%></td>
						<td><%=carBean.getCAREER_END_DATE()%></td>
						<td><%=carBean.getCAREER_PERIOD()%></td>
						<td><%=carBean.getCUSTOMER_ID()%></td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</div>
</body>
</html>