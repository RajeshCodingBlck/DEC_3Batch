package OOP_2demo;

import java.util.ArrayList;
// abstract class Employee{
//	
//	String Name;
//	Employee(String Name){
//		this.Name= Name;
//	}
//	
//	public  void Introduction(){
//
//    }
//	
//}
//abstract class A{
//	
//	
//	public void fun() {
//		System.out.println("Hello");
//	}
//	
//	public abstract void fun2();
//}
 interface Employee{
	 
	 void Introduction();
	// public  abstract void fun();
 }



 class Developer implements Employee{
	 
	String Name;
	Developer(String Name){
		this.Name=Name;
	}
	
	public void Introduction(){
		System.out.println("Hello I am Developer "+ Name);
	}

	//@Override
//	public void fun() {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	
}
class Analyst implements Employee{
	
	String Name;
	Analyst(String Name){
		this.Name=Name;
	}
	
	public void Introduction(){
		System.out.println("Hello I am Analyst "+ Name);
	}
}
class Saler implements Employee{

	String Name;
	
	Saler(String Name){
		this.Name=Name;
	}
	@Override
	public void Introduction() {
		// TODO Auto-generated method stub
		System.out.println("Hello I am Saler "+ Name);
	}
	
	
}
public class Manager {
   
	ArrayList<Employee> arr;
	Manager(){
		arr= new ArrayList();
	}
	
	public void addEmployee(Employee d){  
		
		d.Introduction();
		arr.add(d);
	}
}
