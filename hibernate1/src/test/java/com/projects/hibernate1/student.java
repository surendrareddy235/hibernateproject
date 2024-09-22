package com.projects.hibernate1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	
	    @Id
	    int Rollno;
        String name;
        String address;
		public int getRollno() {
			return Rollno;
		}
		public void setRollno(int Rollno) {
			this.Rollno = Rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
        
        
}
