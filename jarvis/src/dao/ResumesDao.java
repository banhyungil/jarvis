package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.ResumesBean;


public class ResumesDao extends Dao {
	
	ResumesBean resuBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from resumes order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				resuBean = new ResumesBean();
				resuBean.setResume_id(rs.getInt("resume_id"));
				resuBean.setMotive(rs.getString("motive"));
				resuBean.setPersonality(rs.getString("personality"));
				resuBean.setBackground(rs.getString("background"));
				resuBean.setSocial(rs.getString("social"));
				resuBean.setSchool(rs.getString("school"));
				resuBean.setPlan(rs.getString("plan"));
				resuBean.setEmployee_id(rs.getString("employee_id"));
				resuBean.setCustomer_id(rs.getString("customer_id"));
				resuBean.setCompany_id(rs.getString("company_id"));
				resuBean.setResume_rev_date(rs.getString("resume_rev_date"));
				resuBean.setFeedback(rs.getString("feedback"));
								
				list.add(resuBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	public ArrayList<Bean> getList(String cus_id) {
		connect();
		String sql = "select resume_id, substr(motive,1,7) motive, substr(personality,1,7) personality, substr(background,1,7) background, substr(social,1,7) social, substr(school,1,7) school, substr(plan,1,7) plan, employee_id, customer_id, company_id, resume_rev_date, feedback " + 
				"from resumes where customer_id=? order by resume_id";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cus_id);				
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				resuBean = new ResumesBean();
				resuBean.setResume_id(rs.getInt("resume_id"));
				resuBean.setMotive(rs.getString("motive"));
				resuBean.setPersonality(rs.getString("personality"));
				resuBean.setBackground(rs.getString("background"));
				resuBean.setSocial(rs.getString("social"));
				resuBean.setSchool(rs.getString("school"));
				resuBean.setPlan(rs.getString("plan"));
				resuBean.setEmployee_id(rs.getString("employee_id"));
				resuBean.setCustomer_id(rs.getString("customer_id"));
				resuBean.setCompany_id(rs.getString("company_id"));
				resuBean.setResume_rev_date(rs.getString("resume_rev_date"));
				resuBean.setFeedback(rs.getString("feedback"));
								
				list.add(resuBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	
	
	@Override
	public Bean getSingle(int id) {
		connect();
		String sql = "select * from resumes where RESUME_ID=?";
		ResumesBean resuBean = new ResumesBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				resuBean.setResume_id(rs.getInt("resume_id"));
				resuBean.setMotive(rs.getString("motive"));
				resuBean.setPersonality(rs.getString("personality"));
				resuBean.setBackground(rs.getString("background"));
				resuBean.setSocial(rs.getString("social"));
				resuBean.setSchool(rs.getString("school"));
				resuBean.setPlan(rs.getString("plan"));
				resuBean.setEmployee_id(rs.getString("employee_id"));
				resuBean.setCustomer_id(rs.getString("customer_id"));
				resuBean.setCompany_id(rs.getString("company_id"));
				resuBean.setResume_rev_date(rs.getString("resume_rev_date"));
				resuBean.setFeedback(rs.getString("feedback"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return resuBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		resuBean = (ResumesBean)bean;
		String sql = "insert into resumes(RESUME_ID, MOTIVE, PERSONALITY, BACKGROUND, SOCIAL, SCHOOL,"
				+ "PLAN, EMPLOYEE_ID, CUSTOMER_ID, COMPANY_ID, RESUME_REV_DATE, FEEDBACK)"
				+ " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,  resuBean.getResume_id());
			pstmt.setString(2,  resuBean.getMotive());
			pstmt.setString(3,  resuBean.getPersonality());
			pstmt.setString(4,  resuBean.getBackground());
			pstmt.setString(5,  resuBean.getSocial());
			pstmt.setString(6,  resuBean.getSchool());
			pstmt.setString(7,  resuBean.getPlan());
			pstmt.setString(8,  resuBean.getEmployee_id());
			pstmt.setString(9,  resuBean.getCustomer_id());
			pstmt.setString(10,  resuBean.getCompany_id());
			pstmt.setString(11,  resuBean.getResume_rev_date());
			pstmt.setString(12,  resuBean.getFeedback());
			
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			disconnect();
			return false;
		}finally {
			disconnect();
		}
		return true;
	}

	@Override
	public boolean update(Bean bean) {
		connect();
		resuBean = (ResumesBean)bean;
		String sql = "update resumes set MOTIVE = ?, PERSONALITY = ?, BACKGROUND = ?, SOCIAL = ?, SCHOOL = ?,"
				+ "PLAN = ?, EMPLOYEE_ID = ?, CUSTOMER_ID = ?, COMPANY_ID = ?, RESUME_REV_DATE = ?, FEEDBACK = ?"
				+ "where RESUME_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,  resuBean.getResume_id());
			pstmt.setString(2,  resuBean.getMotive());
			pstmt.setString(3,  resuBean.getPersonality());
			pstmt.setString(4,  resuBean.getBackground());
			pstmt.setString(5,  resuBean.getSocial());
			pstmt.setString(6,  resuBean.getSchool());
			pstmt.setString(7,  resuBean.getPlan());
			pstmt.setString(8,  resuBean.getEmployee_id());
			pstmt.setString(9,  resuBean.getCustomer_id());
			pstmt.setString(10,  resuBean.getCompany_id());
			pstmt.setString(11,  resuBean.getResume_rev_date());
			pstmt.setString(12,  resuBean.getFeedback());
			pstmt.setInt(12,  resuBean.getResume_id());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			disconnect();
			return false;
		}finally {
			disconnect();
		}
		return true;
	}
	
	@Override
	public boolean delete(int id) {
		connect();
		String sql = "delete from resumes where RESUME_ID=?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);					
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			disconnect();
			return false;
		}finally {
			disconnect();
		}
		
		return true;
	}
	
	
	@Override
	public Bean getSingle(String id) {
		return null;
	}
	
	@Override
	public boolean delete(String id) {
		return false;
	}
	

}
