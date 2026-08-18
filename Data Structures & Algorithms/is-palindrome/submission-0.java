class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int u = s.length() - 1;
        while (l < u) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            } 
            if (!Character.isLetterOrDigit(s.charAt(u))) {
                u--;
                continue;
            }
            char ch = Character.toLowerCase(s.charAt(l));
            char chh = Character.toLowerCase(s.charAt(u));
            if (ch != chh) {
                return false;
            } else {
                l++;
                u--;
            }
        }
        return true;
    }
}
