package String;

public class String_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		String str= new String("hello");
//		String str2= "Hello";
		
		//System.out.print(str.charAt(-1)); 
		//error  negative index is not possible.
		
		
		String str1= new String("ABCDEFDR");
		String str2= new String("AAB");
//		System.out.println(str1);
//		
//		if(str1==str2) {
//			System.out.println("Me Same Hu");
//		}else {
//			System.out.println("Me Same nahi Hu");
//		}
		
		
//		String str1= "hello";
//		String str2= "hello";
//		System.out.println(str1);
//		
//		if(str1==str2) {
//			System.out.println("Me Same Hu");
//		}else {
//			System.out.println("Me Same nahi Hu");
//		}
		
//		System.out.println(str1);
//		
//		str1= str1+'a';
		
		System.out.println(str1);
		System.out.println(str2);
		
		//str1.charAt(1)='b';
		
		if(str1.equals(str2)) {
			System.out.println("Me equal hu");
		}else {
			System.out.println("Me Same nahi hu");
		}
		
		
		System.out.println(str1.length());
		
		
		if(str1.compareTo(str2)>0) {
			System.out.println(str1 + " is Bigger");
		}else {
			System.out.println(str2+ " is Bigger");
		}
		
		System.out.println(str1.substring(1,5));
		
		
		
	}

}
