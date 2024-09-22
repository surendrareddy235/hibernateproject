package com.projects.hibernate8;

import java.util.List;

public class questions {
  private int id;
  private String qname;
  private List<String>answer;
  
  public int getid() {
	  return id;
  }
  public void setid(int id) {
	  this.id=id;
  }
  public String getqname() {
	  return qname;
  }
  public void setqname(String qname) {
	  this.qname=qname;
  }
public List<String> getAnswer() {
	return answer;
}
public void setAnswer(List<String> answer) {
	this.answer = answer;
}
}
