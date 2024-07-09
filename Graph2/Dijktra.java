

//User function Template for Java

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
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        PriorityQueue<Pair> pq= new PriorityQueue();
        
        int [] visited= new int[V];
        int [] distance = new int[V];
        
         pq.add(new Pair(0, S));
         
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
             
             for(ArrayList<Integer> nb:  adj.get(node)){
                 
                int  nb_node= nb.get(0);
                int w= nb.get(1);
                
                if(visited[nb_node]==0){
                    
                    pq.add(new Pair(w+ cost,nb_node));
                }
                 
             }
             
         }
         
         return distance;
         
    }
}
