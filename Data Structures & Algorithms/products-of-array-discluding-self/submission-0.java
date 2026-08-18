class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int right=1;
        int left=1;
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]=left;
            left=left*nums[i];
        }
        for(int i=n-1;i>=0;i--)
        {
            result[i]=result[i]*right;
            right=right*nums[i];
        }
        return result;
    }
}  
