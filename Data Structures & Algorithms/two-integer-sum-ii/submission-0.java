class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int u = numbers.length - 1;
        
        while (l < u) {
            int sum = numbers[l] + numbers[u];
            
            if (sum == target) {
                return new int[]{l + 1, u + 1};
            } else if (sum < target) {
                l++;
            } else {
                u--;
            }
        }
        
        return new int[]{-1, -1};
    }
}
