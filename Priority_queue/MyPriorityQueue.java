package Priority_queue;

import java.util.ArrayList;

public class MyPriorityQueue {
    
	ArrayList<Integer> arr;
	MyPriorityQueue(){
		arr=new ArrayList();
	}
	
	private int ParentIndex(int i) {
		
		return (i-1)/2;
	}
	
	private int leftChild(int pi) {
		return 2*pi +1;
	}
	private int rightChild(int pi) {
		return 2*pi +2;
	}
	
	public void add(int val) {
		arr.add(val);
		upheapify(arr.size()-1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		
		if(ci==0) {
			return ;
		}
		int pi=ParentIndex(ci);
		
		if(arr.get(pi) > arr.get(ci)) {
			swap(arr,pi,ci);
			upheapify(pi);
		}
	}

	private void swap(ArrayList<Integer> arr, int pi, int ci) {
		// TODO Auto-generated method stub
		int temp=arr.get(pi);
		arr.set(pi, arr.get(ci));
		arr.set(ci, temp);
	}
	
	public int size() {
		return arr.size();
	}
	
	public int peek(){
		if(arr.size()==0) {
			// throws Exception
		}
		return arr.get(0);
	}
	public void remove(){
		 
	    if(arr.size()==0) {
	    	// throw Exception
	    }
	    // Step1;
	    swap(arr, 0,arr.size()-1);
	    // Step2 Remove the Last Node (last Index)
	    arr.remove(arr.size()-1);
	    //DownHeapify
	    downheapify(0);
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci= leftChild(pi);
		int rci=rightChild(pi);
		
		if(lci> arr.size() && rci>arr.size()) {
			return ;
		}
		
		int minI=pi;
		if(lci< arr.size() && arr.get(minI) > arr.get(lci)) {
			minI=lci;
		}
		if(rci< arr.size() && arr.get(minI)> arr.get(rci)) {
			minI=rci;
		}
		
		if(minI != pi) {
			swap(arr, minI, pi);
			downheapify(minI);
		}	
		
	}
	
	
	
}
