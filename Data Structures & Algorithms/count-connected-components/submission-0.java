class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int[]edge:edges)
        {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        boolean[]visited=new boolean[n+1];
        int c=0;

        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                c++;
                dfs(i,list,visited);
            }
        }
        return c;
    }
    public void dfs(int node,List<List<Integer>> list,boolean[]visited)
    {
        visited[node]=true;
        
        for(int neighbour:list.get(node))
        {
            if(!visited[neighbour])
            {
                dfs(neighbour,list,visited);
            }
        }
    }
}
