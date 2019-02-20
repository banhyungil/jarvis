package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.SkillNcsBean;
import bean.SkillStmnBean;


public class SkillStmnDao extends Dao {

	SkillStmnBean sksBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from skill_stmn order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				sksBean = new SkillStmnBean();
				
				sksBean.setSKILL_STMN_ID(rs.getInt("SKILL_STMN_ID"));
				sksBean.setNCS_ID(rs.getInt("NCS_ID"));
				sksBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
				
														
				list.add(sksBean);
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
		String sql = "select a.customer_id, a.skill_stmn_id, b.ncs_id, b.ncs_name, b.ncs_level, b.ncs_class from skill_stmn a, ncs b where a.ncs_id=b.ncs_id and a.customer_id=? order by 1;";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cus_id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				SkillNcsBean skncsBean = new SkillNcsBean();
				
				skncsBean.setSKILL_STMN_ID(rs.getInt("SKILL_STMN_ID"));
				skncsBean.setNCS_ID(rs.getInt("NCS_ID"));
				skncsBean.setNCS_NAME(rs.getString("NCS_NAME"));
				skncsBean.setNCS_LEVEL(rs.getInt("NCS_LEVEL"));
				skncsBean.setNCS_CLASS(rs.getString("NCS_CLASS"));
				skncsBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
				
														
				list.add(skncsBean);
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
		String sql = "select * from skill_stmn where SKILL_STMN_ID=?";
		SkillStmnBean sksBean = new SkillStmnBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				sksBean.setSKILL_STMN_ID(rs.getInt("SKILL_STMN_ID"));
				sksBean.setNCS_ID(rs.getInt("NCS_ID"));
				sksBean.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
				
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return sksBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		sksBean = (SkillStmnBean)bean;
		String sql = "insert into skill_stmn(SKILL_STMN_ID, NCS_ID, CUSTOMER_ID"
				   + " values(?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,  sksBean.getSKILL_STMN_ID());
			pstmt.setInt(2,  sksBean.getNCS_ID());
			pstmt.setString(3,  sksBean.getCUSTOMER_ID());
			
						
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
		sksBean = (SkillStmnBean)bean;
		String sql = "update skill_stmn set NCS_ID = ?, CUSTOMER_ID = ?"
					+ "where SKILL_STMN_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
						
			pstmt.setInt(1,  sksBean.getNCS_ID());
			pstmt.setString(2,  sksBean.getCUSTOMER_ID());
			pstmt.setInt(3,  sksBean.getSKILL_STMN_ID());
			
			
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
		String sql = "delete from skill_stmn where SKILL_STMN_ID=?"; 
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
