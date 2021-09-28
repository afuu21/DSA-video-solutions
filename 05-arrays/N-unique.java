class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int x = -1*(n/2);
        if(n%2!=0)
        for(int i=0; i<n; i++)
            ans[i] = x++;
        else
        for(int i=0; i<n; i++) {
            if(i!=n/2)
            ans[i] = x++;
            else{
            x+=1;
            ans[i]=x++;
            }
        }
        return ans;
}
}