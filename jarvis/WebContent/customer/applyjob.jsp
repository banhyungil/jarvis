<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial;}

/* Style the tab */
.tab {
  overflow: hidden;
  border: 1px solid #ccc;
  background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
.tab button {
  background-color: inherit;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 14px 16px;
  transition: 0.3s;
  font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
  background-color: #f44336;
}

/* Create an active/current tablink class */
.tab button.active {
  background-color: #87CEEB;
}

/* Style the tab content */
.tabcontent {
  display: none;
  padding: 6px 12px;
  border: 1px solid #ccc;
  border-top: none;
}


</style>
</head>
<body>

<h2>정보조회</h2>

<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'Seoul')">신청여부</button>
  <button class="tablinks" onclick="openCity(event, 'London')">결과</button>
  <button class="tablinks" onclick="openCity(event, 'Monaco')"><a href="main.jsp">메인으로</a></button>
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


<script>
function openCity(evt, cityName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}
</script>
   
</body>
</html> 
