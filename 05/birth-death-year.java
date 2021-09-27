class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] soln = new int[2055];
        for(int[] log: logs) {
            for(int i= log[0]; i!=log[1]; i++) {
                soln[i]++;
            }
        }
        int max=0;
        int j=0;
        for(int i=1950; i<=2050; i++) {
            if(soln[i] > max) {
                max = soln[i];
                j = i;
            }
        }
        return j;
    }
}