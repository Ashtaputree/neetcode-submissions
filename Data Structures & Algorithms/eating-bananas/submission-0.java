class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(pile, max);
        }
        
        int l = 1;
        int u = max;
        
        while (l < u) {
            int mid = l + (u - l) / 2;
            
            
            int hoursSpent = 0;
            for (int pile : piles) {
                
                hoursSpent += (pile + mid - 1) / mid;
            }
            
            
            if (hoursSpent <= h) {
                u = mid;
            } else {
                l = mid + 1;
            }
        }
        
        return l;
    }
}
