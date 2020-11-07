.......................................................................bruteforce--TLE............................................................................................................
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        if(n==0)
            return 0;
        Arrays.sort(nums);
        int d=nums[n-1];
        int ans=0;
        for(int i=1;i<=d;i++)
        {
          int sum=0;
            for(int j=0;j<n;j++)
            {
                int d1=nums[j];
                sum=sum+(int)Math.ceil((double)d1/(double)i);
            }
            if(sum<=threshold)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}*/

..................................................................................................BinarySearch...............................................................................................................
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
          int n=nums.length;
        if(n==0)
            return 0;
        Arrays.sort(nums);
        int d=nums[n-1];
        int ans=0;
        int left=0;
        int right=d-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum=sum+(int)Math.ceil((double)nums[i]/(double)(mid+1));
            }
            if(sum<=threshold)
            {
                ans=mid+1;
                right=mid-1;
            }
            else if(sum>threshold)
                left=mid+1;
        }
        
        return ans;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}






















