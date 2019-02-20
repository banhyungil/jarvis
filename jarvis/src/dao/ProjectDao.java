package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.ProjectBean;
import bean.ProjoinBean;


public class ProjectDao extends Dao {
	
	ProjectBean projBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from PROJECTS order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				projBean = new ProjectBean();
				
				projBean.setPROJECT_ID(rs.getInt("PROJECT_ID"));
				projBean.setPROJECT_NAME(rs.getString("PROJECT_NAME"));
				projBean.setPROJECT_START_DATE(rs.getString("PROJECT_START_DATE"));
				projBean.setBRIEFING(rs.getString("BRIEFING"));
				projBean.setPROJECT_JOB(rs.getString("PROJECT_JOB"));
				projBean.setPARTICIPATION_PERIOD(rs.getInt("PARTICIPATION_PERIOD"));
				projBean.setPROJECT_END_DATE(rs.getString("PROJECT_END_DATE"));
				projBean.setPORTFOLIO_ID(rs.getInt("PORTFOLIO_ID"));
								
				list.add(projBean);
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
		String sql = "select a.customer_id, a.portfolio_id, a.portfolio_name, b.project_id, b.project_name, b.project_start_date, b.project_end_date, b.participation_period, b.briefing, b.project_job" + 
				" from portfolios a, projects b " + 
				"where a.portfolio_id=b.portfolio_id and a.customer_id=? order by a.customer_id";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cus_id);	
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				ProjoinBean pjBean = new ProjoinBean();
				
				pjBean.setPortfolio_id(rs.getInt("PORTFOLIO_ID"));
				pjBean.setPortfolio_name(rs.getString("PORTFOLIO_NAME"));
				pjBean.setCustomer_id(rs.getString("CUSTOMER_ID"));
				pjBean.setProject_id(rs.getInt("PROJECT_ID"));
				pjBean.setProject_name(rs.getString("PROJECT_NAME"));
				pjBean.setProject_start_date(rs.getString("PROJECT_START_DATE"));
				pjBean.setProject_end_date(rs.getString("PROJECT_END_DATE"));
				pjBean.setParticipation_period(rs.getInt("PARTICIPATION_PERIOD"));
				pjBean.setBriefing(rs.getString("BRIEFING"));
				pjBean.setProject_job(rs.getString("PROJECT_JOB"));
								
				list.add(pjBean);
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
		String sql = "select * from PROJECTS where PROJECT_ID=?";
		ProjectBean projBean = new ProjectBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				projBean.setPROJECT_ID(rs.getInt("PROJECT_ID"));
				projBean.setPROJECT_NAME(rs.getString("PROJECT_NAME"));
				projBean.setPROJECT_START_DATE(rs.getString("PROJECT_START_DATE"));
				projBean.setBRIEFING(rs.getString("BRIEFING"));
				projBean.setPROJECT_JOB(rs.getString("PROJECT_JOB"));
				projBean.setPARTICIPATION_PERIOD(rs.getInt("PARTICIPATION_PERIOD"));
				projBean.setPROJECT_END_DATE(rs.getString("PROJECT_END_DATE"));
				projBean.setPORTFOLIO_ID(rs.getInt("PORTFOLIO_ID"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return projBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		projBean = (ProjectBean)bean;
		String sql = "insert into PROJECTS(PROJECT_ID, PROJECT_NAME, PROJECT_START_DATE, BRIEFING, PROJECT_JOB, PARTICIPATION_PERIOD,"
				+ "PROJECT_END_DATE, PORTFOLIO_ID)"
				+ " values(?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  projBean.getPROJECT_ID());
			pstmt.setString(2,  projBean.getPROJECT_NAME());
			pstmt.setString(3,  projBean.getPROJECT_START_DATE());
			pstmt.setString(4,  projBean.getBRIEFING());
			pstmt.setString(5,  projBean.getPROJECT_JOB());
			pstmt.setInt(6,  projBean.getPARTICIPATION_PERIOD());
			pstmt.setString(7,  projBean.getPROJECT_END_DATE());
			pstmt.setInt(8,  projBean.getPORTFOLIO_ID());
			
			
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
		projBean = (ProjectBean)bean;
		String sql = "update PROJECTS set PROJECT_NAME = ?, PROJECT_START_DATE = ?, BRIEFING = ?, PROJECT_JOB = ?, PARTICIPATION_PERIOD = ?,"
				+ "PROJECT_END_DATE = ?, PORTFOLIO_ID = ?"
				+ "where PROJECT_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  projBean.getPROJECT_NAME());
			pstmt.setString(2,  projBean.getPROJECT_START_DATE());
			pstmt.setString(3,  projBean.getBRIEFING());
			pstmt.setString(4,  projBean.getPROJECT_JOB());
			pstmt.setInt(5,  projBean.getPARTICIPATION_PERIOD());
			pstmt.setString(6,  projBean.getPROJECT_END_DATE());
			pstmt.setInt(7,  projBean.getPORTFOLIO_ID());
			pstmt.setInt(8,  projBean.getPROJECT_ID());
			
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
		String sql = "delete from PROJECTS where PROJECT_ID=?"; 
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
