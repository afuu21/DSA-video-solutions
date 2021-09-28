class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int c=0;
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j]==0) {
                    x.add(i);
                    x.add(j);
                    c+=2;
                }
            }
        }
        int i = 0,f,g;
        while(i!=c) {
            f = x.get(i++);
            g = x.get(i++);
            
            for(int a=0; a<m; a++) {
                matrix[a][g] = 0;
            }
            for(int b=0; b<n; b++) {
                matrix[f][b] = 0;
            }
        }
        
        
    }
}