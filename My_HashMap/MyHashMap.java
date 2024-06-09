package My_HashMap;

import java.util.LinkedList;

public class MyHashMap {
    
	 LinkedList<Entry> [] arr;
	 
	 private int count=0; 
	 private double load_factor=0.5;
	 
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
			 count++;
			 Entry e= new Entry(key, value);
			 list.addLast(e);
		 }
		 
		 double curr_load= (1.0 *count)/arr.length;
		 
		 if(curr_load> load_factor){
			 rehashing();
		 }
		 
	 }
	 
	 private void rehashing() {
		// TODO Auto-generated method stub
		count=0;
		LinkedList<Entry>[] old_arr= arr;
		arr= new LinkedList[2*old_arr.length];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=new LinkedList();
		}
		
		for(int i=0; i<old_arr.length;i++) {
			LinkedList<Entry> old_list= old_arr[i];
			
			for(Entry e : old_list) {
				
				put(e.key, e.value);
			}
			
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
