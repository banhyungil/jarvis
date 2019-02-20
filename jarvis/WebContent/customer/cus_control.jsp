<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="dao.*" %>
    <%@ page import="bean.*" %>
    <%@ page import="java.util.ArrayList"%>
    <jsp:useBean id="jBean" class="bean.JobApplicationBean"></jsp:useBean>
    <jsp:setProperty property="*" name="jBean"/>
<!DOCTYPE html>
<%
String action = request.getParameter("action");
String table_type = request.getParameter("table_type");

if(action.equals("rec_list")){
	int  rec_info_id = Integer.parseInt(request.getParameter("rec_info_id"));
	RecruitlistDao recLDao = new RecruitlistDao();
	ArrayList<Bean> list = recLDao.getList(rec_info_id);
	request.setAttribute("list", list);
	pageContext.forward("/customer/getjob_list.jsp");
}else if(action.equals("insert")){
	if(table_type.equals("job_app")){
		JobApplicationDao jDao = new JobApplicationDao();
		jDao.insert(jBean);
	}
	%>
	<script>
	alert("备流脚没 己傍");
	</script>
	<%
	response.sendRedirect(request.getContextPath() + "/customer/cus_main.jsp");
}
%>