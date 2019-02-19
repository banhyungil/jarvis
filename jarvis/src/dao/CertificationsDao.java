package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.CertificationsBean;

public class CertificationsDao extends Dao {

	CertificationsBean certBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from certifications order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				certBean.setCERTIFICATION_ID(rs.getInt("CERTIFICATION_ID"));
				certBean.setCERTIFICATION_NAME(rs.getString("CERTIFICATION_NAME"));
				certBean.setCERTIFICATION_CLASS(rs.getString("CERTIFICATION_CLASS"));
				certBean.setINSTITUTION(rs.getString("INSTITUTION"));
														
				list.add(certBean);
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
		String sql = "select * from certifications where CERTIFICATION_ID=?";
		CertificationsBean certBean = new CertificationsBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				certBean.setCERTIFICATION_ID(rs.getInt("CERTIFICATION_ID"));
				certBean.setCERTIFICATION_NAME(rs.getString("CERTIFICATION_NAME"));
				certBean.setCERTIFICATION_CLASS(rs.getString("CERTIFICATION_CLASS"));
				certBean.setINSTITUTION(rs.getString("INSTITUTION"));
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return certBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		certBean = (CertificationsBean)bean;
		String sql = "insert into certifications(CERTIFICATION_ID, CERTIFICATION_NAME, CERTIFICATION_CLASS, INSTITUTION"
				   + " values(?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  certBean.getCERTIFICATION_ID());
			pstmt.setString(2,  certBean.getCERTIFICATION_NAME());
			pstmt.setString(3,  certBean.getCERTIFICATION_CLASS());
			pstmt.setString(4,  certBean.getINSTITUTION());
						
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
		certBean = (CertificationsBean)bean;
		String sql = "update certifications set CERTIFICATION_NAME = ?, CERTIFICATION_CLASS = ?, INSTITUTION = ?"
					+ "where CERTIFICATION_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  certBean.getCERTIFICATION_NAME());
			pstmt.setString(2,  certBean.getCERTIFICATION_CLASS());
			pstmt.setString(3,  certBean.getINSTITUTION());
			pstmt.setInt(4,  certBean.getCERTIFICATION_ID());
			
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
		String sql = "delete from certifications where CERTIFICATION_ID=?"; 
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
