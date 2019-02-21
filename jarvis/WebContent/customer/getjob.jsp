<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%=request.getContextPath()%>/css/getjob.css?aaa"
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
		<button class="tablinks" onclick="openCity(event, 'Monaco')">
			<a href="cus_main.jsp">메인으로</a>
		</button>
	</div>

	<div id="Seoul" class="tabcontent">
	<h3>전체 채용정보</h3>
		<%@ include file= "getjob/getjob_all.jsp"%>
	</div>

	<div id="London" class="tabcontent">
		<h3>마감전 채용정보</h3>
		<%@ include file= "getjob/getjob_bef_deadline.jsp"%>
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

