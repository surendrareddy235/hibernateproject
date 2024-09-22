package com.projects.hibernate4;

import jakarta.persistence.*;
@Entity
@DiscriminatorValue("temp_emp")
public class temp_emp extends employee {
 @Column(name="pay_as_hours")
 public float pay_as_hours;
	
 @Column(name="contract_duration")
 public String contract_duration;

public float getPay_as_hours() {
	return pay_as_hours;
}

public void setPay_as_hours(float pay_as_hours) {
	this.pay_as_hours = pay_as_hours;
}

public String getContract_duration() {
	return contract_duration;
}

public void setContract_duration(String contract_duration) {
	this.contract_duration = contract_duration;
}
}
