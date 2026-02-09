class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int[] arr=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            int h=1; //ancestor height
            while(a!=b){
                if(a>b){
                    a>>=1;
                }else{
                    b>>=1;
                }
                h++;
            }
            arr[i]=h;
        }
        return arr;
    }
        public int ancs(int a,int b){
            
            while(a!=b){
                if(a>b){
                    a/=2;
                }else{
                    b/=2;
                }
            }
            return a;
        }
        public int ht(int x){
            double ans = Math.log(x) / Math.log(2);
            return (int)(ans) +1;
        }
    
}