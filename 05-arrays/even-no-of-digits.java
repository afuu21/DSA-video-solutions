class Solution {
    public int findNumbers(int[] nums) {
        int x,c,res=0;
        for(int i=0; i<nums.length; i++) {
            x = nums[i];
            c=0;
            while(x!=0) {
                x/=10;
                c++;
            }
            if(c%2==0)
                res++;
        }
        return res;
    }
}