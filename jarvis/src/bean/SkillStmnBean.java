package bean;

public class SkillStmnBean extends Bean {

	int SKILL_STMN_ID;
	int NCS_ID;
	String CUSTOMER_ID;
	
	public int getSKILL_STMN_ID() {
		return SKILL_STMN_ID;
	}
	public void setSKILL_STMN_ID(int sKILL_STMN_ID) {
		SKILL_STMN_ID = sKILL_STMN_ID;
	}
	public int getNCS_ID() {
		return NCS_ID;
	}
	public void setNCS_ID(int nCS_ID) {
		NCS_ID = nCS_ID;
	}
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	
	@Override
	public String toString() {
		return "SkillStmnBean [SKILL_STMN_ID=" + SKILL_STMN_ID + ", NCS_ID=" + NCS_ID + ", CUSTOMER_ID=" + CUSTOMER_ID
				+ "]";
	}
	
	
	
	
}
