

class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {   
                    q.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        
        if (fresh == 0) {
            return 0;
        }
        
        int mins = 0;
        int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        
        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();
            mins++;
            
            for (int k = 0; k < size; k++) {
                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];
                
                for (int[] dir : directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    
                    if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || grid[nr][nc] != 1) {
                        continue;
                    }
                    
                    grid[nr][nc] = 2;
                    fresh--;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        
         return fresh == 0 ? mins : -1;
    }
}
