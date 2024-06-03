package My_HashMap;

import java.util.LinkedList;

public class MyHashMap {
    
	 LinkedList<Entry> [] arr;
	 
	 MyHashMap(){
		 
		 arr= new LinkedList [5];
		 for(int i=0; i<arr.length;i++) {
			// System.out.println(arr[i]);
			 arr[i]= new LinkedList();
		    //System.out.println(arr[i]);
		 }
	 
	 }
	 
	 private int hashFunction(String key) { 
		  int value= Math.abs(key.hashCode()); 
		  int index= value%arr.length;
		  return index;
	 }
	 
	 public boolean containsKey(String key) {
		 
		 int index= hashFunction(key);
		 LinkedList<Entry> list= arr[index];
		 
		 for(Entry e : list) { 
			 if(e.key.equals(key)) {
				 return true;
			 }
		 } 
		 return false;
	 }
	 
	 public void put(String key, int value) {
		 
		 int index= hashFunction(key);
		 LinkedList<Entry> list= arr[index];
		 
		 if(containsKey(key)==true) {  
			 for(Entry e : list) {
				 if(e.key.equals(key)) {
					e.value=value;
					return;
				 }
			 }
		 }else {
			 Entry e= new Entry(key, value);
			 list.addLast(e);
		 }
	 }
	 
	 public int get(String key) {
		 
		 int index= hashFunction(key);
		 LinkedList<Entry> list= arr[index];
		 
		 if(containsKey(key)==true) {
			 int ans=-1;
			 for(Entry e : list) {
				 if(e.key.equals(key)) {
					ans= e.value;
					break;
				 }
			 }
			 return ans;
		 }else {
			 return -1;
		 }
		 
	 }
	 
	 
}
