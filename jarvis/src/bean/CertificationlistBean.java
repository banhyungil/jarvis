package bean;

public class CertificationlistBean extends Bean {

	int CERTIFICATION_LIST_ID;
	String ACQUIRE_DATE;
	String EXPIRE_DATE;
	int CERTIFICATION_ID;
	String CUSTOMER_ID;
	
	public int getCERTIFICATION_LIST_ID() {
		return CERTIFICATION_LIST_ID;
	}
	public void setCERTIFICATION_LIST_ID(int cERTIFICATION_LIST_ID) {
		CERTIFICATION_LIST_ID = cERTIFICATION_LIST_ID;
	}
	public String getACQUIRE_DATE() {
		return ACQUIRE_DATE;
	}
	public void setACQUIRE_DATE(String aCQUIRE_DATE) {
		ACQUIRE_DATE = aCQUIRE_DATE;
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
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	
	@Override
	public String toString() {
		return "CertificationlistBean [CERTIFICATION_LIST_ID=" + CERTIFICATION_LIST_ID + ", ACQUIRE_DATE="
				+ ACQUIRE_DATE + ", EXPIRE_DATE=" + EXPIRE_DATE + ", CERTIFICATION_ID=" + CERTIFICATION_ID
				+ ", CUSTOMER_ID=" + CUSTOMER_ID + "]";
	}
	
	
	
}
