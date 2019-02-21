package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.RecruitsBean;


public class RecruitsDao extends Dao {
	
	RecruitsBean recrBean = null;
	@Override
	public ArrayList<Bean> getList() {
		return null;
	}

	public ArrayList<Bean> getList(String condition) {
		connect();
		String sql1 = "select * from recruits order by 1";
		String sql2 = "select * from recruits where recruit_end_date > sysdate order by 1";		//¸¶°¨Àü Äõ¸®
		
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			if(condition.equals("all")) {
				pstmt = conn.prepareStatement(sql1);
			} else if (condition.equals("deadline")) {
				pstmt = conn.prepareStatement(sql2);
			}
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				recrBean = new RecruitsBean();
				recrBean.setRECRUIT_INFO_ID(rs.getInt("RECRUIT_INFO_ID"));
				recrBean.setRECRUIT_START_DATE(rs.getString("RECRUIT_START_DATE"));
				recrBean.setRECRUIT_END_DATE(rs.getString("RECRUIT_END_DATE"));
				recrBean.setCOMPANY_ID(rs.getString("COMPANY_ID"));
				recrBean.setWELFARE_LEVEL(rs.getString("WELFARE_LEVEL"));
												
				list.add(recrBean);
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
		String sql = "select * from recruits where RECRUIT_INFO_ID=?";
		RecruitsBean recrBean = new RecruitsBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				recrBean.setRECRUIT_INFO_ID(rs.getInt("RECRUIT_INFO_ID"));
				recrBean.setRECRUIT_START_DATE(rs.getString("RECRUIT_START_DATE"));
				recrBean.setRECRUIT_END_DATE(rs.getString("RECRUIT_END_DATE"));
				recrBean.setCOMPANY_ID(rs.getString("COMPANY_ID"));
				recrBean.setWELFARE_LEVEL(rs.getString("WELFARE_LEVEL"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return recrBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		recrBean = (RecruitsBean)bean;
		String sql = "insert into recruits(RECRUIT_INFO_ID, RECRUIT_START_DATE, RECRUIT_END_DATE, COMPANY_ID, WELFARE_LEVEL)"
					+ " values(?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  recrBean.getRECRUIT_INFO_ID());
			pstmt.setString(2,  recrBean.getRECRUIT_START_DATE());
			pstmt.setString(3,  recrBean.getRECRUIT_END_DATE());
			pstmt.setString(4,  recrBean.getCOMPANY_ID());
			pstmt.setString(5,  recrBean.getWELFARE_LEVEL());
						
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
		recrBean = (RecruitsBean)bean;
		String sql = "update recruits set RECRUIT_START_DATE = ?, RECRUIT_END_DATE = ?, COMPANY_ID = ?, WELFARE_LEVEL = ?"
					+ "where RECRUIT_INFO_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
						
			pstmt.setString(1,  recrBean.getRECRUIT_START_DATE());
			pstmt.setString(2,  recrBean.getRECRUIT_END_DATE());
			pstmt.setString(3,  recrBean.getCOMPANY_ID());
			pstmt.setString(4,  recrBean.getWELFARE_LEVEL());
			pstmt.setInt(5,  recrBean.getRECRUIT_INFO_ID());
			
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
		String sql = "delete from recruits where RECRUIT_INFO_ID=?"; 
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
