package com.projects.hibernate5;

public class partime_emp extends employee{
    private int Pay_as_hours;
    private String Contract_duration;
	public int getPay_as_hours() {
		return Pay_as_hours;
	}
	public void setPay_as_hours(int pay_as_hours) {
		this.Pay_as_hours = pay_as_hours;
	}
	public String getContract_duration() {
		return Contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.Contract_duration = contract_duration;
	}
    
}
