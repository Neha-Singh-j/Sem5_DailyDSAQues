// Last updated: 8/1/2025, 10:38:04 PM





class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false; 
              }
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 5 == 0) {
                n /= 5;
            } else {
                return false; 
            }
        }
        return true;
    }
}
// class Solution {
//     public boolean isUgly(int n) {
//         if(n<=1){
//             return true;
//         }
//         while(n>1){
//             if(n%2==0){
//                 n=n/2;
//             }else if(n%3==0){
//                 n=n/3;
//             }else if(n%5==0){
//                 n=n/5;
//             }}
//             if(n!=1){
//                 return false;
//             }else{
//                return true;
//             }
//     }
// }