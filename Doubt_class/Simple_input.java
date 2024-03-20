import java.util.*;
public class Main {
    public static void main(String args[]) {
      
      Scanner s= new Scanner(System.in);

      int sum=0;
      int n= s.nextInt();

      while(sum+n>=0){

          System.out.println(n);
           sum+=n;
          n= s.nextInt();
      }

    }
}
