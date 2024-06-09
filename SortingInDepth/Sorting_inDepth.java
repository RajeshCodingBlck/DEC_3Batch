package SortingInDepth;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class cmp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		int val1= o1%10;
		int val2=o2%10;
		
		if(val1>val2) {
			return -1;
		}else {
			return 1;
		}
	}
	
	
	
}
public class Sorting_inDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> arr=new ArrayList();
       arr.add(12);
       arr.add(31);
       arr.add(5);
       arr.add(7);
//       Arrays.sort(arr);
        Collections.sort(arr, new cmp());
        System.out.println(arr);
	}

}
