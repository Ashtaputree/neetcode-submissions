class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board==null||board.length==0)
        {
            return true;
        }
        HashSet<String> seen=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char curr=board[i][j];
                if(curr!='.')
                {
                    String row= curr+"row"+i;
                    String col=curr+"col"+j;
                    String box=curr+"box"+(i/3)+"-"+(j/3);
                    if(!seen.add(row)||!seen.add(col)||!seen.add(box))
                    {
                        return false;
                    }
                }
            }
            
        }
        return true;
    }
}
