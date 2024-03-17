class Solution {
    public int firstUniqChar(String s) {
       
      int [] fre= new int[256];
      
        for(int i=0; i<s.length();i++){         
            int ascii= s.charAt(i);  
            fre[ascii]=fre[ascii]+1;
        }
        
        for(int i=0; i<s.length();i++){
            
            int ascii=s.charAt(i);           
            if(fre[ascii]==1){                
                return i;
            }
        }
        
        return -1;
        
    }
}
