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
				resuBean.setRESUME_ID(rs.getInt("RESUME_ID"));
				resuBean.setMOTIVE(rs.getString("MOTIVE"));
				resuBean.setPERSONALITY(rs.getString("PERSONALITY"));
				resuBean.setBACKGROUND(rs.getString("BACKGROUND"));
				resuBean.setSOCIAL(rs.getString("SOCIAL"));
				resuBean.setSCHOOL(rs.getString("SCHOOL"));
				resuBean.setPLAN(rs.getString("PLAN"));
				resuBean.setEMPLOYEE_ID(rs.getString("EMPLOYEE_ID"));
				resuBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
				resuBean.setCOMPANY_ID(rs.getString("COMPANY_ID"));
				resuBean.setRESUME_REV_DATE(rs.getString("RESUME_REV_DATE"));
				resuBean.setFEEDBACK(rs.getString("FEEDBACK"));
								
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
				resuBean.setRESUME_ID(rs.getInt("RESUME_ID"));
				resuBean.setMOTIVE(rs.getString("MOTIVE"));
				resuBean.setPERSONALITY(rs.getString("PERSONALITY"));
				resuBean.setBACKGROUND(rs.getString("BACKGROUND"));
				resuBean.setSOCIAL(rs.getString("SOCIAL"));
				resuBean.setSCHOOL(rs.getString("SCHOOL"));
				resuBean.setPLAN(rs.getString("PLAN"));
				resuBean.setEMPLOYEE_ID(rs.getString("EMPLOYEE_ID"));
				resuBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
				resuBean.setCOMPANY_ID(rs.getString("COMPANY_ID"));
				resuBean.setRESUME_REV_DATE(rs.getString("RESUME_REV_DATE"));
				resuBean.setFEEDBACK(rs.getString("FEEDBACK"));
				
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
			
			pstmt.setInt(1,  resuBean.getRESUME_ID());
			pstmt.setString(2,  resuBean.getMOTIVE());
			pstmt.setString(3,  resuBean.getPERSONALITY());
			pstmt.setString(4,  resuBean.getBACKGROUND());
			pstmt.setString(5,  resuBean.getSOCIAL());
			pstmt.setString(6,  resuBean.getSCHOOL());
			pstmt.setString(7,  resuBean.getPLAN());
			pstmt.setString(8,  resuBean.getEMPLOYEE_ID());
			pstmt.setString(9,  resuBean.getCUSTOMER_ID());
			pstmt.setString(10,  resuBean.getCOMPANY_ID());
			pstmt.setString(11,  resuBean.getRESUME_REV_DATE());
			pstmt.setString(12,  resuBean.getFEEDBACK());
			
			
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
			
			pstmt.setString(1,  resuBean.getMOTIVE());
			pstmt.setString(2,  resuBean.getPERSONALITY());
			pstmt.setString(3,  resuBean.getBACKGROUND());
			pstmt.setString(4,  resuBean.getSOCIAL());
			pstmt.setString(5,  resuBean.getSCHOOL());
			pstmt.setString(6,  resuBean.getPLAN());
			pstmt.setString(7,  resuBean.getEMPLOYEE_ID());
			pstmt.setString(8,  resuBean.getCUSTOMER_ID());
			pstmt.setString(9,  resuBean.getCOMPANY_ID());
			pstmt.setString(10,  resuBean.getRESUME_REV_DATE());
			pstmt.setString(11,  resuBean.getFEEDBACK());
			pstmt.setInt(12,  resuBean.getRESUME_ID());
			
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
