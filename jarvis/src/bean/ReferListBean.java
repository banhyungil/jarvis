package bean;

public class ReferListBean extends Bean {

	String EMPLOYEE_ID;
	int REFER_LIST_ID;
	String STATUS;
	int RECRUIT_LIST_ID;
	int JOB_APPLICATION_ID;
	String REFUSAL_REASON;
	int SCORE;
	
	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public int getREFER_LIST_ID() {
		return REFER_LIST_ID;
	}
	public void setREFER_LIST_ID(int rEFER_LIST_ID) {
		REFER_LIST_ID = rEFER_LIST_ID;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public int getRECRUIT_LIST_ID() {
		return RECRUIT_LIST_ID;
	}
	public void setRECRUIT_LIST_ID(int rECRUIT_LIST_ID) {
		RECRUIT_LIST_ID = rECRUIT_LIST_ID;
	}
	public int getJOB_APPLICATION_ID() {
		return JOB_APPLICATION_ID;
	}
	public void setJOB_APPLICATION_ID(int jOB_APPLICATION_ID) {
		JOB_APPLICATION_ID = jOB_APPLICATION_ID;
	}
	public String getREFUSAL_REASON() {
		return REFUSAL_REASON;
	}
	public void setREFUSAL_REASON(String rEFUSAL_REASON) {
		REFUSAL_REASON = rEFUSAL_REASON;
	}
	public int getSCORE() {
		return SCORE;
	}
	public void setSCORE(int sCORE) {
		SCORE = sCORE;
	}
	
	@Override
	public String toString() {
		return "ReferListBean [EMPLOYEE_ID=" + EMPLOYEE_ID + ", REFER_LIST_ID=" + REFER_LIST_ID + ", STATUS=" + STATUS
				+ ", RECRUIT_LIST_ID=" + RECRUIT_LIST_ID + ", JOB_APPLICATION_ID=" + JOB_APPLICATION_ID
				+ ", REFUSAL_REASON=" + REFUSAL_REASON + ", SCORE=" + SCORE + "]";
	}
	
	
}
