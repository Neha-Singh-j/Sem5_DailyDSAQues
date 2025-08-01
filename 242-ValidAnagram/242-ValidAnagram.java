// Last updated: 8/1/2025, 10:38:08 PM
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
       
        char[] charArray1 = s.toCharArray();
Arrays.sort(charArray1);
String sortedString1 = new String(charArray1);
char[] charArray2 = t.toCharArray();
Arrays.sort(charArray2);
String sortedString2 = new String(charArray2);
return sortedString2.equals(sortedString1);
    }
}