package bean;

public class CareerBean extends Bean {

	int CAREER_ID;
	String CAREER_COMPANY;
	String CAREER_START_DATE;
	String CAREER_END_DATE;
	String CAREER_JOB;
	String CUSTOMER_ID;
	int CAREER_PERIOD;
	String CAREER_POSITION;
	
	public int getCAREER_ID() {
		return CAREER_ID;
	}
	public void setCAREER_ID(int cAREER_ID) {
		CAREER_ID = cAREER_ID;
	}
	public String getCAREER_COMPANY() {
		return CAREER_COMPANY;
	}
	public void setCAREER_COMPANY(String cAREER_COMPANY) {
		CAREER_COMPANY = cAREER_COMPANY;
	}
	public String getCAREER_START_DATE() {
		return CAREER_START_DATE;
	}
	public void setCAREER_START_DATE(String cAREER_START_DATE) {
		CAREER_START_DATE = cAREER_START_DATE;
	}
	public String getCAREER_END_DATE() {
		return CAREER_END_DATE;
	}
	public void setCAREER_END_DATE(String cAREER_END_DATE) {
		CAREER_END_DATE = cAREER_END_DATE;
	}
	public String getCAREER_JOB() {
		return CAREER_JOB;
	}
	public void setCAREER_JOB(String cAREER_JOB) {
		CAREER_JOB = cAREER_JOB;
	}
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public int getCAREER_PERIOD() {
		return CAREER_PERIOD;
	}
	public void setCAREER_PERIOD(int cAREER_PERIOD) {
		CAREER_PERIOD = cAREER_PERIOD;
	}
	public String getCAREER_POSITION() {
		return CAREER_POSITION;
	}
	public void setCAREER_POSITION(String cAREER_POSITION) {
		CAREER_POSITION = cAREER_POSITION;
	}
	
	
	@Override
	public String toString() {
		return "CareerBean [CAREER_ID=" + CAREER_ID + ", CAREER_COMPANY=" + CAREER_COMPANY + ", CAREER_START_DATE="
				+ CAREER_START_DATE + ", CAREER_END_DATE=" + CAREER_END_DATE + ", CAREER_JOB=" + CAREER_JOB
				+ ", CUSTOMER_ID=" + CUSTOMER_ID + ", CAREER_PERIOD=" + CAREER_PERIOD + ", CAREER_POSITION="
				+ CAREER_POSITION + "]";
	}
	
		
	
}
