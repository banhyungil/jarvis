package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.RecruitlistBean;


public class RecruitlistDao extends Dao{
	
	RecruitlistBean recrlBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from RECRUIT_LISTS order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				recrlBean = new RecruitlistBean();
				recrlBean.setRECRUIT_LIST_ID(rs.getInt("RECRUIT_LIST_ID"));
				recrlBean.setPREFERENTIAL_TREATMENT(rs.getString("PREFERENTIAL_TREATMENT"));
				recrlBean.setRECRUITMENT_NUMBER(rs.getInt("RECRUITMENT_NUMBER"));
				recrlBean.setSALARY(rs.getInt("SALARY"));
				recrlBean.setEMPLOYMENT_TYPE(rs.getString("EMPLOYMENT_TYPE"));
				recrlBean.setEMPLOYMENT_CONDITION(rs.getString("EMPLOYMENT_CONDITION"));
				recrlBean.setRECRUIT_INFO_ID(rs.getInt("RECRUIT_INFO_ID"));
				recrlBean.setJOB_ID(rs.getInt("JOB_ID"));
				recrlBean.setCHECK_CAREER(rs.getString("CHECK_CAREER"));
				
				
				list.add(recrlBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
	public ArrayList<Bean> getList(int rec_info_id) {
		connect();
		String sql = "select * from RECRUIT_LISTS where RECRUIT_INFO_ID = ? order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rec_info_id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				recrlBean = new RecruitlistBean();
				recrlBean.setRECRUIT_LIST_ID(rs.getInt("RECRUIT_LIST_ID"));
				recrlBean.setPREFERENTIAL_TREATMENT(rs.getString("PREFERENTIAL_TREATMENT"));
				recrlBean.setRECRUITMENT_NUMBER(rs.getInt("RECRUITMENT_NUMBER"));
				recrlBean.setSALARY(rs.getInt("SALARY"));
				recrlBean.setEMPLOYMENT_TYPE(rs.getString("EMPLOYMENT_TYPE"));
				recrlBean.setEMPLOYMENT_CONDITION(rs.getString("EMPLOYMENT_CONDITION"));
				recrlBean.setRECRUIT_INFO_ID(rs.getInt("RECRUIT_INFO_ID"));
				recrlBean.setJOB_ID(rs.getInt("JOB_ID"));
				recrlBean.setCHECK_CAREER(rs.getString("CHECK_CAREER"));
				
				
				list.add(recrlBean);
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
		String sql = "select * from RECRUIT_LISTS where RECRUIT_LIST_ID=?";
		RecruitlistBean recrlBean = new RecruitlistBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				recrlBean.setRECRUIT_LIST_ID(rs.getInt("RECRUIT_LIST_ID"));
				recrlBean.setPREFERENTIAL_TREATMENT(rs.getString("PREFERENTIAL_TREATMENT"));
				recrlBean.setRECRUITMENT_NUMBER(rs.getInt("RECRUITMENT_NUMBER"));
				recrlBean.setSALARY(rs.getInt("SALARY"));
				recrlBean.setEMPLOYMENT_TYPE(rs.getString("EMPLOYMENT_TYPE"));
				recrlBean.setEMPLOYMENT_CONDITION(rs.getString("EMPLOYMENT_CONDITION"));
				recrlBean.setRECRUIT_INFO_ID(rs.getInt("RECRUIT_INFO_ID"));
				recrlBean.setJOB_ID(rs.getInt("JOB_ID"));
				recrlBean.setCHECK_CAREER(rs.getString("CHECK_CAREER"));		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return recrlBean;
	}

	@Override
	public boolean insert(Bean bean) {
		connect();
		String sql = "insert into RECRUIT_LISTS(RECRUIT_LIST_ID, PREFERENTIAL_TREATMENT, RECRUITMENT_NUMBER, SALARY, EMPLOYMENT_TYPE, EMPLOYMENT_CONDITION, RECRUIT_INFO_ID,"
				+ "JOB_ID, CHECK_CAREER) "
				+ " values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		recrlBean = (RecruitlistBean)bean;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  recrlBean.getRECRUIT_LIST_ID());
			pstmt.setString(2,  recrlBean.getPREFERENTIAL_TREATMENT());
			pstmt.setInt(3,  recrlBean.getRECRUITMENT_NUMBER());
			pstmt.setInt(4,  recrlBean.getSALARY());
			pstmt.setString(5,  recrlBean.getEMPLOYMENT_TYPE());
			pstmt.setString(6,  recrlBean.getEMPLOYMENT_CONDITION());
			pstmt.setInt(7,  recrlBean.getRECRUIT_INFO_ID());
			pstmt.setInt(8,  recrlBean.getJOB_ID());
			pstmt.setString(9,  recrlBean.getCHECK_CAREER());
			
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
		recrlBean = (RecruitlistBean)bean;
		String sql = "update RECRUIT_LISTS set PREFERENTIAL_TREATMENT = ?, RECRUITMENT_NUMBER = ?, SALARY = ?, EMPLOYMENT_TYPE = ?, EMPLOYMENT_CONDITION = ?, RECRUIT_INFO_ID = ?, JOB_ID = ? where RECRUIT_LIST_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
						
			pstmt.setString(1,  recrlBean.getPREFERENTIAL_TREATMENT());
			pstmt.setInt(2,  recrlBean.getRECRUITMENT_NUMBER());
			pstmt.setInt(3,  recrlBean.getSALARY());
			pstmt.setString(4,  recrlBean.getEMPLOYMENT_TYPE());
			pstmt.setString(5,  recrlBean.getEMPLOYMENT_CONDITION());
			pstmt.setInt(6,  recrlBean.getRECRUIT_INFO_ID());
			pstmt.setInt(7,  recrlBean.getJOB_ID());
			pstmt.setString(8,  recrlBean.getCHECK_CAREER());
			pstmt.setInt(9,  recrlBean.getRECRUIT_LIST_ID());
			
			
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
		
		String sql = "delete from RECRUIT_LISTS where RECRUIT_LIST_ID=?"; 
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
	public boolean delete(String id) {
		return false;
	}

	@Override
	public Bean getSingle(String id) {
		return null;
	}

}

