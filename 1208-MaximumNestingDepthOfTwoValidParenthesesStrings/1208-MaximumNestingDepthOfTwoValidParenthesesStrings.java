// Last updated: 8/1/2025, 10:34:17 PM
class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] arr=new int[seq.length()];
        int d=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                  arr[i]=d%2;
                d++;
              
            }else if(seq.charAt(i)==')'){
                d--;
                arr[i]=d%2;
                
            }
        }
        return arr;
    }
}