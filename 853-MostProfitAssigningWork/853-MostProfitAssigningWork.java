// Last updated: 8/1/2025, 10:35:31 PM
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int p=0;
        sort(difficulty,profit);
        Arrays.sort(worker);
         if(difficulty[0]>worker[worker.length-1]){
            return 0;
           }
        for(int i=0;i<worker.length;i++){
            int curr=0;
            for(int j=0;j<difficulty.length;j++){
          if(worker[i]>=difficulty[j]){
            curr=Math.max(curr,profit[j]);
          }
            }
            p+=curr;

        }
        return p;
    }
    
    public static void sort(int[] arr,int[] pro) {
		for(int j=1;j<arr.length;j++) {  
			for(int i=0;i<arr.length-j;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
                    int temp2=pro[i];
                    pro[i]=pro[i+1];
                    pro[i+1]=temp2;
				}
			}
			}
	}
}