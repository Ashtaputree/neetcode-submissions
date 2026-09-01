class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[]p= new int[n+1];
        for(int i=1;i<=n;i++)
        {
            p[i]=i;
        }
        for(int[]edge:edges)
        {
            int root1=neighbour(p,edge[0]);
            int root2=neighbour(p,edge[1]);
            if(root1==root2)
            {
                return edge;
            }
            p[root1]=root2;
        }
        return new int[0];
    }
    public int neighbour(int[]p,int n)
    {
        if(p[n]!=n)
        {
            p[n]=neighbour(p,p[n]);
        }
        return p[n];
    }
}
