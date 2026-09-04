class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> q= new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            q.offer(nums[i]);
            while(q.size()>k)
            {
                q.poll();
            }
        }
        return q.peek();
    }
}
