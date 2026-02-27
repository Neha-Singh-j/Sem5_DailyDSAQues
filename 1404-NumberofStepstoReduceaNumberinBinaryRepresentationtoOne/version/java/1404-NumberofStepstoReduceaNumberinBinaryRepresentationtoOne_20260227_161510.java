// Last updated: 2/27/2026, 4:15:10 PM
1    class Solution {
2        public int numSteps(String s) {
3            int carry = 0;
4            int steps = 0;
5
6            for(int i = s.length() - 1; i > 0; i--) {  // stop at index 1
7                int b = s.charAt(i) - '0';
8                int sum = b + carry;
9
10                if(sum == 0) {
11                    steps += 1;   // divide by 2
12                } 
13                else if(sum == 1) {
14                    steps += 2;   // add 1 then divide
15                    carry = 1;
16                } 
17                else { // sum == 2
18                    steps += 1;   // divide
19                    carry = 1;
20                }
21            }
22
23            return steps + carry; // handle last bit
24        }
25    }