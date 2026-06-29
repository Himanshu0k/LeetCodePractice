class Solution {
    private void dfs(int city, int[][] province, boolean[] visited) {
        visited[city] = true;

        for(int i = 0; i < province.length; i++) {
            if(!visited[i] && province[city][i] == 1) dfs(i, province, visited);
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int size = isConnected.length;

        boolean[] visited = new boolean[size];

        int count = 0;

        for(int city = 0; city < size; city++) {
            if(!visited[city]) {
                dfs(city, isConnected, visited);
                count++;
            }
        }
        return count;
    }
}