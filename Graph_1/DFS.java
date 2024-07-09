package Graph_1;

import java.util.ArrayList;

public class DFS {

//	public static void dfs(ArrayList<Integer> [] adj, int src,
//			int [] visited) {
//		
//		System.out.println(src);
//		visited[src]=1;
//		
//		ArrayList<Integer> nb_list= adj[src];
//		for(Integer nb : nb_list) {
//			
//			if(visited[nb]==0) {
//				dfs(adj, nb, visited);
//			}
//		}
//		
//
//	}
	
	public static int dfs(ArrayList<Integer> [] adj, int src,
			int [] visited) {
		
		System.out.println(src);
		visited[src]=1;
		int count=1;
		ArrayList<Integer> nb_list= adj[src];
		for(Integer nb : nb_list) {
			
			if(visited[nb]==0) {
				count+=dfs(adj, nb, visited);
			}
		}
		return count;

	}
	
	public static boolean  dfs(ArrayList<Integer> [] adj, int src,
			int [] visited, int parent) {
		
		//System.out.println(src);
		visited[src]=1;
		ArrayList<Integer> nb_list= adj[src];
		for(Integer nb : nb_list) {
			
			if(visited[nb]==0) {
			  return	dfs(adj, nb, visited,src);
			}else {
				
				if(nb ==parent) {
					continue;
				}else {
					return true;
				}
			}
		}
		return false;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Graph g= new Graph(7);
		  g.addEdge(0, 3);
	       g.addEdge(0, 1);
	       g.addEdge(2, 3);
	       g.addEdge(1, 2);
	      
	       //g.addEdge(3, 4);
	       g.addEdge(4, 5);
	       g.addEdge(5, 6);
	       g.addEdge(4, 6);
	       
	       int [] visited= new int[7];
	        
	       int countComponent=0;
	       for(int i=0;i<visited.length;i++) {
	    	   if(visited[i]==0) {
	    		   //System.out.println(i+ " called");
	    		   countComponent++;
	    		   int count=dfs(g.arr, i, visited);
	    		   System.out.println(countComponent+ " Size "+ count);
	    	   }
	       }
	       
	       System.out.println(countComponent);
	       
	}

}
