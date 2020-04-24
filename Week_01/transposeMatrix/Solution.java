class Solution {
    public int[][] transpose(int[][] A) {
        int n = A.length, m = A[0].length;
        int[][] B = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
}
