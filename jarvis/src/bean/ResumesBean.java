package bean;

public class ResumesBean extends Bean {

	int resume_id;
	String motive;
	String personality;
	String background;
	String social;
	String school;
	String plan;
	String employee_id;
	String customer_id;
	String company_id;
	String resume_rev_date;
	String feedback;
	public int getResume_id() {
		return resume_id;
	}
	public void setResume_id(int resume_id) {
		this.resume_id = resume_id;
	}
	public String getMotive() {
		return motive;
	}
	public void setMotive(String motive) {
		this.motive = motive;
	}
	public String getPersonality() {
		return personality;
	}
	public void setPersonality(String personality) {
		this.personality = personality;
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public String getResume_rev_date() {
		return resume_rev_date;
	}
	public void setResume_rev_date(String resume_rev_date) {
		this.resume_rev_date = resume_rev_date;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "ResumesBean [resume_id=" + resume_id + ", motive=" + motive + ", personality=" + personality
				+ ", background=" + background + ", social=" + social + ", school=" + school + ", plan=" + plan
				+ ", employee_id=" + employee_id + ", customer_id=" + customer_id + ", company_id=" + company_id
				+ ", resume_rev_date=" + resume_rev_date + ", feedback=" + feedback + "]";
	}
	
	
	
}
