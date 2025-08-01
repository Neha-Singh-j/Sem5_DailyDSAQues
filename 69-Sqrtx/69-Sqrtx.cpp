// Last updated: 8/1/2025, 10:41:04 PM
class Solution {
public:
    int mySqrt(int x) {
      if(x==0 ||x==1){
         return x;
      }   
    //  long l=0,r=x;
    //  while(l<=r){
    //      long mid=l+(r-l)/2;
    //      long sq=mid*mid;
    //      if(sq==x){
    //          return mid;
    //      }
    //      else if(sq<x){
    //          l=mid+1;
    //      }
    //      else if(sq<x){
    //          r=mid-1;
    //      }
    //  }
    //  return r;
long sq=x/2;
while(sq*sq>x){
    sq=(sq+x/sq)/2;

}
return sq;
    }
};