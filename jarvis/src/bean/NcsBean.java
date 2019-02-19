package bean;

public class NcsBean extends Bean {

	int NCS_ID;
	String NCS_NAME;
	int NCS_LEVEL;
	String NCS_CLASS;
	
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
	
	@Override
	public String toString() {
		return "NcsBean [NCS_ID=" + NCS_ID + ", NCS_NAME=" + NCS_NAME + ", NCS_LEVEL=" + NCS_LEVEL + ", NCS_CLASS="
				+ NCS_CLASS + "]";
	}
	
	
}
