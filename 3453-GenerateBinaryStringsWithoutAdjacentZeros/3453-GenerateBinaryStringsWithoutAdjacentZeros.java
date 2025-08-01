// Last updated: 8/1/2025, 10:31:37 PM
class Solution {
    public List<String> validStrings(int n) {
        List<String> ll=new ArrayList<>();
        print(n,"",ll);
        System.out.println(ll);
        return ll;
    }
    public static void print(int n,String s,List<String> ll){
        if(s.length()==n){
            boolean flag=true;
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    if(s.charAt(i)=='0'){
                        flag=false;
                    }
                }
            }
            if(flag)
            ll.add(s);
            return;
        }
        print(n,s+"0",ll);
        print(n,s+"1",ll);
    }
}