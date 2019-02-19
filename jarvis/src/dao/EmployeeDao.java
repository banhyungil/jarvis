package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.EmployeeBean;

public class EmployeeDao extends Dao{
	
	EmployeeBean empBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from employees order by 1";
		ArrayList<Bean> list = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				empBean.setDEPARTMENT_NAME(rs.getString("DEPARTMENT_NAME"));
				empBean.setEMPLOYEE_ID(rs.getString("EMPLOYEE_ID"));
				empBean.setEMPLOYEE_NAME(rs.getString("EMPLOYEE_NAME"));
				empBean.setEMPLOYEE_POSITION(rs.getString("EMPLOYEE_POSITION"));
				empBean.setEMPLOYEE_PW(rs.getString("EMPLOYEE_PW"));
				
				list.add(empBean);
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
		String sql = "select * from employees where id=?";
		EmployeeBean empBean = new EmployeeBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				empBean.setDEPARTMENT_NAME(rs.getString("DEPARTMENT_NAME"));
				empBean.setEMPLOYEE_ID(rs.getString("EMPLOYEE_ID"));
				empBean.setEMPLOYEE_NAME(rs.getString("EMPLOYEE_NAME"));
				empBean.setEMPLOYEE_POSITION(rs.getString("EMPLOYEE_POSITION"));
				empBean.setEMPLOYEE_PW(rs.getString("EMPLOYEE_PW"));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return empBean;
	}


	@Override
	public boolean insert(Bean bean) {
		connect();
		String sql = "insert into employees(DEPARTMENT_NAME, EMPLOYEE_ID, EMPLOYEE_NAME, EMPLOYEE_POSITION, EMPLOYEE_PW)"
				+ " values(?, ?, ?, ?, ?)";
		empBean = (EmployeeBean)bean;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  empBean.getDEPARTMENT_NAME());
			pstmt.setString(2,  empBean.getEMPLOYEE_ID());
			pstmt.setString(3,  empBean.getEMPLOYEE_NAME());
			pstmt.setString(4,  empBean.getEMPLOYEE_POSITION());
			pstmt.setString(5,  empBean.getEMPLOYEE_PW());

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
		String sql = "update employees set DEPARTMENT_NAME = ? , EMPLOYEE_NAME = ?, EMPLOYEE_POSITION = ?"
				+ ", EMPLOYEE_PW = ?"
				+ " where  EMPLOYEE_ID = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  empBean.getDEPARTMENT_NAME());
			pstmt.setString(2,  empBean.getEMPLOYEE_ID());
			pstmt.setString(3,  empBean.getEMPLOYEE_NAME());
			pstmt.setString(4,  empBean.getEMPLOYEE_POSITION());
			pstmt.setString(5,  empBean.getEMPLOYEE_PW());		
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
		String sql = "delete from employees where employee_id=?"; 
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
	
	public boolean doubleCheck(String id) {
        connect();
        CallableStatement cs;
        String sql = "{? = call double_check('employee', ?)";
        int result;

        try {
           cs = conn.prepareCall(sql);
           cs.registerOutParameter(1, java.sql.Types.INTEGER);
           cs.setString(2, id);
           cs.execute();
           result = cs.getInt(1);         

           cs.close();
        } catch (SQLException e) {
           e.printStackTrace();
           return false;
        }
        if(result >= 1)		//중복인 경우 true
        	return true;
        else
        	return false;
	}
	
	public boolean loginCheck(String id, String pw) {
		connect();
        CallableStatement cs;
        String sql = "{? = call check_login('customer', ?, ?)}";
        int result;

        try {
           cs = conn.prepareCall(sql);
           cs.registerOutParameter(1, java.sql.Types.INTEGER);
           cs.setString(2, id);
           cs.setString(3, pw);
           cs.execute();
           result = cs.getInt(1);         

           cs.close();
        } catch (SQLException e) {
           e.printStackTrace();
           return false;
        }
        if(result >= 1)		//login이 되었으면
        	return true;
        else
        	return false;
	}
	
	@Override
	public boolean delete(int id) {
		return false;
	}

	
	@Override
	public Bean getSingle(int id) {
		return null;
	}
	
	


}
