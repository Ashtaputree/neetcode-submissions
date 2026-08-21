class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, "", 0, 0, n);
        return result;
    }

    private void dfs(List<String> res, String current, int open, int close, int n) {
        if (current.length() == n * 2) {
            res.add(current);
            return;
        }
        if (open < n) 
        { 
            dfs(res, current + "(", open + 1, close, n);
        }
        if (close < open)
        {
            dfs(res, current + ")", open, close + 1, n);
        } 
    }
}