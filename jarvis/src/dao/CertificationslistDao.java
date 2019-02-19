package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.CertificationlistBean;

public class CertificationslistDao extends Dao {

	CertificationlistBean certlBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from certification_list order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				certlBean = new CertificationlistBean();
				certlBean.setCERTIFICATION_LIST_ID(rs.getInt("CERTIFICATION_LIST_ID"));
				certlBean.setACQUIRE_DATE(rs.getString("ACQUIRE_DATE"));
				certlBean.setEXPIRE_DATE(rs.getString("EXPIRE_DATE"));
				certlBean.setCERTIFICATION_ID(rs.getInt("CERTIFICATION_ID"));
				certlBean.setCUSTOMER_ID(rs.getString("CERTIFICATION_ID"));
										
				list.add(certlBean);
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
		String sql = "select * from certification_list where CERTIFICATION_LIST_ID=?";
		CertificationlistBean certlBean = new CertificationlistBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				certlBean.setCERTIFICATION_LIST_ID(rs.getInt("CERTIFICATION_LIST_ID"));
				certlBean.setACQUIRE_DATE(rs.getString("ACQUIRE_DATE"));
				certlBean.setEXPIRE_DATE(rs.getString("EXPIRE_DATE"));
				certlBean.setCERTIFICATION_ID(rs.getInt("CERTIFICATION_ID"));
				certlBean.setCUSTOMER_ID(rs.getString("CERTIFICATION_ID"));
					
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return certlBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		certlBean = (CertificationlistBean)bean;
		String sql = "insert into certification_list(CERTIFICATION_LIST_ID, ACQUIRE_DATE, EXPIRE_DATE, CERTIFICATION_ID, CUSTOMER_ID"
				   + " values(?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  certlBean.getCERTIFICATION_LIST_ID());
			pstmt.setString(2,  certlBean.getACQUIRE_DATE());
			pstmt.setString(3,  certlBean.getEXPIRE_DATE());
			pstmt.setInt(4,  certlBean.getCERTIFICATION_ID());
			pstmt.setString(5,  certlBean.getCUSTOMER_ID());
						
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
		certlBean = (CertificationlistBean)bean;
		String sql = "update certification_list set CERTIFICATION_LIST_ID = ?, ACQUIRE_DATE = ?, EXPIRE_DATE = ?, CERTIFICATION_ID = ?, CUSTOMER_ID = ?"
					+ "where CERTIFICATION_LIST_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  certlBean.getACQUIRE_DATE());
			pstmt.setString(2,  certlBean.getEXPIRE_DATE());
			pstmt.setInt(3,  certlBean.getCERTIFICATION_ID());
			pstmt.setString(4,  certlBean.getCUSTOMER_ID());
			pstmt.setInt(5,  certlBean.getCERTIFICATION_LIST_ID());
			
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
		String sql = "delete from certification_list where CERTIFICATION_LIST_ID=?"; 
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

	

