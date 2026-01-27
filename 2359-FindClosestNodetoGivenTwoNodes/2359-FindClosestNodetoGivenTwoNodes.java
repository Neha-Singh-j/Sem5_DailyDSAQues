// Last updated: 1/27/2026, 1:34:39 PM
1class Solution {
2    public int closestMeetingNode(int[] edges, int node1, int node2) {
3        // keep distance of all nodes from nod1,node2
4        int[] dis1=new int[edges.length];
5        int[] dis2=new int[edges.length];
6         Arrays.fill(dis1,-1);
7         Arrays.fill(dis2,-1);
8         getDis(edges,node1,dis1);
9         getDis(edges,node2,dis2);
10         int res=-1;
11         int minDis=Integer.MAX_VALUE;
12         for(int i=0;i<edges.length;i++){
13            if(dis1[i]!=-1 && dis2[i]!=-1){
14                int curr=Math.max(dis1[i],dis2[i]);
15                if(minDis>curr){
16                    minDis=curr;
17                    res=i;
18                }
19            }
20         }
21         return res;
22    }
23    public static void getDis(int[] arr, int src,int[] dis){
24        int idx=src;
25        int d=0;
26        while(idx!=-1 && dis[idx]==-1){
27            dis[idx]=d++;
28            idx=arr[idx];
29        }
30    }
31}