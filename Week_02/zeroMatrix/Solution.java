class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0) return;
        int m = matrix.length, n = matrix[0].length;
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0){
                    setA.add(i);
                    setB.add(j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (setA.contains(i) || setB.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
