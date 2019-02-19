package bean;

public class RecCertlistBean extends Bean {

	int REC_CERT_LIST_ID;
	String ACQUIRE_DATE;
	String REQUIRED;
	String EXPIRE_DATE;
	int CERTIFICATION_ID;
	int RECRUIT_LIST_ID;
	
	public int getREC_CERT_LIST_ID() {
		return REC_CERT_LIST_ID;
	}
	public void setREC_CERT_LIST_ID(int rEC_CERT_LIST_ID) {
		REC_CERT_LIST_ID = rEC_CERT_LIST_ID;
	}
	public String getACQUIRE_DATE() {
		return ACQUIRE_DATE;
	}
	public void setACQUIRE_DATE(String aCQUIRE_DATE) {
		ACQUIRE_DATE = aCQUIRE_DATE;
	}
	public String getREQUIRED() {
		return REQUIRED;
	}
	public void setREQUIRED(String rEQUIRED) {
		REQUIRED = rEQUIRED;
	}
	public String getEXPIRE_DATE() {
		return EXPIRE_DATE;
	}
	public void setEXPIRE_DATE(String eXPIRE_DATE) {
		EXPIRE_DATE = eXPIRE_DATE;
	}
	public int getCERTIFICATION_ID() {
		return CERTIFICATION_ID;
	}
	public void setCERTIFICATION_ID(int cERTIFICATION_ID) {
		CERTIFICATION_ID = cERTIFICATION_ID;
	}
	public int getRECRUIT_LIST_ID() {
		return RECRUIT_LIST_ID;
	}
	public void setRECRUIT_LIST_ID(int rECRUIT_LIST_ID) {
		RECRUIT_LIST_ID = rECRUIT_LIST_ID;
	}
	
	
	@Override
	public String toString() {
		return "RecCertlistBean [REC_CERT_LIST_ID=" + REC_CERT_LIST_ID + ", ACQUIRE_DATE=" + ACQUIRE_DATE
				+ ", REQUIRED=" + REQUIRED + ", EXPIRE_DATE=" + EXPIRE_DATE + ", CERTIFICATION_ID=" + CERTIFICATION_ID
				+ ", RECRUIT_LIST_ID=" + RECRUIT_LIST_ID + "]";
	}
	
	
	
}
