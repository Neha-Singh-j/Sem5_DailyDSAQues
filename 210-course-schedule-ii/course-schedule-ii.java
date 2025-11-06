class Solution {
     private HashMap<Integer, List<Integer>> map;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        map=new HashMap<>();
		for(int i=0;i<numCourses;i++) {
			map.put(i, new ArrayList<>());
		}

       for(int i=0;i<prerequisites.length;i++){
             AddEdge(prerequisites[i][0],prerequisites[i][1]);
       }
        return isCycle(numCourses);
    }
  
	
	public void AddEdge(int v1,int v2) {
		map.get(v1).add(v2);
	}
	
	public int[] indegree(){
		int[] in=new int[map.size()];
		for(int v1:map.keySet()) {
			for(int v2:map.get(v1)) {
				in[v2]++;
			}
		}
		return in;
	}
	 public int[] isCycle(int numCourses) {
		 int[] arr=new int[numCourses];
         int idx=numCourses-1;
		 Queue<Integer> q=new LinkedList<>();
		 int[] in=indegree();
		 for(int i=0;i<in.length;i++) {
			 if(in[i]==0) {
				 q.add(i);
			 }
		 }
		 int c=0;
		 while(!q.isEmpty()) {
			 int r= q.poll();
             arr[idx--]=r;
             
			c++;
			 for(int nbrs: map.get(r)) {
				 in[nbrs]--;
				 if(in[nbrs]==0) {
					 q.add(nbrs);
				 }
			 }
		 }
		if(c!=map.size()){ //cycle is their so no order we can return
            return new int[0];
        }
        return arr;
     }
}