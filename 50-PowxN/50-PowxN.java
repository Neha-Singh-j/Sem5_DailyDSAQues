// Last updated: 8/1/2025, 10:41:31 PM
class Solution {
    public double myPow(double x, int n) {
        double n1=n;
        double xn=1;
      if (n1==0){
      
          return 1.00000;
      }
     double xnm1=Math.pow(x,n1-1);
      return xn=x*xnm1;
    }
   // public static void main(String[] arg)
}