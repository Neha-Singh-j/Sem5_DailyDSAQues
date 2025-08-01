// Last updated: 8/1/2025, 10:32:54 PM
class Solution {
    public int countWords(String[] s1, String[] s2) {
        HashMap<String, Integer> set = new HashMap<>();
        HashMap<String, Integer> set2 = new HashMap<>();
        int count=0;
        for (int i = 0; i < s1.length; i++) {
            set.put(s1[i], set.getOrDefault(s1[i], 0) + 1);
        }
        for (int i = 0; i < s2.length; i++) {
            set2.put(s2[i], set2.getOrDefault(s2[i], 0) + 1);
        }

       for(int i=0;i<s1.length;i++){
        String key=s1[i];
            if (set.get(key) == 1 && set2.containsKey(key)) {
                if(set2.get(key)==1)
                count++;
            }
        }
       
        return count;
    }
}