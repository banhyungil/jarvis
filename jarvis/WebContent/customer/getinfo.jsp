<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%=request.getContextPath()%>/css/getinfo.css" type="text/css" rel="stylesheet"></link>
<link href="<%=request.getContextPath()%>/css/table_style.css" type="text/css" rel="stylesheet"></link>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/getinfo.js"></script>
</head>
<body>
<h2>정보조회</h2>

<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'Seoul')">포트폴리오</button>
  <button class="tablinks" onclick="openCity(event, 'London')">자격증</button>
  <button class="tablinks" onclick="openCity(event, 'Paris')">경력</button>
  <button class="tablinks" onclick="openCity(event, 'Tokyo')">보유기술명세서</button>
  <button class="tablinks" onclick="openCity(event, 'Pusan')">자소서</button>
  <button class="tablinks" onclick="openCity(event, 'Monaco')"><a href="cus_main.jsp">메인으로</a></button>
</div>


 <div id="Paris" class="tabcontent">
  <h3>경력</h3>
   <%@ include file= "getinfo/getinfo_career.jsp"%>
</div>

<div id="Pusan" class="tabcontent">
  <h3>자소서</h3>
   <%@ include file= "getinfo/getinfo_resum.jsp"%>
</div> 


<!--
<div id="Seoul" class="getinfo/tabcontent">
  <h3>포트폴리오</h3>
   <//%@ include file="getinfo/getinfo_proj.jsp" %> 
</div>

<div id="London" class="getinfo/tabcontent">
  <h3>자격증</h3>
   <//%@ include file= "getinfo_cert.jsp"%>
</div>



<div id="Tokyo" class="getinfo/tabcontent">
  <h3>보유기술명세서</h3>
   <//%@ //include file= "getinfo_skill.jsp"%>
</div>
-->

<div id="monaco" class="tabcontent">
  <h3>메인으로</h3>
  <p>Paris is the capital of France.</p> 
</div>

</body>
</html> 

