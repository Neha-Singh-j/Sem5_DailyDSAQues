// Last updated: 8/1/2025, 10:34:41 PM
class Solution {
    public int fib(int n) {
        return fibo(n);
    }
    public static int fibo(int n){
        if(n==1 || n==0) return n;
        return fibo(n-1)+fibo(n-2);
    }
}