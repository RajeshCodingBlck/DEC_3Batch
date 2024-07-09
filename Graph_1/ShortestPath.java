package Graph_1;

import java.util.*;

public class ShortestPath {

	public static int BFS(ArrayList<Integer> [] adj,
			int src, int des) {
		
		LinkedList<Integer> q= new LinkedList();
		
		int [] visited= new int[adj.length];
		int [] distance= new int [adj.length];
		q.add(src);
		distance[src]=0;
		
		while(q.size()>0) {
			
			int rmNode= q.removeFirst();
			
			// work
			if(rmNode==des) {
				return distance[rmNode];
			}
			
			// add the Neighbour
			ArrayList<Integer> nb_list= adj[rmNode];
			
			for(Integer nb : nb_list) {
				
				if(visited[nb]==0) {
					visited[nb]=1;
					distance[nb]= 1+ distance[rmNode];
					q.add(nb);
				}
			}
		}
		
		return Integer.MAX_VALUE;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Graph g= new Graph(7);
        
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2,3);
        g.addEdge(1,3);
       // g.addEdge(4, 1);
        g.addEdge(4, 5);
        g.addEdge(4,6);
        g.addEdge(5, 6);
        
        System.out.println(BFS(g.arr, 0,6));
        
	}

}
