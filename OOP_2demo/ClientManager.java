package OOP_2demo;

public class ClientManager {
    
	final static int val=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Manager Harsh= new Manager();
       Developer d1= new Developer("Mr.Yash");
       Analyst d2= new Analyst("Mr. Sahaj");
       Saler d3= new Saler("Mr.Mohan");
       Harsh.addEmployee(d1);
       Harsh.addEmployee(d2);
       Harsh.addEmployee(d3);
      // Employee e= new Employee("Mohan");
       
        //val++;
       
      
	}

}
