// Last updated: 3/21/2026, 11:52:11 PM
1class Solution {
2    public boolean winnerOfGame(String colors) {
3        int a=0;
4        int b=0;
5        for(int i=1;i<colors.length()-1;i++){
6            if(colors.charAt(i)=='A' && colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
7                a++;
8               
9            }else if(colors.charAt(i)=='B' && colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
10                b++;
11                
12            }
13
14        }
15          return a>b;
16    }
17}