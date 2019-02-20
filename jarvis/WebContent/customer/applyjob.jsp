<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>

<h2>구직신청</h2>

<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'Seoul')">구직신청</button>
  <button class="tablinks" onclick="openCity(event, 'London')">구직신청</button>
  <button class="tablinks" onclick="openCity(event, 'Monaco')"><a href="cus_main.jsp">메인으로</a></button>
</div>

<div id="Seoul" class="tabcontent">
  <h3>신청여부</h3>
  <p>London is the capital city of England.</p>
</div>

<div id="London" class="tabcontent">
  <h3>결과</h3>
  <p>Paris is the capital of France.</p> 
</div>

<div id="monaco" class="tabcontent">
  <h3>메인으로</h3>
  <p>Paris is the capital of France.</p> 
</div>

   
</body>
</html> 

