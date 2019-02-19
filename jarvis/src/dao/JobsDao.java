package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.JobsBean;


public class JobsDao  extends Dao {

	JobsBean jobBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from jobs order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				jobBean = new JobsBean();
				
				jobBean.setJOB_ID(rs.getInt("JOB_ID"));
				jobBean.setJOB_NAME(rs.getString("JOB_NAME"));
				
														
				list.add(jobBean);
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
		String sql = "select * from jobs where JOB_ID=?";
		JobsBean jobBean = new JobsBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				jobBean.setJOB_ID(rs.getInt("JOB_ID"));
				jobBean.setJOB_NAME(rs.getString("JOB_NAME"));
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return jobBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		jobBean = (JobsBean)bean;
		String sql = "insert into jobs(JOB_ID, JOB_NAME)"
				   + " values(?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  jobBean.getJOB_ID());
			pstmt.setString(2,  jobBean.getJOB_NAME());
			
						
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
		jobBean = (JobsBean)bean;
		String sql = "update jobs set JOB_NAME = ?"
					+ "where JOB_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  jobBean.getJOB_NAME());
			pstmt.setInt(2,  jobBean.getJOB_ID());
			
			
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
		String sql = "delete from jobs where JOB_ID=?"; 
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
