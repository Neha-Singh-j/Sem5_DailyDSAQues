// Last updated: 8/1/2025, 10:32:01 PM
class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        
        for(int i=0;i<details.length;i++){
            int agee = (details[i].charAt(11)-'0')*10+(details[i].charAt(12)-'0');
           
            if(agee>60){
                count++;
            }
           
            }
            return count;
        }
        }

        
   