package LinkList_pkg;

import java.util.LinkedList;
import java.util.Scanner;

class Result{
	
	boolean contains;
	int index;
	
	Result(boolean contains, int index){
		
		this.contains=contains;
		this.index=index;
	}
	
}
public class Question_onLinkedList {

	public static Result Search(LinkedList<Integer> list, int target) {
		
		for(int i=0; i<list.size();i++) {	
			if(list.get(i)==target) {	
				return  new Result(true, i);
			}
		}
		
		return new Result(false, -1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
//	  LinkedList<Integer> list= new LinkedList();
//	  Scanner s= new Scanner(System.in);
//	  
//	  int n= s.nextInt(); 
//	  for(int i=0;i<n;i++) {
//		  
//		  int val= s.nextInt();	  
//		  list.add(val);
//	  }
//	  
//	  int target=s.nextInt();
//	  
//	  Result obj= Search(list, target);
//	  System.out.println(obj.contains+ " "+ obj.index);
	  
	  
	  int a=12;
	  
	  if(a==12 || a++ ==13) {
		  System.out.println(a);
	  }
	  
	  System.out.println(a);
	  
	}

}
