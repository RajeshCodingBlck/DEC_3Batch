class A{
   
    int a=12;
    int b=13;

     A(int a, int b){
       
      this.a=a;
       this.b=b;
     }
   
       void fun(){
       
      System.out.println(a+ ", "+b);
      
      }

}

public class Main{

    public static void main(String [] args){
      
        A obj1= new A(2,3);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        obj1.fun();
      
   }

}
