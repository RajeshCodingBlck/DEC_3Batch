package Graph_1;

import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        int n= s.nextInt(); // Number of nodes 
		Graph g= new Graph(n);
		
		int e= s.nextInt(); // No of edges
		
		for(int i=0; i<e;i++) {
			
			int u= s.nextInt();
			int v= s.nextInt();
			g.addEdge(u, v);
		}
		
	}

}
