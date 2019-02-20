package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.CareerBean;

public class CareerDao extends Dao {
	
	CareerBean carBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from careers order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				carBean = new CareerBean();
				carBean.setCAREER_ID(rs.getInt("CAREER_ID"));
				carBean.setCAREER_COMPANY(rs.getString("CAREER_COMPANY"));
				carBean.setCAREER_START_DATE(rs.getString("CAREER_START_DATE"));
				carBean.setCAREER_END_DATE(rs.getString("CAREER_END_DATE"));
				carBean.setCAREER_JOB(rs.getString("CAREER_JOB"));
				carBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
				carBean.setCAREER_PERIOD(rs.getInt("CAREER_PERIOD"));
				carBean.setCAREER_POSITION(rs.getString("CAREER_POSITION"));
				
				
				list.add(carBean);
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
		String sql = "select * from careers where customer_id = ? order by 1";	//수정
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cus_id);					//수정
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				carBean = new CareerBean();
				carBean.setCAREER_ID(rs.getInt("CAREER_ID"));
				carBean.setCAREER_COMPANY(rs.getString("CAREER_COMPANY"));
				carBean.setCAREER_START_DATE(rs.getString("CAREER_START_DATE"));
				carBean.setCAREER_END_DATE(rs.getString("CAREER_END_DATE"));
				carBean.setCAREER_JOB(rs.getString("CAREER_JOB"));
				carBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
				carBean.setCAREER_PERIOD(rs.getInt("CAREER_PERIOD"));
				carBean.setCAREER_POSITION(rs.getString("CAREER_POSITION"));
				
				
				list.add(carBean);
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
		String sql = "select * from careers where career_id=?";
		CareerBean carBean = new CareerBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				carBean.setCAREER_ID(rs.getInt("CAREER_ID"));
				carBean.setCAREER_COMPANY(rs.getString("CAREER_COMPANY"));
				carBean.setCAREER_START_DATE(rs.getString("CAREER_START_DATE"));
				carBean.setCAREER_END_DATE(rs.getString("CAREER_END_DATE"));
				carBean.setCAREER_JOB(rs.getString("CAREER_JOB"));
				carBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
				carBean.setCAREER_PERIOD(rs.getInt("CAREER_PERIOD"));
				carBean.setCAREER_POSITION(rs.getString("CAREER_POSITION"));
					
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return carBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		carBean = (CareerBean)bean;
		String sql = "insert into careers(CAREER_ID, CAREER_COMPANY, CAREER_START_DATE, CAREER_END_DATE, CAREER_JOB, CUSTOMER_ID,"
				+ "CAREER_PERIOD, CAREER_POSITION)"
				+ " values(?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  carBean.getCAREER_ID());
			pstmt.setString(2,  carBean.getCAREER_COMPANY());
			pstmt.setString(3,  carBean.getCAREER_START_DATE());
			pstmt.setString(4,  carBean.getCAREER_END_DATE());
			pstmt.setString(5,  carBean.getCAREER_JOB());
			pstmt.setString(6,  carBean.getCUSTOMER_ID());
			pstmt.setInt(7,  carBean.getCAREER_PERIOD());
			pstmt.setString(8,  carBean.getCAREER_POSITION());
			
			
			
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
		carBean = (CareerBean)bean;
		String sql = "update careers set CAREER_COMPANY = ?, CAREER_START_DATE = ?, CAREER_END_DATE = ?, CAREER_JOB = ?, CUSTOMER_ID = ?,"
				+ "CAREER_PERIOD = ?, CAREER_POSITION = ?"
				+ "where CAREER_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  carBean.getCAREER_COMPANY());
			pstmt.setString(2,  carBean.getCAREER_START_DATE());
			pstmt.setString(3,  carBean.getCAREER_END_DATE());
			pstmt.setString(4,  carBean.getCAREER_JOB());
			pstmt.setString(5,  carBean.getCUSTOMER_ID());
			pstmt.setInt(6,  carBean.getCAREER_PERIOD());
			pstmt.setString(7,  carBean.getCAREER_POSITION());
			pstmt.setInt(8,  carBean.getCAREER_ID());
			
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
		String sql = "delete from careers where career_id=?"; 
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
