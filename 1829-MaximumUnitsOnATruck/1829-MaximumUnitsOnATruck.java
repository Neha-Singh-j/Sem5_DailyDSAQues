// Last updated: 8/1/2025, 10:33:16 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
       int c=0;
            for(int i=0;i<boxTypes.length && truckSize>0 ;i++){
                int min=Math.min(boxTypes[i][0],truckSize);
                    c+=min*boxTypes[i][1];
                    truckSize-=min;
            }
            return c;
    }
}