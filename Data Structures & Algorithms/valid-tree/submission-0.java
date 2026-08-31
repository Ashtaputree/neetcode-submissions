class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1)
        {
            return false;

        }
        int[]p=new int[n];
        for(int i=0;i<n;i++)
        {
            p[i]=i;
        }
        for(int []edge:edges)
        {
            int root1=neighbour(p,edge[0]);
            int root2=neighbour(p,edge[1]);
            if(root1==root2)
            {
                return false;
            } 
            p[root1]=root2;
        }
        return true;
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
