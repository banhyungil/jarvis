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
      <label for="customer_id"><b>���̵�</b></label>
      <input type="text" placeholder="Enter id" name="customer_id" required>

      <label for="customer_pw"><b>��й�ȣ</b></label>
      <input type="password" placeholder="Enter Password" name="customer_pw" required>

      <label for="pw_repeat"><b>��й�ȣ Ȯ��</b></label>
      <input type="password" placeholder="Repeat Password" name="pw_repeat" required>
      
      <label for="customer_name"><b>�̸�</b></label>
      <input type="text" placeholder="Enter Name" name="customer_name" required>
      
      <label for="birth"><b>�������</b></label><br>
      <input type="date" name="birth" required><br>
      
      <label for="customer_email"><b>�̸���</b></label><br>
      <input type="email" placeholder="Enter Email" name="customer_email" required><br>
      
      <label for="customer_contact"><b>����ó</b></label>
      <input type="text" placeholder="Enter Contact" name="customer_contact" required>
      
      <label for="address"><b>�ּ�</b></label>
      <input type="text" placeholder="Enter Address" name="address" required>
      
      <label for="academic"><b>�з�</b></label>
      <input type="text" placeholder="Enter academic" name="academic" required>
      
      <label>
        <input type="radio" name="check_army" value="y" checked> ����
  		<input type="radio" name="check_army" value="n"> ����<br>
      </label>
      <label>
        <input type="radio" name="gender" value="male" checked> ����
  		<input type="radio" name="gender" value="female"> ����<br>
      </label>  
</body>
</html>