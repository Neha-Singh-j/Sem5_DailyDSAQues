class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int idx=0;
        int c=0;
        for(int i=0;i<chars.length;i++){
            c=0;
           char ch=chars[i];
           while(i<n && ch==chars[i]){
                c++;
                i++;
           }
           if(c==1){
                chars[idx]=ch;
                idx++;
           }else{
                chars[idx]=ch;
                idx++;
                for(char d: Integer.toString(c).toCharArray()){
                    chars[idx]=d;
                    idx++;
                }
           }
           i--;
        }
        return idx;

    }
}