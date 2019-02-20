package bean;

public class SkillNcsBean extends Bean {

	 int SKILL_STMN_ID;
	 int NCS_ID;
	 String NCS_NAME;
	 int NCS_LEVEL;
	 String NCS_CLASS;
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
	public String getNCS_NAME() {
		return NCS_NAME;
	}
	public void setNCS_NAME(String nCS_NAME) {
		NCS_NAME = nCS_NAME;
	}
	public int getNCS_LEVEL() {
		return NCS_LEVEL;
	}
	public void setNCS_LEVEL(int nCS_LEVEL) {
		NCS_LEVEL = nCS_LEVEL;
	}
	public String getNCS_CLASS() {
		return NCS_CLASS;
	}
	public void setNCS_CLASS(String nCS_CLASS) {
		NCS_CLASS = nCS_CLASS;
	}
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	@Override
	public String toString() {
		return "SkillNcsBean [SKILL_STMN_ID=" + SKILL_STMN_ID + ", NCS_ID=" + NCS_ID + ", NCS_NAME=" + NCS_NAME
				+ ", NCS_LEVEL=" + NCS_LEVEL + ", NCS_CLASS=" + NCS_CLASS + ", CUSTOMER_ID=" + CUSTOMER_ID + "]";
	}
	 
	 
	 
	
	
	
}
