package Recursion_3;

public class StairCase_wtih_dice {
    
	public static void Path(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return ;
		}
		
		if(n<0) {
			return ;
		}
		
//		Path(n-1, ans+"1");
//		Path(n-2, ans+"2");
//		Path(n-3, ans+"3");
//		Path(n-4, ans+"4");
//		Path(n-5, ans+"5");
//		Path(n-6, ans+"6");
		
		for(int dice_value=1; dice_value<=6;dice_value++) {
			
			Path(n-dice_value, ans+dice_value);
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Path(5, "");
        
	}

}
