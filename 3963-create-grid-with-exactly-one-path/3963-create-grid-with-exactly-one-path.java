class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid=new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(grid[i],'#');
        }
        if(m==1){
            Arrays.fill(grid[0],'.');
        }
        else if(n==1){
            for(int i=0;i<m;i++){
                grid[i][0]='.';
            }
        }
        else{
            for(int j=0;j<=n-2;j++){
                grid[0][j]='.';
            }
            for(int i=0;i<m;i++){
                grid[i][n-2]='.';
            }
            grid[m-1][n-1]='.';
        }
        String[] res=new String[m];
        for(int i=0;i<m;i++){
            res[i]=new String(grid[i]);
        }
        return res;
    }
}