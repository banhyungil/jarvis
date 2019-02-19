package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.PortfoliosBean;



public class PortfoliosDao extends Dao {

	PortfoliosBean portBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from PORTFOLIOS order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				portBean.setPORTFOLIO_ID(rs.getInt("PORTFOLIO_ID"));
				portBean.setPORTFOLIO_NAME(rs.getString("PORTFOLIO_NAME"));
				portBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
														
				list.add(portBean);
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
		String sql = "select * from PORTFOLIOS where PORTFOLIO_ID=?";
		PortfoliosBean portBean = new PortfoliosBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				portBean.setPORTFOLIO_ID(rs.getInt("PORTFOLIO_ID"));
				portBean.setPORTFOLIO_NAME(rs.getString("PORTFOLIO_NAME"));
				portBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return portBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		portBean = (PortfoliosBean)bean;
		String sql = "insert into PORTFOLIOS(PORTFOLIO_ID, PORTFOLIO_NAME, CUSTOMER_ID"
				   + " values(?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,  portBean.getPORTFOLIO_ID());
			pstmt.setString(2,  portBean.getPORTFOLIO_NAME());
			pstmt.setString(3,  portBean.getCUSTOMER_ID());
						
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
		portBean = (PortfoliosBean)bean;
		String sql = "update PORTFOLIOS set PORTFOLIO_NAME = ?, CUSTOMER_ID = ?"
					+ "where PORTFOLIO_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
						
			pstmt.setString(1,  portBean.getPORTFOLIO_NAME());
			pstmt.setString(2,  portBean.getCUSTOMER_ID());
			pstmt.setInt(3,  portBean.getPORTFOLIO_ID());
			
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
		String sql = "delete from PORTFOLIOS where PORTFOLIO_ID=?"; 
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
