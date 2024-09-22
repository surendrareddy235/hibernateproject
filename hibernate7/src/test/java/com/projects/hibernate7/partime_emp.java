package com.projects.hibernate7;

public class partime_emp extends employee {
   private float pay_as_time;
   private String contract_duration;
   
public float getpay_as_time() {
	return pay_as_time;
}
public void setpay_as_time(float pay_as_time) {
	this.pay_as_time = pay_as_time;
}
public String getcontract_duration() {
	return contract_duration;
}
public void setcontract_duration(String contract_duration) {
	this.contract_duration = contract_duration;
}
}
