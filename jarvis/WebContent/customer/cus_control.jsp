<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="dao.*" %>
    <%@ page import="bean.*" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<%
String action = request.getParameter("action");


if(action.equals("rec_list")){
	int  rec_info_id = Integer.parseInt(request.getParameter("rec_info_id"));
	RecruitlistDao recLDao = new RecruitlistDao();
	ArrayList<Bean> list = recLDao.getList(rec_info_id);
	request.setAttribute("list", list);
	pageContext.forward("/customer/getjob_list.jsp");
}
%>