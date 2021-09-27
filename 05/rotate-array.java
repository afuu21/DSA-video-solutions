class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for (int i = 0; i < 4; i++) {
            
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            int length = mat.length;
            
            for (int first = 0; first < length/2; first++) {
                int last = length-1-first;
                for (int j = first; j < last; j++) {
                    int offset = j - first;
                    int top = mat[first][j];
                    mat[first][j] = mat[last-offset][first];
                    mat[last-offset][first] = mat[last][last-offset];
                    mat[last][last-offset] = mat[j][last];
                    mat[j][last] = top;
                }
            }
        }
        
        return false;
    }
}