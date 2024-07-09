
// Question Link :- https://www.geeksforgeeks.org/problems/minimum-spanning-tree/1
// User function Template for Java
class Pair implements Comparable <Pair>{
    
     int cost;
     int node;
     Pair(int cost, int node){
         this.cost=cost;
         this.node= node;
     }
     
     public int compareTo(Pair other){
         
         if(this.cost < other.cost){
             return -1;
         }else{
             return 1;
         }
         
     }
}
class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
       PriorityQueue<Pair> pq= new PriorityQueue();
        
        int [] visited= new int[V];
        int [] distance = new int[V];
        
         pq.add(new Pair(0, 0));
         
         while(pq.size()>0){
             
             Pair rmPair= pq.remove();
             
             int node= rmPair.node;
             int cost= rmPair.cost;
             
             if(visited[node]==1){
                 continue;
             }
             
             visited[node]=1;
             
             //System.out.println(node + " "+ cost);
             // work
             distance[node]=cost;
             
             // add the neighbour
             
             for(int [] nb:  adj.get(node)){
                 
                int  nb_node= nb[0];
                int w= nb[1];
                
                if(visited[nb_node]==0){
                    
                    pq.add(new Pair(w,nb_node));
                }
                 
             }
             
         }
         
        int sum=0;
        for(int i=0; i<V;i++){
            sum+=distance[i];
        }
        return sum;
    }
}
