class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int x;
        int [][] matrix = new int[m][n];
        for(int i=0; i<indices.length; i++) {
            for(int j=0; j<2; j++) {
              x = indices[i][j];
            if(j == 0)
                for(int k=0; k<n; k++)
                    matrix[x][k]= matrix[x][k] + 1;
            else
                for(int k=0; k<m; k++)
                    matrix[k][x]++;
            }            
        }
        int c=0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
              x = matrix[i][j];
            if(x%2 != 0)
                c++;
            }            
        }
        return c;
    }
}