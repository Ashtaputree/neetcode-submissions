class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null)
        {
            return 0;
        }
        int c=0;
        int rows=grid.length;
        int cols=grid[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]=='1')
                {
                    c++;
                    dfs(grid,i,j);
                }
            }
        }
        return c;
    }
public void dfs(char[][]grid,int r,int c)
{
    if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]=='0')
    {
        return;
    }
    grid[r][c]='0';
    dfs(grid,r+1,c);
    dfs(grid,r-1,c);
    dfs(grid,r,c+1);
    dfs(grid,r,c-1);
}
}

