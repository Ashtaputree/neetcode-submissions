class Solution 
{
    public List<List<Integer>> combinationSum(int[] nums, int target) 
    {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        backtrack(nums,target,0,curr,result);
        return result;

    }
    public void backtrack(int []nums,int remaining,int start,List<Integer> curr,List<List<Integer>> result)
    {
        if(remaining==0)
        {
            result.add(new ArrayList<>(curr));
            return;
        }
        if(remaining<0)
        {
            return;
        }
        for(int i=start;i<nums.length;i++)
        {
            curr.add(nums[i]);
            backtrack(nums,remaining-nums[i],i,curr,result);
            curr.remove(curr.size() - 1);
        }
    }
}
