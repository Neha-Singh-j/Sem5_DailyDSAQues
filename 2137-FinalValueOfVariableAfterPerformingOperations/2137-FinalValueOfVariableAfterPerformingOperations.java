// Last updated: 10/26/2025, 10:06:34 PM
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