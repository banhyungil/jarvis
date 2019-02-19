package bean;

public class RecruitlistBean extends Bean {

	int RECRUIT_LIST_ID;
	String PREFERENTIAL_TREATMENT;
	int RECRUITMENT_NUMBER;
	int SALARY;
	String EMPLOYMENT_TYPE;
	String EMPLOYMENT_CONDITION;
	int RECRUIT_INFO_ID;
	int JOB_ID;
	String CHECK_CAREER;
	
	public int getRECRUIT_LIST_ID() {
		return RECRUIT_LIST_ID;
	}
	public void setRECRUIT_LIST_ID(int rECRUIT_LIST_ID) {
		RECRUIT_LIST_ID = rECRUIT_LIST_ID;
	}
	public String getPREFERENTIAL_TREATMENT() {
		return PREFERENTIAL_TREATMENT;
	}
	public void setPREFERENTIAL_TREATMENT(String pREFERENTIAL_TREATMENT) {
		PREFERENTIAL_TREATMENT = pREFERENTIAL_TREATMENT;
	}
	public int getRECRUITMENT_NUMBER() {
		return RECRUITMENT_NUMBER;
	}
	public void setRECRUITMENT_NUMBER(int rECRUITMENT_NUMBER) {
		RECRUITMENT_NUMBER = rECRUITMENT_NUMBER;
	}
	public int getSALARY() {
		return SALARY;
	}
	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}
	public String getEMPLOYMENT_TYPE() {
		return EMPLOYMENT_TYPE;
	}
	public void setEMPLOYMENT_TYPE(String eMPLOYMENT_TYPE) {
		EMPLOYMENT_TYPE = eMPLOYMENT_TYPE;
	}
	public String getEMPLOYMENT_CONDITION() {
		return EMPLOYMENT_CONDITION;
	}
	public void setEMPLOYMENT_CONDITION(String eMPLOYMENT_CONDITION) {
		EMPLOYMENT_CONDITION = eMPLOYMENT_CONDITION;
	}
	public int getRECRUIT_INFO_ID() {
		return RECRUIT_INFO_ID;
	}
	public void setRECRUIT_INFO_ID(int rECRUIT_INFO_ID) {
		RECRUIT_INFO_ID = rECRUIT_INFO_ID;
	}
	public int getJOB_ID() {
		return JOB_ID;
	}
	public void setJOB_ID(int jOB_ID) {
		JOB_ID = jOB_ID;
	}
	public String getCHECK_CAREER() {
		return CHECK_CAREER;
	}
	public void setCHECK_CAREER(String cHECK_CAREER) {
		CHECK_CAREER = cHECK_CAREER;
	}
	@Override
	public String toString() {
		return "RecruitlistBean [RECRUIT_LIST_ID=" + RECRUIT_LIST_ID + ", PREFERENTIAL_TREATMENT="
				+ PREFERENTIAL_TREATMENT + ", RECRUITMENT_NUMBER=" + RECRUITMENT_NUMBER + ", SALARY=" + SALARY
				+ ", EMPLOYMENT_TYPE=" + EMPLOYMENT_TYPE + ", EMPLOYMENT_CONDITION=" + EMPLOYMENT_CONDITION
				+ ", RECRUIT_INFO_ID=" + RECRUIT_INFO_ID + ", JOB_ID=" + JOB_ID + ", CHECK_CAREER=" + CHECK_CAREER
				+ "]";
	}
	
	
	
	
	
}
