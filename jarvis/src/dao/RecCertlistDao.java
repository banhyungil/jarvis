package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.RecCertlistBean;


public class RecCertlistDao extends Dao {
	
	RecCertlistBean reclBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from REC_CERT_LIST order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				reclBean.setREC_CERT_LIST_ID(rs.getInt("REC_CERT_LIST_ID"));
				reclBean.setACQUIRE_DATE(rs.getString("ACQUIRE_DATE"));
				reclBean.setREQUIRED(rs.getString("REQUIRED"));
				reclBean.setEXPIRE_DATE(rs.getString("EXPIRE_DATE"));
				reclBean.setCERTIFICATION_ID(rs.getInt("CERTIFICATION_ID"));
				reclBean.setRECRUIT_LIST_ID(rs.getInt("RECRUIT_LIST_ID"));
								
				list.add(reclBean);
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
		String sql = "select * from REC_CERT_LIST where REC_CERT_LIST_ID=?";
		RecCertlistBean reclBean = new RecCertlistBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				reclBean.setREC_CERT_LIST_ID(rs.getInt("REC_CERT_LIST_ID"));
				reclBean.setACQUIRE_DATE(rs.getString("ACQUIRE_DATE"));
				reclBean.setREQUIRED(rs.getString("REQUIRED"));
				reclBean.setEXPIRE_DATE(rs.getString("EXPIRE_DATE"));
				reclBean.setCERTIFICATION_ID(rs.getInt("CERTIFICATION_ID"));
				reclBean.setRECRUIT_LIST_ID(rs.getInt("RECRUIT_LIST_ID"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return reclBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		reclBean = (RecCertlistBean)bean;
		String sql = "insert into REC_CERT_LIST(REC_CERT_LIST_ID, ACQUIRE_DATE, REQUIRED, EXPIRE_DATE, CERTIFICATION_ID, RECRUIT_LIST_ID)"
					+ " values(?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  reclBean.getREC_CERT_LIST_ID());
			pstmt.setString(2,  reclBean.getACQUIRE_DATE());
			pstmt.setString(3,  reclBean.getREQUIRED());
			pstmt.setString(4,  reclBean.getEXPIRE_DATE());
			pstmt.setInt(5,  reclBean.getCERTIFICATION_ID());
			pstmt.setInt(6,  reclBean.getRECRUIT_LIST_ID());
			
			
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
		reclBean = (RecCertlistBean)bean;
		String sql = "update REC_CERT_LIST set ACQUIRE_DATE = ?, REQUIRED = ?, EXPIRE_DATE = ?, CERTIFICATION_ID = ?, RECRUIT_LIST_ID = ?"
					+ "where REC_CERT_LIST_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
						
			pstmt.setString(1,  reclBean.getACQUIRE_DATE());
			pstmt.setString(2,  reclBean.getREQUIRED());
			pstmt.setString(3,  reclBean.getEXPIRE_DATE());
			pstmt.setInt(4,  reclBean.getCERTIFICATION_ID());
			pstmt.setInt(5,  reclBean.getRECRUIT_LIST_ID());
			pstmt.setInt(6,  reclBean.getREC_CERT_LIST_ID());
			
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
		String sql = "delete from REC_CERT_LIST where REC_CERT_LIST_ID=?"; 
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

