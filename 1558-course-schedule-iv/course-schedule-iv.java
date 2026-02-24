class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] p : prerequisites) {
            int u = p[0];
            int v = p[1];
            map.get(u).add(v);   // directed edge
        }
        boolean[][] reachable = new boolean[n][n];
        // BFS from every node
        for (int i = 0; i < n; i++) {
            bfs(i, map, reachable);
        }

        List<Boolean> ans = new ArrayList<>();
        for (int[] q : queries) {
            ans.add(reachable[q[0]][q[1]]);
        }
        return ans;
    }

    public void bfs(int src, HashMap<Integer, List<Integer>> map, boolean[][] reachable) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[reachable.length];

        q.add(src);
        vis[src] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int nbr : map.get(node)) {
                if (!vis[nbr]) {
                    reachable[src][nbr] = true; // important
                    vis[nbr] = true;
                    q.add(nbr);
                }
            }
        }
    }
}