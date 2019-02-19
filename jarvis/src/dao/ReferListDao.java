package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.ReferListBean;

public class ReferListDao extends Dao{
	
	ReferListBean referBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from refer_list order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				referBean = new ReferListBean();
				
				referBean.setEMPLOYEE_ID(rs.getString("EMPLOYEE_ID"));
				referBean.setREFER_LIST_ID(rs.getInt("REFER_LIST_ID"));
				referBean.setSTATUS(rs.getString("STATUS"));
				referBean.setRECRUIT_LIST_ID(rs.getInt("RECRUIT_LIST_ID"));
				referBean.setJOB_APPLICATION_ID(rs.getInt("JOB_APPLICATION_ID"));
				referBean.setREFUSAL_REASON(rs.getString("REFUSAL_REASON"));
				referBean.setSCORE(rs.getInt("SCORE"));
								
				list.add(referBean);
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
		String sql = "select * from refer_list where REFER_LIST_ID=?";
		ReferListBean referBean = new ReferListBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				referBean.setEMPLOYEE_ID(rs.getString("EMPLOYEE_ID"));
				referBean.setREFER_LIST_ID(rs.getInt("REFER_LIST_ID"));
				referBean.setSTATUS(rs.getString("STATUS"));
				referBean.setRECRUIT_LIST_ID(rs.getInt("RECRUIT_LIST_ID"));
				referBean.setJOB_APPLICATION_ID(rs.getInt("JOB_APPLICATION_ID"));
				referBean.setREFUSAL_REASON(rs.getString("REFUSAL_REASON"));
				referBean.setSCORE(rs.getInt("SCORE"));		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return referBean;
	}

	@Override
	public boolean insert(Bean bean) {
		connect();
		String sql = "insert into refer_list(EMPLOYEE_ID, REFER_LIST_ID, STATUS, RECRUIT_LIST_ID, JOB_APPLICATION_ID, REFUSAL_REASON, SCORE"
					+ " values(?, ?, ?, ?, ?, ?, ?)";
		referBean = (ReferListBean)bean;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  referBean.getEMPLOYEE_ID());
			pstmt.setInt(2,  referBean.getREFER_LIST_ID());
			pstmt.setString(3,  referBean.getSTATUS());
			pstmt.setInt(4,  referBean.getRECRUIT_LIST_ID());
			pstmt.setInt(5,  referBean.getJOB_APPLICATION_ID());
			pstmt.setString(6,  referBean.getREFUSAL_REASON());
			pstmt.setInt(7,  referBean.getSCORE());
				
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
		referBean = (ReferListBean)bean;
		String sql = "update refer_list set EMPLOYEE_ID = ?, STATUS = ?, RECRUIT_LIST_ID = ?, JOB_APPLICATION_ID = ?, REFUSAL_REASON = ?, SCORE = ? where REFER_LIST_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
						
			pstmt.setString(1,  referBean.getEMPLOYEE_ID());
			pstmt.setString(2,  referBean.getSTATUS());
			pstmt.setInt(3,  referBean.getRECRUIT_LIST_ID());
			pstmt.setInt(4,  referBean.getJOB_APPLICATION_ID());
			pstmt.setString(5,  referBean.getREFUSAL_REASON());
			pstmt.setInt(6,  referBean.getSCORE());
			pstmt.setInt(7,  referBean.getREFER_LIST_ID());
			
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
		
		String sql = "delete from refer_list where REFER_LIST_ID=?"; 
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

