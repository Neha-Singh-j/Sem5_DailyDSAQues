// Last updated: 8/1/2025, 10:34:15 PM
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
      
        List<Integer> arr=new ArrayList<>();
          int num=0;
          int x=1;
          int j=x;
        for(int i=x;i<=9;i++){
            num=num*10+j;
            j++;
            if(num>=low &&num<=high){

                arr.add(num);
            }
            if(num>high ||j>9){
                num=0;
                j=x+1;
                x++;
                i=x-1;
              
            }
        }
        
         Collections.sort(arr);
       
        return arr;
    }
}