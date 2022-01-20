class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max_aera = 0;
        for(int i=0;i<grid.length;++i){
            for(int j=0;j<grid[0].length;++j){
                if(grid[i][j]==1){
                    max_aera = Math.max(max_aera, dfs(grid, i, j));
                }
            }
        }
        return max_aera;
    }

    public int dfs(int[][] grid, int r, int c){
        if(!inArea(grid, r, c)){
            return 0;
        }
        if(grid[r][c]!=1){
            return 0;
        }
        grid[r][c] = 2;
        int area = 1;
        return area+dfs(grid, r, c-1)+dfs(grid, r, c+1)+dfs(grid, r+1, c)+dfs(grid, r-1, c);
    }

    public boolean inArea(int[][] grid, int r, int c){
        return 0<=r&&r<grid.length&&0<=c&&c<grid[0].length;
    }
}
