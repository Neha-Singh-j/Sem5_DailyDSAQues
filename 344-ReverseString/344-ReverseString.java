// Last updated: 8/1/2025, 10:37:44 PM
class Solution {
    public void reverseString(char[] s) {
       
        int ptr1=0;
        int ptr2=s.length-1;
        while(ptr1<ptr2){
            char temp=s[ptr2];
            s[ptr2]=s[ptr1];
            s[ptr1]=temp;
            ptr1++;
            ptr2--;
        }
    }
}