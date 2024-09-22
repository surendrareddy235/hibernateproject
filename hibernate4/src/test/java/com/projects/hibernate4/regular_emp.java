package com.projects.hibernate4;
import jakarta.persistence.*;
@Entity
@DiscriminatorValue("regular_emp")
public class regular_emp extends employee {
  @Column(name="salary")
  public float salary;
  
  @Column(name="bonus")
  public int bonus;

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
