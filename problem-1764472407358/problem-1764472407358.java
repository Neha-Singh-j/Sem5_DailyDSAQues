// Last updated: 11/30/2025, 8:43:27 AM
1class Solution {
2    public int maxDistinct(String s) {
3        HashSet<Character> unique=new HashSet<>();
4        int n=s.length();
5        for(int i=0;i<n;i++){
6            unique.add(s.charAt(i));
7        }
8        return unique.size();
9    }
10}