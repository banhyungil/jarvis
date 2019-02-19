package bean;

public class PortfoliosBean extends Bean {

	int PORTFOLIO_ID;
	String PORTFOLIO_NAME;
	String CUSTOMER_ID;
	
	public int getPORTFOLIO_ID() {
		return PORTFOLIO_ID;
	}
	public void setPORTFOLIO_ID(int pORTFOLIO_ID) {
		PORTFOLIO_ID = pORTFOLIO_ID;
	}
	public String getPORTFOLIO_NAME() {
		return PORTFOLIO_NAME;
	}
	public void setPORTFOLIO_NAME(String pORTFOLIO_NAME) {
		PORTFOLIO_NAME = pORTFOLIO_NAME;
	}
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	
	@Override
	public String toString() {
		return "PortfoliosBean [PORTFOLIO_ID=" + PORTFOLIO_ID + ", PORTFOLIO_NAME=" + PORTFOLIO_NAME + ", CUSTOMER_ID="
				+ CUSTOMER_ID + "]";
	}
	
	
	
}
