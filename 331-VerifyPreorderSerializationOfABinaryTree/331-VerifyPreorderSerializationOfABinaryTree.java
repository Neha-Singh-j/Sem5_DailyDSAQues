// Last updated: 8/1/2025, 10:37:49 PM
class Solution {
    public boolean isValidSerialization(String preorder) {
       String[] preOrdr=preorder.split(",");
       int len=1;
       for(String i :preOrdr){
            len--;
            if(len<0) return false;

            if(!i.equals("#")){
                len+=2;
            }
       }
       return len==0;
    }
}