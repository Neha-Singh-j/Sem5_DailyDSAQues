// Last updated: 8/5/2025, 7:45:28 PM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] check=new boolean[fruits.length];
        Arrays.fill(check,false);
        int up=0;
        boolean f=false;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<fruits.length;j++){
                if(fruits[i]<=baskets[j] && check[j]==false){
                    check[j]=true;
                    f=true;
                    break;
                }
            }
            if(!f) up++;
            f=false;
        }
        return up;
    }
}