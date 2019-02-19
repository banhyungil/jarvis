package bean;

public class CertificationsBean extends Bean {

	int CERTIFICATION_ID;
	String CERTIFICATION_NAME;
	String CERTIFICATION_CLASS;
	String INSTITUTION;
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
	
	
	@Override
	public String toString() {
		return "CertificationsBean [CERTIFICATION_ID=" + CERTIFICATION_ID + ", CERTIFICATION_NAME=" + CERTIFICATION_NAME
				+ ", CERTIFICATION_CLASS=" + CERTIFICATION_CLASS + ", INSTITUTION=" + INSTITUTION + "]";
	}
	
		
}
