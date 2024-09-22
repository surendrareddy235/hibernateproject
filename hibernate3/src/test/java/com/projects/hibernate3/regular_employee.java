package com.projects.hibernate3;

public class regular_employee extends employee {
	public float salary;
    public float bonus;
     
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
}
