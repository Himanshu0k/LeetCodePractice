class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int row = grid.size();
        int col = grid.get(0).size();
        
        int [][] visited = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                visited[i][j] = -1;
            }
        }

        return dfs(grid, 0, 0, health, visited);
    }

    boolean dfs(List<List<Integer>> grid, int row, int col, int health, int[][] visited) {
        int rows = grid.size();
        int cols = grid.get(0).size();

        // condition to check out of bounds
        if(row >= rows || col >= cols || row < 0 || col < 0) return false;

        // calculate health
        health -= grid.get(row).get(col);

        // check whether u r still alive or not
        if(health < 1) return false;

        // check if previous path had better health or not
        if(visited[row][col] >= health) return false;

        visited[row][col] = health;

        if(row == rows-1 && col == cols-1) return true;

        return dfs(grid, row+1, col, health, visited) || dfs(grid, row-1, col, health, visited) || 
                dfs(grid, row, col+1, health, visited) ||
                dfs(grid, row, col-1, health, visited);
    }
}