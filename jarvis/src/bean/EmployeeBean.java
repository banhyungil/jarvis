package bean;

public class EmployeeBean extends Bean{
	String EMPLOYEE_ID;
	String EMPLOYEE_NAME;
	String DEPARTMENT_NAME;
	String EMPLOYEE_POSITION;
	String EMPLOYEE_PW;
	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	@Override
	public String toString() {
		return "EmployeeBean [EMPLOYEE_ID=" + EMPLOYEE_ID + ", EMPLOYEE_NAME=" + EMPLOYEE_NAME + ", DEPARTMENT_NAME="
				+ DEPARTMENT_NAME + ", EMPLOYEE_POSITION=" + EMPLOYEE_POSITION + ", EMPLOYEE_PW=" + EMPLOYEE_PW + "]";
	}
	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public String getEMPLOYEE_NAME() {
		return EMPLOYEE_NAME;
	}
	public void setEMPLOYEE_NAME(String eMPLOYEE_NAME) {
		EMPLOYEE_NAME = eMPLOYEE_NAME;
	}
	public String getDEPARTMENT_NAME() {
		return DEPARTMENT_NAME;
	}
	public void setDEPARTMENT_NAME(String dEPARTMENT_NAME) {
		DEPARTMENT_NAME = dEPARTMENT_NAME;
	}
	public String getEMPLOYEE_POSITION() {
		return EMPLOYEE_POSITION;
	}
	public void setEMPLOYEE_POSITION(String eMPLOYEE_POSITION) {
		EMPLOYEE_POSITION = eMPLOYEE_POSITION;
	}
	public String getEMPLOYEE_PW() {
		return EMPLOYEE_PW;
	}
	public void setEMPLOYEE_PW(String eMPLOYEE_PW) {
		EMPLOYEE_PW = eMPLOYEE_PW;
	}
}
