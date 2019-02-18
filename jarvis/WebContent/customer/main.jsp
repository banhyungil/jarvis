<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Page Title</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
/* Style the body */
body {
  font-family: Arial;
  margin: 0;
}

/* Header/Logo Title */
.header {
  padding: 60px;
  text-align: center;
  background: #1abc9c;
  color: white;
  font-size: 30px;
}

/* Page Content */
.content {padding:20px;}

a{
	text-decoration: none;
	color : white;
}
.btn {
  border: none;
  color: white;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
}

.success {background-color: #4CAF50;} /* Green */
.success:hover {background-color: deeppink;}

.info {background-color: coral;} /* coral */
.info:hover {background: #0b7dda;}

.warning {background-color: #87CEEB;} /* Orange */
.warning:hover {background: #C71585;}

.danger {background-color: #f44336;} /* Red */ 
.danger:hover {background: gray;}

.default {background-color: #e7e7e7; color: black;} /* Gray */ 
.default:hover {background: #ddd;}


</style>
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
  <button class="btn warning"><a href="getinfo.jsp">정보조회</a></button>
  <button class="btn danger"><a href="applyjob.jsp">구직신청확인</a></button>
  <button class="btn success"><a href="matching.jsp">매칭정보확인</a></button>
</div>

<script>

</script>

</body>
</html>
    