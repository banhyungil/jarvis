package bean;

public class JobApplicationBean extends Bean {

	int JOB_APPLICATION_ID;
	String EMPLOYMENT_TYPE;
	String WELFARE_LEVEL;
	String WORKING_AREA;
	String CUSTOMER_ID;
	int REQ_SALARY;
	int JOB_ID;
	
	public int getJOB_APPLICATION_ID() {
		return JOB_APPLICATION_ID;
	}
	public void setJOB_APPLICATION_ID(int jOB_APPLICATION_ID) {
		JOB_APPLICATION_ID = jOB_APPLICATION_ID;
	}
	public String getEMPLOYMENT_TYPE() {
		return EMPLOYMENT_TYPE;
	}
	public void setEMPLOYMENT_TYPE(String eMPLOYMENT_TYPE) {
		EMPLOYMENT_TYPE = eMPLOYMENT_TYPE;
	}
	public String getWELFARE_LEVEL() {
		return WELFARE_LEVEL;
	}
	public void setWELFARE_LEVEL(String wELFARE_LEVEL) {
		WELFARE_LEVEL = wELFARE_LEVEL;
	}
	public String getWORKING_AREA() {
		return WORKING_AREA;
	}
	public void setWORKING_AREA(String wORKING_AREA) {
		WORKING_AREA = wORKING_AREA;
	}
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public int getREQ_SALARY() {
		return REQ_SALARY;
	}
	public void setREQ_SALARY(int rEQ_SALARY) {
		REQ_SALARY = rEQ_SALARY;
	}
	public int getJOB_ID() {
		return JOB_ID;
	}
	public void setJOB_ID(int jOB_ID) {
		JOB_ID = jOB_ID;
	}
	
	@Override
	public String toString() {
		return "JobApplicationBean [JOB_APPLICATION_ID=" + JOB_APPLICATION_ID + ", EMPLOYMENT_TYPE=" + EMPLOYMENT_TYPE
				+ ", WELFARE_LEVEL=" + WELFARE_LEVEL + ", WORKING_AREA=" + WORKING_AREA + ", CUSTOMER_ID=" + CUSTOMER_ID
				+ ", REQ_SALARY=" + REQ_SALARY + ", JOB_ID=" + JOB_ID + "]";
	}
		
}
