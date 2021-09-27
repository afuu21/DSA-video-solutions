class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int c,k=0,i,j;
        int ans[] = new int[n];
        for(i = 0 ; i<n ;i++) {
            c=0;
            for(j = 0 ; j<n; j++) {
                if(i!=j && nums[j]<nums[i])
                    c++;
            }
            ans[k++] = c;
        }
        return ans;
    }
}