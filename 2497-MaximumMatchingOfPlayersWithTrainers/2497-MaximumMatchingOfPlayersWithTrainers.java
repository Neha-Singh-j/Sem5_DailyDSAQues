// Last updated: 8/1/2025, 10:32:28 PM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n=trainers.length;
        int c=0;
        int j=players.length-1;
        for(int i=n-1;i>=0;i--){
           while(j>=0){
                if(players[j]<=trainers[i]){
                   j--;
                   c++;
                    break;
                }else{
                    j--;
                }
                
            }
        }
    return c;
    }
}