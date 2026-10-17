class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int cnt = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    cnt++;
                    bfs(i,j,grid,vis);
                }
            }
        }
        return cnt;
    }
    private void bfs(int row,int col,char[][] grid,boolean[][] vis){
        vis[row][col] = true;
        Queue<Pair> q = new LinkedList<Pair>();
        int[] delrow = {-1, 1, 0, 0};
        int[] delcol = {0, 0, -1, 1};
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            q.remove();
            for(int i = 0 ; i < 4 ; i++){
                    int nr = r + delrow[i];
                    int nc = c + delcol[i];
                    if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && !vis[nr][nc] && grid[nr][nc] == '1'){
                        vis[nr][nc] = true;
                        q.add(new Pair(nr,nc));
                    
                }
            }
        }

    }
}
