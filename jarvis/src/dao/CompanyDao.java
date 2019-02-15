package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.CompanyBean;
import bean.CustomerBean;

public class CompanyDao extends Dao{
	
	CompanyBean compBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from companies order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				compBean.setCHARGER(rs.getString("CHARGER"));
				compBean.setCOMPANY_CONTACT(rs.getString("COMPANY_CONTACT"));
				compBean.setCOMPANY_ID(rs.getString("COMPANY_ID"));
				compBean.setCOMPANY_MAIL(rs.getString("COMPANY_MAIL"));
				compBean.setCOMPANY_NAME(rs.getString("COMPANY_NAM"));
				compBean.setCOMPANY_PW(rs.getString("COMPANY_PW"));
				compBean.setCOMPANY_TYPE(rs.getString("COMPANY_TYPE"));
				compBean.setFOUND_DATE(rs.getString("FOUND_DATE"));
				compBean.setLOCATION(rs.getString("LOCATION"));
				compBean.setOWNER(rs.getString("OWNER"));
				compBean.setPROFIT(rs.getInt("PROFIT"));
				compBean.setREGIST_NUM(rs.getString("REGIST_NUM"));
				compBean.setSALES(rs.getInt("SALES"));
				compBean.setSCALE(rs.getString("SCALE"));
				compBean.setWORKERS(rs.getInt("WORKERS"));
				
				list.add(compBean);
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
	public Bean getSingle(String id) {
		connect();
		String sql = "select * from companies where id=?";
		CompanyBean compBean = new CompanyBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				compBean.setCHARGER(rs.getString("CHARGER"));
				compBean.setCOMPANY_CONTACT(rs.getString("COMPANY_CONTACT"));
				compBean.setCOMPANY_ID(rs.getString("COMPANY_ID"));
				compBean.setCOMPANY_MAIL(rs.getString("COMPANY_MAIL"));
				compBean.setCOMPANY_NAME(rs.getString("COMPANY_NAM"));
				compBean.setCOMPANY_PW(rs.getString("COMPANY_PW"));
				compBean.setCOMPANY_TYPE(rs.getString("COMPANY_TYPE"));
				compBean.setFOUND_DATE(rs.getString("FOUND_DATE"));
				compBean.setLOCATION(rs.getString("LOCATION"));
				compBean.setOWNER(rs.getString("OWNER"));
				compBean.setPROFIT(rs.getInt("PROFIT"));
				compBean.setREGIST_NUM(rs.getString("REGIST_NUM"));
				compBean.setSALES(rs.getInt("SALES"));
				compBean.setSCALE(rs.getString("SCALE"));
				compBean.setWORKERS(rs.getInt("WORKERS"));				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return compBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		compBean = (CompanyBean)bean;
		String sql = "insert into companies(CHARGER, COMPANY_CONTACT, COMPANY_ID, COMPANY_MAIL, COMPANY_PW, COMPANY_TYPE,"
				+ "FOUND_DATE, LOCATION, OWNER, REGIST_NUM, SCALE, PROFIT, SALES, WORKERS)"
				+ " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  compBean.getCHARGER());
			pstmt.setString(2,  compBean.getCOMPANY_CONTACT());
			pstmt.setString(3,  compBean.getCOMPANY_ID());
			pstmt.setString(4,  compBean.getCOMPANY_MAIL());
			pstmt.setString(5,  compBean.getCOMPANY_NAME());
			pstmt.setString(6,  compBean.getCOMPANY_PW());
			pstmt.setString(7,  compBean.getCOMPANY_TYPE());
			pstmt.setString(8,  compBean.getFOUND_DATE());
			pstmt.setString(9,  compBean.getLOCATION());
			pstmt.setString(10,  compBean.getOWNER());
			pstmt.setString(11,  compBean.getREGIST_NUM());
			pstmt.setString(12,  compBean.getSCALE());
			pstmt.setInt(13,  compBean.getPROFIT());
			pstmt.setInt(14,  compBean.getSALES());
			pstmt.setInt(15,  compBean.getWORKERS());
			
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
		compBean = (CompanyBean)bean;
		String sql = "update companies set CHARGER = ?, COMPANY_CONTACT = ?, COMPANY_MAIL = ?, COMPANY_PW = ?, COMPANY_TYPE = ?,"
				+ "FOUND_DATE = ?, LOCATION = ?, OWNER = ?, REGIST_NUM = ?, SCALE = ?, PROFIT = ?, SALES = ?, WORKERS = ?"
				+ "where COMPANY_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  compBean.getCHARGER());
			pstmt.setString(2,  compBean.getCOMPANY_CONTACT());	
			pstmt.setString(3,  compBean.getCOMPANY_MAIL());
			pstmt.setString(4,  compBean.getCOMPANY_NAME());
			pstmt.setString(5,  compBean.getCOMPANY_PW());
			pstmt.setString(6,  compBean.getCOMPANY_TYPE());
			pstmt.setString(7,  compBean.getFOUND_DATE());
			pstmt.setString(8,  compBean.getLOCATION());
			pstmt.setString(9,  compBean.getOWNER());
			pstmt.setString(10,  compBean.getREGIST_NUM());
			pstmt.setString(11,  compBean.getSCALE());
			pstmt.setInt(12,  compBean.getPROFIT());
			pstmt.setInt(13,  compBean.getSALES());
			pstmt.setInt(14,  compBean.getWORKERS());	
			pstmt.setString(15,  compBean.getCOMPANY_ID());
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
	public boolean delete(String id) {
		connect();
		String sql = "delete from companies where company_id=?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);					
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
	public Bean getSingle(int id) {
		return null;
	}
	
	@Override
	public boolean delete(int id) {
		return false;
	}
	

}
