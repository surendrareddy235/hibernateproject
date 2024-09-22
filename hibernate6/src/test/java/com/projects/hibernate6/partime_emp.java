package com.projects.hibernate6;

import jakarta.persistence.*;

@Entity
@Table(name="partime_emptable2")
public class partime_emp extends employee {
    @Column(name="pay_as_hours")
    private int pay_as_hours;
    @Column(name="contract_duration")
    private String contract_duration;
	public int getPay_as_hours() {
		return pay_as_hours;
	}
	public void setPay_as_hours(int pay_as_hours) {
		this.pay_as_hours = pay_as_hours;
	}
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
    
}
