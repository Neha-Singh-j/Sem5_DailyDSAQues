// Last updated: 8/1/2025, 10:35:13 PM
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s=s1+" "+s2;
        String[] arr=s.split(" ");
         ArrayList<String> res=new ArrayList<>();
         HashMap<String,Integer> set=new HashMap<>();
        for(int i=0;i<arr.length;i++){
           
             set.put(arr[i], set.getOrDefault(arr[i], 0) + 1); 
        }
       
            for (String key : set.keySet()) {
    if (set.get(key) == 1) {
        res.add(key);
    }
}
 String[] ans=new String[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}