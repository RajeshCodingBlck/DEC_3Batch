package BinarySearch;

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class Solution extends VersionControl {
public int firstBadVersion(int n) {
 
  int low=1;
  int high=n;
  
  int ans=n;
  while(low<=high){
      
      int mid= low+(high-low)/2;
      
      if(isBadVersion(mid)==false){
          low=mid+1;
      }else{
          ans=mid;
          high=mid-1;
      }
  }
  
  return ans;
  

  
}
}
