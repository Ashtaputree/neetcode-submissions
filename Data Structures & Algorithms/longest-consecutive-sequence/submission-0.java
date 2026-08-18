class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0)
        {
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);

        }
        int max=0;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int curr=num;
                int currmax=1;
        
            while(set.contains(num+1))
            {
                currmax=currmax+1;
                curr=num++;
            }
            max=Math.max(max,currmax);
        }
        }
        return max;
    }
}
