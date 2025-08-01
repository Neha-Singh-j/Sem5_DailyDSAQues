// Last updated: 8/1/2025, 10:39:54 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
       int numRows=rowIndex+1;
        ArrayList<List<Integer>> finals=new ArrayList<List<Integer>>();
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        finals.add(firstRow);
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow=finals.get(i-1);
            List<Integer> currRow=new ArrayList<>();
            currRow.add(1);
            for(int j=1;j<i;j++){
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            currRow.add(1);
            finals.add(currRow);
        }
        if(finals.size()==0){
            return finals.get(0);
        }
        return finals.get(rowIndex);
    }
}