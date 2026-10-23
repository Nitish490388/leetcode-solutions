class Solution {
    public void solve(char[][] board) {
        int x = board.length;
        int y = board[0].length;

        // Step 1: Find all border-connected O cells
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 || i == x - 1 || j == 0 || j == y - 1) {
                    if (board[i][j] == 'O') {
                        dfs(board, i, j, x, y);
                    }
                }
            }
        }

        // Step 2: Convert surrounded O cells and restore safe cells
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    void dfs(char[][] board, int i, int j, int x, int y) {
        if (i < 0 || j < 0 || i >= x || j >= y ||
            board[i][j] == 'X' || board[i][j] == '#') {
            return;
        }

        board[i][j] = '#';

        dfs(board, i - 1, j, x, y);
        dfs(board, i + 1, j, x, y);
        dfs(board, i, j - 1, x, y);
        dfs(board, i, j + 1, x, y);
    }
}