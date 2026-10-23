class Solution {
    public int numIslands(char[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int count = 0;

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {

                if(grid[i][j] == '1') count ++;
                dfs(grid,i,j);
            }
        }

        return count;
    }

    void dfs(char arr[][], int a, int b) {
        if(a < 0 || b < 0 || a > arr.length-1 || b > arr[0].length - 1 ||
        arr[a][b] == '0') {
            return;
        }

        arr[a][b] = '0';
        dfs(arr, a-1, b);
        dfs(arr, a+1, b);
        dfs(arr, a, b-1);
        dfs(arr, a, b+1);
    }
}