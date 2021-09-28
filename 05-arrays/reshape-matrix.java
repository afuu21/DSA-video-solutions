class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int ans[][] = new int[r][c];
        int temp[] = new int[r*c];
        int k;
        
        if(mat[0].length * mat.length != r * c)
            return mat;
        k=0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                temp[k] = mat[i][j];
                k++;
            }
        }
        k=0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                ans[i][j] = temp[k++];
            }
        }
        return ans;
    }
}