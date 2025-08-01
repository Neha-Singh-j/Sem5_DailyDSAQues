// Last updated: 8/1/2025, 10:42:44 PM
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
         map.put('V',5);
          map.put('X',10);
          
           map.put('L',50);
            map.put('C',100);
         map.put('D',500);
          map.put('M',1000);
          int total=0;
          for(int i=0;i<s.length();i++){
int currCount=map.get(s.charAt(i));
if(i<s.length()-1 &&currCount<map.get(s.charAt(i+1))){
    total-=currCount;
}else{
    total+=currCount;
}

          }
return total;

    }
}