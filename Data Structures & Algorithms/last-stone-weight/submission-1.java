class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            q.offer(stones[i]);

        }
        while(q.size()>1)
        {
            int x=q.poll();
            int y=q.poll();
            if(x==y)
            {
                continue;
            }
            if(x>y)
            {
                q.offer(x-y);
            }
        }
        return !q.isEmpty()?q.peek():0;
    }
}
