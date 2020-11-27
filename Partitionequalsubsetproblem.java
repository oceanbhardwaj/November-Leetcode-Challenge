class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
            sum=sum+nums[i];
       return (sum%2==0)?subset(nums,sum/2,n):false; 
    }
    public boolean subset(int nums[],int sum,int n)
    {
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(i==0)
                    dp[i][j]=false;
                if(j==0)
                    dp[i][j]=true;
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(nums[i-1]<=j)
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
                else
                    dp[i][j]=dp[i-1][j];
             }
        }
        
        return dp[n][sum];
        
        
        
        
        
        
        
        
    }
}