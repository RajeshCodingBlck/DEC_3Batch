package OOP_2demo;

import java.util.ArrayList;

// Gerenic
class Mydata<T,E>{
	
	T data1;
	E data2;
	
}



public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Mydata<String, Integer> obj1= new Mydata();
     obj1.data1="abcd";
     System.out.println(obj1.data1);
     Mydata<Integer, String> obj2= new Mydata();
     obj2.data1=123;
     System.out.println(obj2.data1);
     
     ArrayList<Integer> arr= new ArrayList();
     
     
	}

}
