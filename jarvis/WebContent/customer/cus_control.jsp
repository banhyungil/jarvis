<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="dao.*" %>
    <%@ page import="bean.*" %>
    <%@ page import="java.util.ArrayList"%>
    <jsp:useBean id="jBean" class="bean.JobApplicationBean"></jsp:useBean>
    <jsp:setProperty property="*" name="jBean"/>
    <jsp:useBean id="resumBean" class="bean.ResumesBean"></jsp:useBean>
    <jsp:setProperty property="*" name="resumBean"/>
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
		CustomerBean cusBean = (CustomerBean)session.getAttribute("cusBean");
		jBean.setCUSTOMER_ID(cusBean.getCustomer_id());
		boolean b = jDao.insert(jBean);
		if(b){
			%>
			<script>
			alert("구직신청 성공");
			</script>
			<%
			response.sendRedirect(request.getContextPath() + "/customer/cus_main.jsp");
		}else{
			%>
			<script>
			alert("이력서를 등록하시거나 희망연봉을 제시해주세요");
			window.history.back();
			</script>
			<%
		}	
			
		
	}else if(table_type.equals("resume")){
		ResumesDao resumDao = new ResumesDao();
		CustomerBean cusBean = (CustomerBean)session.getAttribute("cusBean");
		resumBean.setCustomer_id(cusBean.getCustomer_id());
		resumDao.insert(resumBean);
		%>
		<script>
		alert("이력서 등록 성공");
		</script>
		<%
		response.sendRedirect(request.getContextPath() + "/customer/getinfo.jsp?regist=regist");
		
	}	
}else if(action.equals("delete")){
	String str = request.getParameter("resum");
	String[] idArray = str.split(",");
	if(idArray == null){
		ResumesDao resumDao = new ResumesDao();
		resumDao.delete(Integer.parseInt(str));
	}
	for(String s : idArray){
		ResumesDao resumDao = new ResumesDao();
		resumDao.delete(Integer.parseInt(s));
	}
	response.sendRedirect(request.getContextPath() + "/customer/getinfo.jsp");
}
%>