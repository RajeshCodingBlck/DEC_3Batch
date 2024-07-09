package Graph_1;

import java.util.ArrayList;

public class Graph {
    
	ArrayList<Integer> [] arr;
	Graph(int n){
		 arr= new ArrayList [n];
		 for(int i=0;i<n;i++) {
			 arr[i]= new ArrayList();
		 }
	}
	
	public void addEdge(int u, int v){
		arr[u].add(v);
		arr[v].add(u);
	}
	
}
