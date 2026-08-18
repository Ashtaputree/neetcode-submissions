class Solution {
    public int goodNodes(TreeNode root) {
        
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode root, int maxSoFar) {
        
        if (root == null) {
            return 0;
        }

        int goodNodeCount = 0;

        
        if (root.val >= maxSoFar) {
            goodNodeCount = 1;
            
            maxSoFar = root.val;
        }

        
        goodNodeCount += dfs(root.left, maxSoFar);
        goodNodeCount += dfs(root.right, maxSoFar);

        return goodNodeCount;
    }
}
