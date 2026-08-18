

class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;
        
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            
            
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            
            
            maxFrequency = Math.max(maxFrequency, map.get(rightChar));
            

            while ((right - left + 1) - maxFrequency > k) {
                char leftChar = s.charAt(left);
                
                
                map.put(leftChar, map.get(leftChar) - 1);
                
                
                left++;
            }
            
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
