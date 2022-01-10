package programmers.level3;

import java.util.*;

public class FarthestNode {
	
    static class Graph{
        private boolean[] visitArr;
        private int[] depthArr;
        private List<ArrayList<Integer>> graph;
        private Queue<Integer> que;
        Graph(int n, int[][] edge){
            visitArr = new boolean[n+1];
            depthArr = new int[n+1];
            que = new LinkedList();
            
            graph = new ArrayList();
            
            for(int i = 1; i <= n+1; i++){
                graph.add(new ArrayList()); 
            }
            
            for(int i = 0; i < edge.length; i++){
                int x = edge[i][0];
                int y = edge[i][1];

                graph.get(x).add(y);
                graph.get(y).add(x);
            }               
            
        }
        
        public List<ArrayList<Integer>> getGraph(){
            return graph;
        }
        
        public void bfs(int index, int depth){
            que.offer(index);
            visitArr[index] = true;
            depthArr[index] = 1;
            
            while(!que.isEmpty()){
                
                Integer start = que.poll();
                
                ArrayList<Integer> vertexs = graph.get(start.intValue());
                
                for(int i = 0; i < vertexs.size(); i++){
                    int node = vertexs.get(i);
                    
                    if(!visitArr[node]){
                        que.offer(node);
                        visitArr[node] = true;
                        depthArr[node] = depthArr[start] + 1;
                    }
                }
            }
        }
    
        public int[] getDepthArr(){
            return depthArr;
        }
    }	
    
	public static void main(String[] args) {

			int n = 6;
			int[][] edge =  {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
			
	        int answer = 0;
	        Graph graph = new Graph(n,edge);
	        
	        graph.bfs(1,1);
	        
	        int[] depthArr =  graph.getDepthArr();
	        int max = 0;
	        for(int depth : depthArr){
	            if(max < depth) max = depth;
	        }
	        
	        for(int depth : depthArr){
	            if(max == depth) answer++;
	        }
	        
	        System.out.println(answer);
	
	}
	
}
