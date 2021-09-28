class Solution {
    public int maxSubArray(int[] nums) {
        boolean b = true;
        int maxSum=-10000;
        for(int i : nums)
            if(i>=0)
                b=false;
        if(!b){
        int sum=0;
        for(int i : nums) {
            sum+=i;
            if(sum<0)
                sum=0;
            if(maxSum<sum)
                maxSum=sum;
        }
    } else {
           
            for(int i : nums)
            if(i>=maxSum)
                maxSum = i;
        }
        return maxSum;
    }
}