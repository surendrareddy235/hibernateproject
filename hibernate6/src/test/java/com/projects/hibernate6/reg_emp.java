package com.projects.hibernate6;

import jakarta.persistence.*;

@Entity
@Table(name="reg_emptable2")
public class reg_emp extends employee {
	@Column(name="salary")
	private float salary;
	@Column(name="bonus")
	private int bonus;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}

