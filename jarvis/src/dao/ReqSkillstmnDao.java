package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.ReqSkillstmnBean;


public class ReqSkillstmnDao extends Dao {

	ReqSkillstmnBean rssBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from req_skill_stmn order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				rssBean = new ReqSkillstmnBean();
				
				rssBean.setREQ_SKILL_STMN_ID(rs.getInt("REQ_SKILL_STMN_ID"));
				rssBean.setNCS_ID(rs.getInt("NCS_ID"));
				rssBean.setRECRUIT_LIST_ID(rs.getInt("RECRUIT_LIST_ID"));
				
														
				list.add(rssBean);
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
		String sql = "select * from req_skill_stmn where REQ_SKILL_STMN_ID=?";
		ReqSkillstmnBean rssBean = new ReqSkillstmnBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				rssBean.setREQ_SKILL_STMN_ID(rs.getInt("REQ_SKILL_STMN_ID"));
				rssBean.setNCS_ID(rs.getInt("NCS_ID"));
				rssBean.setRECRUIT_LIST_ID(rs.getInt("RECRUIT_LIST_ID"));
				
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return rssBean;
	}
	
	@Override
	public boolean insert(Bean bean) {
		connect();
		rssBean = (ReqSkillstmnBean)bean;
		String sql = "insert into req_skill_stmn(REQ_SKILL_STMN_ID, NCS_ID, RECRUIT_LIST_ID"
				   + " values(?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,  rssBean.getREQ_SKILL_STMN_ID());
			pstmt.setInt(2,  rssBean.getNCS_ID());
			pstmt.setInt(3,  rssBean.getRECRUIT_LIST_ID());
			
						
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
		rssBean = (ReqSkillstmnBean)bean;
		String sql = "update req_skill_stmn set NCS_ID = ?, RECRUIT_LIST_ID = ?"
					+ "where REQ_SKILL_STMN_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
						
			pstmt.setInt(1,  rssBean.getNCS_ID());
			pstmt.setInt(2,  rssBean.getRECRUIT_LIST_ID());
			pstmt.setInt(3,  rssBean.getREQ_SKILL_STMN_ID());
			
			
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
		String sql = "delete from req_skill_stmn where REQ_SKILL_STMN_ID=?"; 
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
