class Solution {

    private int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

    public char[][] updateBoard(char[][] board, int[] click) {
        /* ternimator */
        if (board.length == 0 || click.length != 2)
            return board;
        int m = board.length, n = board[0].length;
        int row = click[0], col = click[1];

        /* process current logic */
        // 1-如果是M或者X，变成X直接退出
        if (board[row][col] == 'M' || board[row][col] == 'X') {
            board[row][col] = 'X';
            return board;
        }

        // 2-计算周边M的数量，如果有雷，更新数字并退出
        int num = 0;
        for (int[] dir : dirs) {
            int newRow = dir[0] + row;
            int newCol = dir[1] + col;
            if (newRow >= 0 && newCol >= 0 && newRow < m && newCol < n && board[newRow][newCol] == 'M') {
                num += 1;
            }
        }
        if (num > 0) {
            board[row][col] = (char)(num + '0');
            return board;
        } else {
            board[row][col] = 'B';
        }
        /* drill down */
        // 3-揭开周边的E,dfs
        for (int[] dir : dirs) {
            int newRow = dir[0] + row;
            int newCol = dir[1] + col;
            if (newRow >= 0 && newCol >= 0 && newRow < m && newCol < n && board[newRow][newCol] == 'E') {
                updateBoard(board, new int[]{newRow, newCol});
            }
        }
        return board;
    }

    public static void main(String[] args) {
        char[][] board = {{'E','E','E','E','E'},{'E','E','M','E','E'},{'E','E','E','E','E'},{'E','E','E','E','E'}};
        int[] click = {3, 0};
        Solution s = new Solution();
        s.updateBoard(board, click);

        for(char[] r : board) {
            for (char c : r) {
                System.out.print(c);
            }
            System.out.println();
        }


    }
}
