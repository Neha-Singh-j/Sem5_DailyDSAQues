// Last updated: 1/26/2026, 1:44:30 PM
1class Solution {
2    private boolean[] prime;
3
4    public int primeSubarray(int[] nums, int k) {
5        int n = nums.length, max = 0;
6
7        //  maximum value in nums for sieve limit
8        for (int num : nums) max = Math.max(max, num);
9
10        TreeMap<Integer, Integer> map = new TreeMap<>(); //sorted order track
11        int primes = 0;
12
13        // l1 -left ptr with atmmost one prime (invalid subarray counts so atlast we can substract that from total count)
14        // l2 -> checking preime gap <=k
15        int l1 = 0, l2 = 0;
16
17        sieve(max);
18
19        // cnt 1- count subarray atlmost one prime
20        // cntK - count subarray with prime gap <= k
21        int cntK = 0, cnt1 = 0;
22        for (int r = 0; r < n; r++) {
23            if (prime[nums[r]]) { //check if prime then put in window
24                primes++;
25                map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
26            }
27
28            while (primes > 1) {
29                if (prime[nums[l1]]) primes--;
30                l1++;
31            }
32
33            // Maintain window [l2..r] with (maxPrime - minPrime) <= k
34            while (!map.isEmpty() && map.lastKey() - map.firstKey() > k) {
35                if (prime[nums[l2]]) {
36                    map.put(nums[l2], map.get(nums[l2]) - 1);
37                    if (map.get(nums[l2]) == 0) map.remove(nums[l2]);
38                }
39                l2++;
40            }
41
42            
43            cnt1 += (r - l1 + 1); //valid subarrays with atleast 2 prime 
44            cntK += (r - l2 + 1); //maximum possible with gap of <=k 
45        }
46        return cntK - cnt1;
47    }
48
49    private void sieve(int n) {
50        prime = new boolean[n + 1];
51        Arrays.fill(prime, true);
52        prime[1] = false;
53
54        for (int p = 2; p * p <= n; p++) {
55            if (prime[p]) {
56                for (int i = p * p; i <= n; i += p)
57                    prime[i] = false;
58            }
59        }
60    }
61}
62