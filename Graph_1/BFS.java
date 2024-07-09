package Graph_1;

import java.util.*;

public class BFS {

	public static void BFS(ArrayList<Integer> [] arr, int src,
			 int [] visited) {
		
		LinkedList<Integer> q= new LinkedList();
		
		q.addLast(src);
		//int [] visited= new int[arr.length];
		visited[src]=1;
		int [] parent= new int[arr.length];
		parent[src]=-1;
		while(q.size()>0) {
			
			int rmNode= q.removeFirst();
			//visited[rmNode]=1;
			
			if(visited[rmNode]==0) {
				System.out.println(rmNode);
			}
			
			visited[rmNode]=1;
			
			
			ArrayList<Integer> NB_list= arr[rmNode];
			
			for(Integer nb : NB_list) {
				if(visited[nb]==0) {
					q.addLast(nb);
					parent[nb]=rmNode;
					//visited[nb]=1;
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Graph g= new Graph(7);
//       g.addEdge(0, 1);
//       g.addEdge(0, 3);
//       g.addEdge(1, 2);
//       g.addEdge(2, 3);
//       //g.addEdge(3, 4);
//       g.addEdge(4, 5);
//       g.addEdge(5, 6);
//       g.addEdge(4, 6);
//       
       //System.na
		
		Graph g= new Graph(3);
	       g.addEdge(0, 1);
	       g.addEdge(0, 2);
	       g.addEdge(1, 2);
//	      
	       int [] visited= new int[g.arr.length];
         for(int i=0; i<visited.length;i++) {
        	 
        	 if(visited[i]==0) {
        		 BFS(g.arr, i, visited);
        	 }
         }
       
       
	}

}
