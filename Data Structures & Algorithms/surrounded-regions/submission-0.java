class Solution {
    public void solve(char[][] board) {
        int rows=board.length;
        int cols=board[0].length;
        for(int i=0;i<cols;i++)
        {
            if(board[0][i]=='O')
            {
                dfs(board,0,i);
            }
            if(board[rows-1][i]=='O')
            {
                dfs(board,rows-1,i);
            }
        }
        for(int r=0;r<rows;r++)
        {
            if(board[r][0]=='O')
            {
                dfs(board,r,0);
            }
            if(board[r][cols-1]=='O')
            {
                dfs(board,r,cols-1);
            }
        }
        for(int j=0;j<rows;j++)
        {
            for(int x=0;x<cols;x++)
            {
                if(board[j][x]=='O')
                {
                    board[j][x]='X';
                }
                else if(board[j][x]=='T')
                {
                    board[j][x]='O';
                }
            }
        }



    }
        public void dfs(char[][]board,int r,int c)
        {
            if(r<0||c<0||r>=board.length||c>=board[0].length||board[r][c]!='O')
            {
                return;
            }
            board[r][c]='T';
            dfs(board,r+1,c);
            dfs(board,r-1,c);
            dfs(board,r,c+1);
            dfs(board,r,c-1);
        }
    
}
