package com.projects.hibernate11;

import java.util.Map;

public class questions {
     private int id;
     private String qname;
     private Map<String,String>answers;
     
     public questions() {
    	 
     }
     
     public questions(String qname,String something, Map<String,String>answers) {
    	 this.qname= qname;
    	 this.answers=answers;
     }
     
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
     public Map<String,String>getanswers(){
    	 return answers;
     }
     public void setanswers(Map<String,String>answers) {
    	 this.answers=answers;
     }
}

	