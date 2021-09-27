class Solution {
    public int maximumWealth(int[][] accounts) {
        int row_sum = 0, max_wealth=0;
        for(int i=0; i<accounts.length; i++) {
            row_sum = 0;
            for(int j=0; j<accounts[0].length; j++) {
                row_sum += accounts[i][j];
            }
            if(row_sum > max_wealth)
                max_wealth = row_sum;
        }
        return max_wealth;
    }
}