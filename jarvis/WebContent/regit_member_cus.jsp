<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
      <hr>
      <label for="customer_id"><b>아이디</b></label>
      <input type="text" placeholder="Enter id" name="customer_id" required>

      <label for="customer_pw"><b>비밀번호</b></label>
      <input type="password" placeholder="Enter Password" name="customer_pw" required>

      <label for="pw_repeat"><b>비밀번호 확인</b></label>
      <input type="password" placeholder="Repeat Password" name="pw_repeat" required>
      
      <label for="customer_name"><b>이름</b></label>
      <input type="text" placeholder="Enter Name" name="customer_name" required>
      
      <label for="birth"><b>생년월일</b></label><br>
      <input type="date" name="birth" required><br>
      
      <label for="customer_email"><b>이메일</b></label><br>
      <input type="email" placeholder="Enter Email" name="customer_email" required><br>
      
      <label for="customer_contact"><b>연락처</b></label>
      <input type="text" placeholder="Enter Contact" name="customer_contact" required>
      
      <label for="address"><b>주소</b></label>
      <input type="text" placeholder="Enter Address" name="address" required>
      
      <label for="academic"><b>학력</b></label>
      <input type="text" placeholder="Enter academic" name="academic" required>
      
      <label>
        <input type="radio" name="check_army" value="y" checked> 군필
  		<input type="radio" name="check_army" value="n"> 미필<br>
      </label>
      <label>
        <input type="radio" name="gender" value="male" checked> 남성
  		<input type="radio" name="gender" value="female"> 여성<br>
      </label>  
</body>
</html>