class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int num = 0;
        for (int i=0;i<rows;++i){
            for (int j=0;j<cols;++j){
                if(grid[i][j]=='1'){
                    num++;
                    dfs(grid, i, j);
                }
            }
        }
        return num;
    }

    public void dfs(char[][] grid, int r, int c){
        if(!inArea(grid, r, c)){
            return;
        }
        if(grid[r][c]!='1'){
            return;
        }
        grid[r][c] = '2';
        dfs(grid, r, c-1);
        dfs(grid, r, c+1);
        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
    }

    public boolean inArea(char[][] grid, int r, int c){
        return 0<=r&&r<grid.length&&0<=c&&c<grid[0].length;
    }
}