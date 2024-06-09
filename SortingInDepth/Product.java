package SortingInDepth;
import java.util.Comparator;

public class Product implements Comparable<Product> {
   
	String brand;
	int review;
	int price;
	Product(String brand, int review, int price){
		
		this.brand=brand;
		this.review=review;
		this.price=price;
	}
	//@Override
//	public int compare(Product o1, Product o2) {
//		// TODO Auto-generated method stub
//		
//		if(o1.price< o2.price) {
//			return -1;
//		}else {
//			return 1;
//		}
//	}
	
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		 
		if(this.price< o.price) {
			return -1;
		}else {
			return 1;
		}
	}
}

