package OOP2;

class A1{
	
	int a;
	
	A1(int val){
		a=val;
	}
	
}


public class Case_study2 {

	public static void Swap(A1 obj1, A1 obj2) {
		
		int temp= obj1.a;
		obj1.a=obj2.a;
		obj2.a=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A1 obj1= new A1(12);
     A1 obj2= new A1(13);
     
     System.out.println("Before Swap "+ obj1.a+ " "+ obj2.a);
     Swap(obj1, obj2);
     System.out.println("After Swap "+ obj1.a+ " "+ obj2.a);
     
	}

}
