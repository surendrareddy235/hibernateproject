package com.projects.hibernate7;

public class reg_emp extends employee {
     private float salary;
     private int bonus;
     
     public float getsalary() {
    	 return salary;
     }
     public void setsalary(float salary) {
    	 this.salary = salary;
     }
     public int getbonus() {
    	 return bonus; 
     }
     public void setbonus(int bonus) {
    	 this.bonus=bonus;
     }
}
