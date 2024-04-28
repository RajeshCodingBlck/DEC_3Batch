package OOP2;

class A{
	
	int a;
	
	A(int val){
		a=val;
	}
	
}

public class Case_study1 {

	public static void Swap( A obj1 , A obj2) {
		
		A temp= obj1;
		obj1= obj2;
		obj2=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		A obj1= new A(12);
		A obj2= new A(13);
		
		System.out.println("Before Swap"+ obj1.a+ " , "+ obj2.a);
		Swap(obj1, obj2);
		System.out.println("After Swap"+ obj1.a+ " , "+ obj2.a);
		
		// Answer :- No Swap is there, due to Local varible Changes not Persist.
	}

}
