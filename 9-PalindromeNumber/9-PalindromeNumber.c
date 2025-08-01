// Last updated: 8/1/2025, 10:42:58 PM
bool isPalindrome(int x) {
    if(x<0 ||(x%10==0 && x!=0)){
    return false;
    }
    int reversed=0;
    while(x>reversed){
        reversed=reversed*10+x%10;
        x=x/10;
    }
    return x==reversed|| x==reversed/10;
}