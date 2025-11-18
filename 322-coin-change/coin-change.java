class Solution {
    public int coinChange(int[] coins, int amount) {
        return Print(amount,coins,new HashMap<>());
    }
    public static int Print(int amount,int[] arr, HashMap<Integer,Integer> hm) {
		if(amount==0) {
			return 0; 
		}
        if(amount<0){
            return -1;
        }
        if(hm.containsKey(amount)){
            return hm.get(amount);
        }
        int coins=-1;
		for(int i:arr) {
			int amountLeft=amount-i;
			int coinsLeft=Print(amountLeft,arr,hm);
            if(coinsLeft!=-1){
                if((coinsLeft+1)<coins || coins==-1){
                    coins=coinsLeft+1;
                }
            }
		}
        hm.put(amount,coins);
        return coins;
	}
}