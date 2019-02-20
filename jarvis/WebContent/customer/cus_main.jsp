<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Page Title</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%=request.getContextPath()%>/css/cus_main.css" type="text/css" rel="stylesheet">
</head>
<body>

<div class="header">
  <h1>JARVIS</h1><br>
  <h2>YOUR JOB NAVIGATION</h2>
  <p>WELCOME</p>
</div>

<div class="content" align="center">
  <h1>MENU</h1>
  <button class="btn info"><a href="getjob.jsp">채용확인</a></button>
  <button class="btn warning"><a href="cus_resume_list.jsp">정보조회</a></button>
  <button class="btn danger"><a href="applyjob.jsp">구직신청확인</a></button>
  <button class="btn success"><a href="matching.jsp">매칭정보확인</a></button>
</div>

<script>

</script>

</body>
</html>
    