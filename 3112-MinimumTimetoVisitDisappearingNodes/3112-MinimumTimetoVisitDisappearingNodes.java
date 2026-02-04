// Last updated: 2/4/2026, 11:43:03 AM
1class Solution {
2
3    private HashMap<Integer, HashMap<Integer, Integer>> map;
4
5    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
6        map = new HashMap<>();
7        for (int i = 0; i < n; i++) {
8            map.put(i, new HashMap<>());
9        }
10        // add edges
11        for (int[] e : edges) {
12            AddEdge(e[0], e[1], e[2]);
13        }
14
15        return Dijkstra(n, disappear);
16    }
17
18    public void AddEdge(int v1, int v2, int cost) {
19
20        map.get(v1).put(v2,
21            Math.min(map.get(v1).getOrDefault(v2, Integer.MAX_VALUE), cost));
22
23        map.get(v2).put(v1,
24            Math.min(map.get(v2).getOrDefault(v1, Integer.MAX_VALUE), cost));
25    }
26
27
28    class DijkstraPair {
29        int vtx;
30        int cost;
31
32        public DijkstraPair(int vtx, int cost) {
33            this.vtx = vtx;
34            this.cost = cost;
35        }
36    }
37
38    public int[] Dijkstra(int n, int[] disappear) {
39
40        int[] ans = new int[n];
41        Arrays.fill(ans, -1);
42
43        PriorityQueue<DijkstraPair> pq =
44                new PriorityQueue<>((a, b) -> a.cost - b.cost);
45
46        boolean[] visited = new boolean[n];
47
48        pq.add(new DijkstraPair(0, 0));
49
50        while (!pq.isEmpty()) {
51
52            DijkstraPair rp = pq.poll();
53
54            if (visited[rp.vtx]) continue;
55
56            // vanish check
57            if (rp.cost >= disappear[rp.vtx]) continue;
58
59            visited[rp.vtx] = true;
60            ans[rp.vtx] = rp.cost;
61
62            for (int nbr : map.get(rp.vtx).keySet()) {
63                if (!visited[nbr]) {
64                    int newCost = rp.cost + map.get(rp.vtx).get(nbr);
65                    pq.add(new DijkstraPair(nbr, newCost));
66                }
67            }
68        }
69        return ans;
70    }
71}
72