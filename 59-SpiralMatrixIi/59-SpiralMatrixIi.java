// Last updated: 8/1/2025, 10:41:15 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
       int minc=0;
	int maxc=n-1;
	int minr=0;
	int maxr=n-1;
	int te=n*n;
	int c=1;
	while(c<=te) {
	for(int i=minc;i<=maxc&&c<=te;i++) {
		arr[minr][i]=c;
		c++;
	}
	minr++;
	for(int j=minr;j<=maxr&&c<=te;j++) {
		arr[j][maxc]=c;
		c++;
	}
	maxc--;
	for(int k=maxc;k>=minc&&c<=te;k--) {
		arr[maxr][k]=c;
		c++;
	}
	maxr--;
	for(int l=maxr;l>=minr&&c<te;l--) {
		arr[l][minc]=c;
		c++;
	}
	minc++;
	} 
    return arr;
    }
}