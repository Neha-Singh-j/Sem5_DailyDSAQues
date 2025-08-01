// Last updated: 8/1/2025, 10:30:57 PM
import java.util.*;

class Solution {
    public long sumOfLargestPrimes(String s) {
        HashSet<Long> set = new HashSet<>();
        
        // Generate all substrings and convert to long
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                try {
                    long num = Long.parseLong(sub);
                    set.add(num);
                } catch (NumberFormatException e) {
                    // Ignore too large numbers
                }
            }
        }

        // Filter prime numbers
        ArrayList<Long> primes = new ArrayList<>();
        for (long num : set) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        // Sort descending to get the largest 3 primes
        Collections.sort(primes, Collections.reverseOrder());

        long sum = 0;
        for (int i = 0; i < Math.min(3, primes.size()); i++) {
            sum += primes.get(i);
        }

        return sum;
    }
    public boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
