package bean;

public class CertjoinBean extends Bean{

	int CERTIFICATION_ID;
	String CERTIFICATION_NAME;
	String CERTIFICATION_CLASS;
	String INSTITUTION;
	int CERTIFICATION_LIST_ID;
	String ACQUIRE_DATE;
	String EXPIRE_DATE;
	String CUSTOMER_ID;
	public int getCERTIFICATION_ID() {
		return CERTIFICATION_ID;
	}
	public void setCERTIFICATION_ID(int cERTIFICATION_ID) {
		CERTIFICATION_ID = cERTIFICATION_ID;
	}
	public String getCERTIFICATION_NAME() {
		return CERTIFICATION_NAME;
	}
	public void setCERTIFICATION_NAME(String cERTIFICATION_NAME) {
		CERTIFICATION_NAME = cERTIFICATION_NAME;
	}
	public String getCERTIFICATION_CLASS() {
		return CERTIFICATION_CLASS;
	}
	public void setCERTIFICATION_CLASS(String cERTIFICATION_CLASS) {
		CERTIFICATION_CLASS = cERTIFICATION_CLASS;
	}
	public String getINSTITUTION() {
		return INSTITUTION;
	}
	public void setINSTITUTION(String iNSTITUTION) {
		INSTITUTION = iNSTITUTION;
	}
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
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	@Override
	public String toString() {
		return "CertjoinBean [CERTIFICATION_ID=" + CERTIFICATION_ID + ", CERTIFICATION_NAME=" + CERTIFICATION_NAME
				+ ", CERTIFICATION_CLASS=" + CERTIFICATION_CLASS + ", INSTITUTION=" + INSTITUTION
				+ ", CERTIFICATION_LIST_ID=" + CERTIFICATION_LIST_ID + ", ACQUIRE_DATE=" + ACQUIRE_DATE
				+ ", EXPIRE_DATE=" + EXPIRE_DATE + ", CUSTOMER_ID=" + CUSTOMER_ID + "]";
	}
	
	
	
}
