// Last updated: 8/1/2025, 10:37:46 PM
class Solution {
    public boolean isPowerOfFour(int n) {
    int lo=1;
    int hi=n;    
    if(n==1){
        return true;
    }
while(lo<=hi){
    int mid=(lo+hi)/2;
    if(Math.pow(4,mid)==n){
        return true;

    }else if(Math.pow(4,mid)>n){
       hi=mid-1;
    }else{
        lo=mid+1;
    }

}
return false;
}
}