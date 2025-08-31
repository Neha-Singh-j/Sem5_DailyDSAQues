// Last updated: 8/31/2025, 4:13:36 PM
class Solution {
    public String largestGoodInteger(String num) {
       String[] numbers = {"999","888","777","666","555","444","333","222","111","000"};
        for (String n : numbers){
            if(num.contains(n)){
                return n ;
            }
        }
        return "";
    }
}