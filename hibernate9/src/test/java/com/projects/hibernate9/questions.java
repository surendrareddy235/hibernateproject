package com.projects.hibernate9;

import java.util.List;

public class questions {
      private int id;
      private String qname;
      private List<String>Answers;
      
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
    	  this.qname = qname;
      }
      public List<String>getAnswers(){
    	  return Answers;
      }
      public void setAnswers(List<String>Answers) {
    	  this.Answers=Answers;
      }
}
