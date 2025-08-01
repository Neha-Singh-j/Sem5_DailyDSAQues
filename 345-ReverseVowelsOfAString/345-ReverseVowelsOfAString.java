// Last updated: 8/1/2025, 10:37:41 PM
class Solution {
    public String reverseVowels(String s) {
        char[] sc = s.toCharArray();  // Convert the string to a mutable character array
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            // Move the left pointer until a vowel is found
            while (i < j && !isVowel(sc[i])) {
                i++;
            }
            // Move the right pointer until a vowel is found
            while (i < j && !isVowel(sc[j])) {
                j--;
            }
            // Swap the vowels
            char temp = sc[i];
            sc[i] = sc[j];
            sc[j] = temp;
            
            // Move pointers inward
            i++;
            j--;
        }
        
        return new String(sc);  // Convert the character array back to a string
    }
    
    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
