// Last updated: 3/16/2026, 10:26:32 AM
1class Solution {
2    private HashMap<Integer,HashMap<Integer,Integer>> map;
3    public int networkDelayTime(int[][] times, int n, int k) {
4		map=new HashMap<>();
5		for(int i=1;i<=n;i++) {
6			map.put(i, new HashMap<>());  
7		}
8        for (int[] t : times) {
9            AddEdge(t[0], t[1], t[2]);
10        }
11		return Dijkstra(n,k);
12	}
13    public int Dijkstra(int n, int src) {
14		PriorityQueue<DijkstraPair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
15		HashSet<Integer> visited=new HashSet<>();
16		pq.add(new DijkstraPair(src,0));
17        int ans=0;
18		while(!pq.isEmpty()) {
19//			1.remove
20			DijkstraPair rp =pq.poll();
21//			2. ignore if already visited
22			if(visited.contains(rp.vtx)){
23				continue;
24			}
25//			3.Marked visited
26			visited.add(rp.vtx);
27//          4.add nbrs
28            ans=rp.cost;
29			for(int nbrs: map.get(rp.vtx).keySet()) {
30				 if(!visited.contains(nbrs)) { 
31					int cost=map.get(rp.vtx).get(nbrs);
32					pq.add(new DijkstraPair(nbrs, rp.cost+cost));
33				}
34			}
35		}
36			return visited.size() == n ? ans : -1;
37	}
38    public void AddEdge(int v1,int v2,int cost) {
39		map.get(v1).put(v2, cost);
40	}
41	class DijkstraPair{
42		int vtx;
43		int cost;
44		public DijkstraPair(int vtx, int cost) {
45			this.vtx=vtx;
46			this.cost=cost;
47		}
48    }
49}