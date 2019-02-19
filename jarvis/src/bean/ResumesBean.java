package bean;

public class ResumesBean extends Bean {

	int RESUME_ID;
	String MOTIVE;
	String PERSONALITY;
	String BACKGROUND;
	String SOCIAL;
	String SCHOOL;
	String PLAN;
	String EMPLOYEE_ID;
	String CUSTOMER_ID;
	String COMPANY_ID;
	String RESUME_REV_DATE;
	String FEEDBACK;
	
	public int getRESUME_ID() {
		return RESUME_ID;
	}
	public void setRESUME_ID(int rESUME_ID) {
		RESUME_ID = rESUME_ID;
	}
	public String getMOTIVE() {
		return MOTIVE;
	}
	public void setMOTIVE(String mOTIVE) {
		MOTIVE = mOTIVE;
	}
	public String getPERSONALITY() {
		return PERSONALITY;
	}
	public void setPERSONALITY(String pERSONALITY) {
		PERSONALITY = pERSONALITY;
	}
	public String getBACKGROUND() {
		return BACKGROUND;
	}
	public void setBACKGROUND(String bACKGROUND) {
		BACKGROUND = bACKGROUND;
	}
	public String getSOCIAL() {
		return SOCIAL;
	}
	public void setSOCIAL(String sOCIAL) {
		SOCIAL = sOCIAL;
	}
	public String getSCHOOL() {
		return SCHOOL;
	}
	public void setSCHOOL(String sCHOOL) {
		SCHOOL = sCHOOL;
	}
	public String getPLAN() {
		return PLAN;
	}
	public void setPLAN(String pLAN) {
		PLAN = pLAN;
	}
	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public String getCOMPANY_ID() {
		return COMPANY_ID;
	}
	public void setCOMPANY_ID(String cOMPANY_ID) {
		COMPANY_ID = cOMPANY_ID;
	}
	public String getRESUME_REV_DATE() {
		return RESUME_REV_DATE;
	}
	public void setRESUME_REV_DATE(String rESUME_REV_DATE) {
		RESUME_REV_DATE = rESUME_REV_DATE;
	}
	public String getFEEDBACK() {
		return FEEDBACK;
	}
	public void setFEEDBACK(String fEEDBACK) {
		FEEDBACK = fEEDBACK;
	}
	
	@Override
	public String toString() {
		return "ResumesBean [RESUME_ID=" + RESUME_ID + ", MOTIVE=" + MOTIVE + ", PERSONALITY=" + PERSONALITY
				+ ", BACKGROUND=" + BACKGROUND + ", SOCIAL=" + SOCIAL + ", SCHOOL=" + SCHOOL + ", PLAN=" + PLAN
				+ ", EMPLOYEE_ID=" + EMPLOYEE_ID + ", CUSTOMER_ID=" + CUSTOMER_ID + ", COMPANY_ID=" + COMPANY_ID
				+ ", RESUME_REV_DATE=" + RESUME_REV_DATE + ", FEEDBACK=" + FEEDBACK + "]";
	}
		
	
}
