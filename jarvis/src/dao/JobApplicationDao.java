package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.JobApplicationBean;


public class JobApplicationDao extends Dao {
	
	JobApplicationBean jobaBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from job_application order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				jobaBean = new JobApplicationBean();
				
				jobaBean.setJOB_APPLICATION_ID(rs.getInt("JOB_APPLICATION_ID"));
				jobaBean.setEMPLOYMENT_TYPE(rs.getString("EMPLOYMENT_TYPE"));
				jobaBean.setWELFARE_LEVEL(rs.getString("WELFARE_LEVEL"));
				jobaBean.setWORKING_AREA(rs.getString("WORKING_AREA"));
				jobaBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
				jobaBean.setREQ_SALARY(rs.getInt("REQ_SALARY"));
				jobaBean.setJOB_ID(rs.getInt("JOB_ID"));
								
				list.add(jobaBean);
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
		String sql = "select * from job_application where JOB_APPLICATION_ID=?";
		JobApplicationBean jobaBean = new JobApplicationBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				jobaBean.setJOB_APPLICATION_ID(rs.getInt("JOB_APPLICATION_ID"));
				jobaBean.setEMPLOYMENT_TYPE(rs.getString("EMPLOYMENT_TYPE"));
				jobaBean.setWELFARE_LEVEL(rs.getString("WELFARE_LEVEL"));
				jobaBean.setWORKING_AREA(rs.getString("WORKING_AREA"));
				jobaBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
				jobaBean.setREQ_SALARY(rs.getInt("REQ_SALARY"));
				jobaBean.setJOB_ID(rs.getInt("JOB_ID"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return jobaBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		 connect();
	        CallableStatement cs;
	        String sql = "{? = call apply_job(JOB_APP_SEQ.nextval, ?, ?, ?, ?, ?, ?)}";
	        int result;
	        
	        JobApplicationBean jobaBean = (JobApplicationBean)bean;
	        try {
	           cs = conn.prepareCall(sql);
	           cs.registerOutParameter(1, java.sql.Types.INTEGER);
	           cs.setString(2, jobaBean.getEMPLOYMENT_TYPE());
	           cs.setString(3, jobaBean.getWELFARE_LEVEL());
	           cs.setString(4, jobaBean.getWORKING_AREA());
	           cs.setString(5, jobaBean.getCUSTOMER_ID());
	           cs.setInt(6, jobaBean.getREQ_SALARY());
	           cs.setInt(7, jobaBean.getJOB_ID());
	           cs.execute();
	           result = cs.getInt(1);         

	           cs.close();
	        } catch (SQLException e) {
	           e.printStackTrace();
	           return false;
	        }
	        if(result == 1)		//중복인 경우 true
	        	return true;
	        else
	        	return false;
	}
	
	@Override
	public boolean update(Bean bean) {
		connect();
		jobaBean = (JobApplicationBean)bean;
		String sql = "update job_application set CAREER_COMPANY = ?, CAREER_START_DATE = ?, CAREER_END_DATE = ?, CAREER_JOB = ?, CUSTOMER_ID = ?,"
				+ "CAREER_PERIOD = ?, CAREER_POSITION = ?"
				+ "where JOB_APPLICATION_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  jobaBean.getEMPLOYMENT_TYPE());
			pstmt.setString(2,  jobaBean.getWELFARE_LEVEL());
			pstmt.setString(3,  jobaBean.getWORKING_AREA());
			pstmt.setString(4,  jobaBean.getCUSTOMER_ID());
			pstmt.setInt(5,  jobaBean.getREQ_SALARY());
			pstmt.setInt(6,  jobaBean.getJOB_ID());
			pstmt.setInt(7,  jobaBean.getJOB_APPLICATION_ID());
			
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
		String sql = "delete from job_application where JOB_APPLICATION_ID=?"; 
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

