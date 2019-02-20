package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Bean;
import bean.CustomerBean;

public class CustomerDao extends Dao{
	
	CustomerBean cusBean = null;
	@Override
	public ArrayList<Bean> getList() {
		connect();
		String sql = "select * from customers order by 1";
		ArrayList<Bean> list = new ArrayList<Bean>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				cusBean = new CustomerBean();
				cusBean.setACADEMIC(rs.getString("ACADEMIC"));
				cusBean.setADDRESS(rs.getString("ADDRESS"));
				cusBean.setBIRTH(rs.getString("BIRTH"));
				cusBean.setCHECK_ARMY(rs.getString("CHECK_ARMY"));
				cusBean.setCHECK_JOB_SEEKER(rs.getString("CHECK_JOB_SEEKER"));
				cusBean.setCUSTOMER_CONTACT(rs.getString("CUSTOMER_CONTACT"));
				cusBean.setCUSTOMER_EMAIL(rs.getString("CUSTOMER_EMAIL"));
				cusBean.setCustomer_id(rs.getString("CUSTOMER_ID"));
				cusBean.setCUSTOMER_NAME(rs.getString("CUSTOMER_NAME"));
				cusBean.setCUSTOMER_PW(rs.getString("CUSTOMER_PW"));
				cusBean.setGENDER(rs.getString("GENDER"));		
				
				list.add(cusBean);
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
		String sql = "select * from customers where customer_id=?";
		CustomerBean cusBean = new CustomerBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				cusBean.setACADEMIC(rs.getString("ACADEMIC"));
				cusBean.setADDRESS(rs.getString("ADDRESS"));
				cusBean.setBIRTH(rs.getString("BIRTH"));
				cusBean.setCHECK_ARMY(rs.getString("CHECK_ARMY"));
				cusBean.setCHECK_JOB_SEEKER(rs.getString("CHECK_JOB_SEEKER"));
				cusBean.setCUSTOMER_CONTACT(rs.getString("CUSTOMER_CONTACT"));
				cusBean.setCUSTOMER_EMAIL(rs.getString("CUSTOMER_EMAIL"));
				cusBean.setCustomer_id(rs.getString("CUSTOMER_ID"));
				cusBean.setCUSTOMER_NAME(rs.getString("CUSTOMER_NAME"));
				cusBean.setCUSTOMER_PW(rs.getString("CUSTOMER_PW"));
				cusBean.setGENDER(rs.getString("GENDER"));				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
		return cusBean;
	}

	@Override
	public boolean insert(Bean bean) {
		connect();
		String sql = "insert into customers(ACADEMIC, ADDRESS, BIRTH, CHECK_ARMY, CHECK_JOB_SEEKER, CUSTOMER_CONTACT, CUSTOMER_EMAIL,"
				+ "Customer_id, CUSTOMER_NAME, CUSTOMER_PW, GENDER)"
				+ " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		cusBean = (CustomerBean)bean;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  cusBean.getACADEMIC());
			pstmt.setString(2,  cusBean.getADDRESS());
			pstmt.setString(3,  cusBean.getBIRTH());
			pstmt.setString(4,  cusBean.getCHECK_ARMY());
			pstmt.setString(5,  cusBean.getCHECK_JOB_SEEKER());
			pstmt.setString(6,  cusBean.getCUSTOMER_CONTACT());
			pstmt.setString(7,  cusBean.getCUSTOMER_EMAIL());
			pstmt.setString(8,  cusBean.getCustomer_id());
			pstmt.setString(9,  cusBean.getCUSTOMER_NAME());
			pstmt.setString(10,  cusBean.getCUSTOMER_PW());
			pstmt.setString(11,  cusBean.getGENDER());
			
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
		cusBean = (CustomerBean)bean;
		String sql = "update addrbook set ACADEMIC = ?, ADDRESS = ?, BIRTH = ?, CHECK_ARMY = ?, CHECK_JOB_SEEKER = ?, CUSTOMER_CONTACT = ?, CUSTOMER_EMAIL = ?, " + 
				"CUSTOMER_NAME = ?, CUSTOMER_PW = ?, GENDER = ?, CUSTOMER_CONTACT = ? where Customer_id = ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  cusBean.getACADEMIC());
			pstmt.setString(2,  cusBean.getADDRESS());
			pstmt.setString(3,  cusBean.getBIRTH());
			pstmt.setString(4,  cusBean.getCHECK_ARMY());
			pstmt.setString(5,  cusBean.getCHECK_JOB_SEEKER());
			pstmt.setString(6,  cusBean.getCUSTOMER_CONTACT());
			pstmt.setString(7,  cusBean.getCUSTOMER_EMAIL());
			pstmt.setString(8,  cusBean.getCUSTOMER_NAME());
			pstmt.setString(9,  cusBean.getCUSTOMER_PW());
			pstmt.setString(10,  cusBean.getGENDER());
			pstmt.setString(11,  cusBean.getCUSTOMER_CONTACT());	
			pstmt.setString(12,  cusBean.getCustomer_id());
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
		
		String sql = "delete from customers where customer_id=?"; 
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
        String sql = "{? = call double_check('customer', ?)}";
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
