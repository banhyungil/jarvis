package bean;

public class ReqSkillstmnBean extends Bean {
	
	int REQ_SKILL_STMN_ID;
	int NCS_ID;
	int RECRUIT_LIST_ID;
	
	public int getREQ_SKILL_STMN_ID() {
		return REQ_SKILL_STMN_ID;
	}
	public void setREQ_SKILL_STMN_ID(int rEQ_SKILL_STMN_ID) {
		REQ_SKILL_STMN_ID = rEQ_SKILL_STMN_ID;
	}
	public int getNCS_ID() {
		return NCS_ID;
	}
	public void setNCS_ID(int nCS_ID) {
		NCS_ID = nCS_ID;
	}
	public int getRECRUIT_LIST_ID() {
		return RECRUIT_LIST_ID;
	}
	public void setRECRUIT_LIST_ID(int rECRUIT_LIST_ID) {
		RECRUIT_LIST_ID = rECRUIT_LIST_ID;
	}
	
	@Override
	public String toString() {
		return "ReqSkillstmnBean [REQ_SKILL_STMN_ID=" + REQ_SKILL_STMN_ID + ", NCS_ID=" + NCS_ID + ", RECRUIT_LIST_ID="
				+ RECRUIT_LIST_ID + "]";
	}
	
	
	
}
