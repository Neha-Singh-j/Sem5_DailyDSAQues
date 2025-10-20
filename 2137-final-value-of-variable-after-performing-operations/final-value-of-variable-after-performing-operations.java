class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int t=0;
        for(String s: operations){
            if(s.equals("--X")){
                t-=1;
            }else if(s.equals("++X")){
                t+=1;
            }else if(s.equals("X--")){
                t-=1;
            }else{
                t+=1;
            }
        }
        return t;
    }
}