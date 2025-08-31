// Last updated: 8/31/2025, 4:13:15 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area=0;
       double dlen=0.0;
        for(int i=0;i<dimensions.length;i++){
            double len=dlength(dimensions[i][0],dimensions[i][1]);
            if(len>dlen){
                dlen=len;
                area=dimensions[i][0]*dimensions[i][1];
            }else if (len ==dlen) { 
                area = Math.max(area, dimensions[i][0] * dimensions[i][1]);
            }
        }
        
        return area;
    }
    public static double dlength(int a,int b){
        return Math.sqrt((long)a * a + (long)b * b);
    }
}