import java.util.*;
public class Main {
    public static int kadens_max(int [] arr){

        int sum=0;
        int overall_max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){

            sum+=arr[i];
            overall_max= Math.max(overall_max, sum);

            if(sum<0){
                sum=0;
            }
        }

        return overall_max;
    }

    public static int kadens_min(int [] arr){
  
         
        int sum=0;
        int overall_min= Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){

            sum+=arr[i];
            overall_min= Math.min(overall_min, sum);

            if(sum>0){
                sum=0;
            }
        }

        return overall_min;
    }
    public static void main(String args[]) {
     
     Scanner s= new Scanner(System.in);

     int t= s.nextInt();

     while(t>0){

        int n= s.nextInt();

        int [] arr= new int [n];

        int totalsum=0;

        for(int i=0; i<n;i++){

            arr[i]=s.nextInt();
            totalsum+=arr[i];
        }
        
        int ans_linear= kadens_max(arr);
        int ans_circular= totalsum- kadens_min(arr);


         System.out.println(Math.max(ans_circular, ans_linear));

         t--;
     }
    }
}
