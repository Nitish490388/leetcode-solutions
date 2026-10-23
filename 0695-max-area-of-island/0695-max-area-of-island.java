class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int x = grid.length;
        int y = grid[0].length;
        int max = 0;

        for(int i = 0; i<x; i++) {
            for(int j =0; j<y; j++) {
                if(grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j, x, y));
                }
            }
        }

        return max;
    }

    int dfs(int arr[][], int i, int j, int x, int y) {
        if(i < 0 || j < 0 || i > x -1 || j > y-1 || arr[i][j] == 0) {
            return 0;
        }
        arr[i][j] = 0;
        return (
            1
            +dfs(arr, i-1, j, x, y)
            +dfs(arr, i+1, j, x, y)
            +dfs(arr, i, j-1, x, y)
            +dfs(arr, i, j+1, x, y)
        );
    }
}