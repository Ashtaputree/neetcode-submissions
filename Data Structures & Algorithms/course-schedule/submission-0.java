

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new List[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] pair : prerequisites) {
            adj[pair[1]].add(pair[0]);
        }

        int[] visited = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(adj, visited, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(List<Integer>[] adj, int[] visited, int curr) {
        if (visited[curr] == 1) return true;
        if (visited[curr] == 2) return false;

        visited[curr] = 1;

        for (int next : adj[curr]) {
            if (hasCycle(adj, visited, next)) {
                return true;
            }
        }

        visited[curr] = 2;
        return false;
    }
}
