package bean;

public class JobsBean extends Bean {
	
	int JOB_ID;
	String JOB_NAME;
	
	public int getJOB_ID() {
		return JOB_ID;
	}
	public void setJOB_ID(int jOB_ID) {
		JOB_ID = jOB_ID;
	}
	public String getJOB_NAME() {
		return JOB_NAME;
	}
	public void setJOB_NAME(String jOB_NAME) {
		JOB_NAME = jOB_NAME;
	}
	
	@Override
	public String toString() {
		return "JobsBean [JOB_ID=" + JOB_ID + ", JOB_NAME=" + JOB_NAME + "]";
	}
	
	
}
