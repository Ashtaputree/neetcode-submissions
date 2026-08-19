

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) {
            return result;
        }

        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int j = 0; j < n; j++) {
            dfs(heights, 0, j, pacific, heights[0][j]);
            dfs(heights, m - 1, j, atlantic, heights[m - 1][j]);
        }

        for (int i = 0; i < m; i++) {
            dfs(heights, i, 0, pacific, heights[i][0]);
            dfs(heights, i, n - 1, atlantic, heights[i][n - 1]);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    private void dfs(int[][] heights, int r, int c, boolean[][] visited, int prevHeight) {
        int m = heights.length;
        int n = heights[0].length;

        if (r < 0 || r >= m || c < 0 || c >= n || visited[r][c] || heights[r][c] < prevHeight) {
            return;
        }

        visited[r][c] = true;

        dfs(heights, r + 1, c, visited, heights[r][c]);
        dfs(heights, r - 1, c, visited, heights[r][c]);
        dfs(heights, r, c + 1, visited, heights[r][c]);
        dfs(heights, r, c - 1, visited, heights[r][c]);
    }
}
