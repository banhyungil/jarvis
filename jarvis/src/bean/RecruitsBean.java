package bean;

public class RecruitsBean extends Bean  {
	
	int RECRUIT_INFO_ID;
	String RECRUIT_START_DATE;
	String RECRUIT_END_DATE;
	String COMPANY_ID;
	String WELFARE_LEVEL;
	
	public int getRECRUIT_INFO_ID() {
		return RECRUIT_INFO_ID;
	}
	public void setRECRUIT_INFO_ID(int rECRUIT_INFO_ID) {
		RECRUIT_INFO_ID = rECRUIT_INFO_ID;
	}
	public String getRECRUIT_START_DATE() {
		return RECRUIT_START_DATE;
	}
	public void setRECRUIT_START_DATE(String rECRUIT_START_DATE) {
		RECRUIT_START_DATE = rECRUIT_START_DATE;
	}
	public String getRECRUIT_END_DATE() {
		return RECRUIT_END_DATE;
	}
	public void setRECRUIT_END_DATE(String rECRUIT_END_DATE) {
		RECRUIT_END_DATE = rECRUIT_END_DATE;
	}
	public String getCOMPANY_ID() {
		return COMPANY_ID;
	}
	public void setCOMPANY_ID(String cOMPANY_ID) {
		COMPANY_ID = cOMPANY_ID;
	}
	public String getWELFARE_LEVEL() {
		return WELFARE_LEVEL;
	}
	public void setWELFARE_LEVEL(String wELFARE_LEVEL) {
		WELFARE_LEVEL = wELFARE_LEVEL;
	}
	@Override
	public String toString() {
		return "RecruitsBean [RECRUIT_INFO_ID=" + RECRUIT_INFO_ID + ", RECRUIT_START_DATE=" + RECRUIT_START_DATE
				+ ", RECRUIT_END_DATE=" + RECRUIT_END_DATE + ", COMPANY_ID=" + COMPANY_ID + ", WELFARE_LEVEL="
				+ WELFARE_LEVEL + "]";
	}
	
	
	
	
	
	
	
}
