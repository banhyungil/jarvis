package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.NcsBean;


public class NcsDao extends Dao {

	NcsBean nBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from NCS order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				nBean = new NcsBean();
				nBean.setNCS_ID(rs.getInt("NCS_ID"));
				nBean.setNCS_NAME(rs.getString("NCS_NAME"));
				nBean.setNCS_LEVEL(rs.getInt("NCS_LEVEL"));
				nBean.setNCS_CLASS(rs.getString("NCS_CLASS"));
														
				list.add(nBean);
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
		String sql = "select * from NCS where NCS_ID=?";
		NcsBean nBean = new NcsBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				nBean.setNCS_ID(rs.getInt("NCS_ID"));
				nBean.setNCS_NAME(rs.getString("NCS_NAME"));
				nBean.setNCS_LEVEL(rs.getInt("NCS_LEVEL"));
				nBean.setNCS_CLASS(rs.getString("NCS_CLASS"));
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return nBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		nBean = (NcsBean)bean;
		String sql = "insert into NCS(NCS_ID, NCS_NAME, NCS_LEVEL, NCS_CLASS"
				   + " values(?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,  nBean.getNCS_ID());
			pstmt.setString(2,  nBean.getNCS_NAME());
			pstmt.setInt(3,  nBean.getNCS_LEVEL());
			pstmt.setString(4,  nBean.getNCS_CLASS());
						
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
		nBean = (NcsBean)bean;
		String sql = "update NCS set NCS_NAME = ?, NCS_LEVEL = ?, NCS_CLASS = ?"
					+ "where NCS_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
						
			pstmt.setString(1,  nBean.getNCS_NAME());
			pstmt.setInt(2,  nBean.getNCS_LEVEL());
			pstmt.setString(3,  nBean.getNCS_CLASS());
			pstmt.setInt(4,  nBean.getNCS_ID());
			
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
		String sql = "delete from NCS where NCS_ID=?"; 
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
