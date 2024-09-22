package com.projects.hibernate6;

import jakarta.persistence.*;

@Entity
@Table(name="schoolemptable4")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO) 
  private int id;
@Column(name="name")
  private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

  
}
