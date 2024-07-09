

class Solution
{
    public boolean dfs(int src,ArrayList<ArrayList<Integer>>adj,
     int [] visited, int [] color){
         
         visited[src]=1;
         
         for(int nb : adj.get(src)){
             
             if(visited[nb]==1){
                 
                 if(color[nb]==color[src]){
                     return false;
                 }
                 
             }else{
                 
                if(color[src]==0){
                    color[nb]=1;
                }else{
                    color[nb]=0;
                }
                
               boolean chhota_ans= dfs(nb, adj, visited, color);
               
               if(chhota_ans==false){
                   return chhota_ans;
               }
             }
         }
         
         return true;
         
     }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        
        int [] visited= new int[V];
        int [] color= new int[V];
        
        // Black  0  , 1 ->red
        for(int i=0; i<V;i++){
            
            if(visited[i]==0){
               boolean ans=  dfs(i, adj, visited, color);
               if(ans==false){
                   return false;
               }
            }
        }
        
        return true;
    }
}
