class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int[][] memo = new int[n][n];
        int res = 0;
        for(int i=0;i<n;i++){
            memo[i][i] = 1;
            res++;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                memo[i][i+1] = 1;
                res++;
            }
        }

        for(int i=2;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(s.charAt(i+j)==s.charAt(j) && memo[j+1][i+j-1]==1){
                    memo[j][i+j] = 1;
                    res++;
                }
            }
        }
        return res;
    }
}