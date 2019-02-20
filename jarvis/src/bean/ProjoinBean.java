package bean;

public class ProjoinBean extends Bean {

	int portfolio_id;
	String portfolio_name;
	String customer_id;
	int project_id;
	String project_name;
	String project_start_date;
	String project_end_date;
	int participation_period;
	String briefing;
	String project_job;
	
	@Override
	public String toString() {
		return "ProjoinBean [portfolio_id=" + portfolio_id + ", portfolio_name=" + portfolio_name + ", customer_id="
				+ customer_id + ", project_id=" + project_id + ", project_name=" + project_name
				+ ", project_start_date=" + project_start_date + ", project_end_date=" + project_end_date
				+ ", participation_period=" + participation_period + ", briefing=" + briefing + ", profject_job="
				+ project_job + "]";
	}
	public int getPortfolio_id() {
		return portfolio_id;
	}
	public void setPortfolio_id(int portfolio_id) {
		this.portfolio_id = portfolio_id;
	}
	public String getPortfolio_name() {
		return portfolio_name;
	}
	public void setPortfolio_name(String portfolio_name) {
		this.portfolio_name = portfolio_name;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_start_date() {
		return project_start_date;
	}
	public void setProject_start_date(String project_start_date) {
		this.project_start_date = project_start_date;
	}
	public String getProject_end_date() {
		return project_end_date;
	}
	public void setProject_end_date(String project_end_date) {
		this.project_end_date = project_end_date;
	}
	public int getParticipation_period() {
		return participation_period;
	}
	public void setParticipation_period(int participation_period) {
		this.participation_period = participation_period;
	}
	public String getBriefing() {
		return briefing;
	}
	public void setBriefing(String briefing) {
		this.briefing = briefing;
	}
	public String getProject_job() {
		return project_job;
	}
	public void setProject_job(String profject_job) {
		this.project_job = profject_job;
	}
	
	
	
	
}
