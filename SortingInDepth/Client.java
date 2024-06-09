package SortingInDepth;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class cmp1 implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		double val1= o1.review;
		double val2= o2.review;
		if(val1>val2) {
			return -1;
		}else {
			return 1;
		}
	}
	
}
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Product> arr= new ArrayList();
      arr.add(new Product("Samsung", 60, 40));
      arr.add(new Product("Apple", 40, 30));
      arr.add(new Product("Nothing", 69, 50));
      
      Collections.sort(arr, new cmp1());
      for( Product item : arr) {
    	 
    	 if(item.brand.equals("Samsung")) {
    		 System.out.println(item.brand+ " "+ item.price);
    	 }
      }
      
	}

}
