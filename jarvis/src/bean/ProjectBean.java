package bean;

public class ProjectBean extends Bean {

	int PROJECT_ID;
	String PROJECT_NAME;
	String PROJECT_START_DATE;
	String BRIEFING;
	String PROJECT_JOB;
	int PARTICIPATION_PERIOD;
	String PROJECT_END_DATE;
	int PORTFOLIO_ID;
	
	public int getPROJECT_ID() {
		return PROJECT_ID;
	}
	public void setPROJECT_ID(int pROJECT_ID) {
		PROJECT_ID = pROJECT_ID;
	}
	public String getPROJECT_NAME() {
		return PROJECT_NAME;
	}
	public void setPROJECT_NAME(String pROJECT_NAME) {
		PROJECT_NAME = pROJECT_NAME;
	}
	public String getPROJECT_START_DATE() {
		return PROJECT_START_DATE;
	}
	public void setPROJECT_START_DATE(String pROJECT_START_DATE) {
		PROJECT_START_DATE = pROJECT_START_DATE;
	}
	public String getBRIEFING() {
		return BRIEFING;
	}
	public void setBRIEFING(String bRIEFING) {
		BRIEFING = bRIEFING;
	}
	public String getPROJECT_JOB() {
		return PROJECT_JOB;
	}
	public void setPROJECT_JOB(String pROJECT_JOB) {
		PROJECT_JOB = pROJECT_JOB;
	}
	public int getPARTICIPATION_PERIOD() {
		return PARTICIPATION_PERIOD;
	}
	public void setPARTICIPATION_PERIOD(int pARTICIPATION_PERIOD) {
		PARTICIPATION_PERIOD = pARTICIPATION_PERIOD;
	}
	public String getPROJECT_END_DATE() {
		return PROJECT_END_DATE;
	}
	public void setPROJECT_END_DATE(String pROJECT_END_DATE) {
		PROJECT_END_DATE = pROJECT_END_DATE;
	}
	public int getPORTFOLIO_ID() {
		return PORTFOLIO_ID;
	}
	public void setPORTFOLIO_ID(int pORTFOLIO_ID) {
		PORTFOLIO_ID = pORTFOLIO_ID;
	}
	
	
	@Override
	public String toString() {
		return "ProjectBean [PROJECT_ID=" + PROJECT_ID + ", PROJECT_NAME=" + PROJECT_NAME + ", PROJECT_START_DATE="
				+ PROJECT_START_DATE + ", BRIEFING=" + BRIEFING + ", PROJECT_JOB=" + PROJECT_JOB
				+ ", PARTICIPATION_PERIOD=" + PARTICIPATION_PERIOD + ", PROJECT_END_DATE=" + PROJECT_END_DATE
				+ ", PORTFOLIO_ID=" + PORTFOLIO_ID + "]";
	}
	
	
	
}
