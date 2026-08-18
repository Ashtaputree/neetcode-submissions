class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if((matrix==null)||(matrix.length==0)||(matrix[0].length==0))
        {
            return false;
        }
        int rows=matrix.length;
        int cols=matrix[0].length;
        int l=0;
        int u=(rows*cols)-1;
        while(l<=u)
        {
            int mid=l+(u-l)/2;
            int rowi=mid/cols;
            int coli=mid%cols;
            if(matrix[rowi][coli]==target)
            {
                return true;
            }
             if(matrix[rowi][coli]<target)
            {
                l=mid+1;

            }
             if(matrix[rowi][coli]>target)
            {
                u=mid-1;
            }
        }
        return false;
        

    }
}
