// Last updated: 8/1/2025, 10:39:53 PM
class Solution {
    public List<List<Integer>> generate(int n) {
        ArrayList<List<Integer>> finals = new ArrayList<List<Integer>>();
		int row = 0;
		int star = 1;
		while (row < n) {
			List<Integer> curr = new ArrayList<>();
			int i = 0;
			int ncr=1;
			while (i < star) {
				curr.add(ncr);
				ncr = ((row - i) * ncr) / (i + 1);
				i++;
			}
			finals.add(curr);
			row++;
			star++;
		}
return finals;
	}

}