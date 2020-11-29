/*class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        
        int arr[]=new int[n-k+1];
        int d=0;
        for(int i=0;i<=nums.length-k;i++)
        { int max=Integer.MIN_VALUE;
            for(int j=0;j<k;j++)
            {
                 max=Math.max(nums[i+j],max);
            }
         arr[d++]=max;
        }
        return arr;
        
    }
}*/


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n-k+1];
        int d1=0;
        Deque<Integer> q=new LinkedList<>();
        for(int i=0;i<k;i++)
        {
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i])
                q.removeLast();
                q.addLast(i);
        }
        for(int i=k;i<n;i++)
        {
            arr[d1++]=nums[q.peekFirst()];
            while(!q.isEmpty() && (i-k)>=q.peekFirst())
                q.removeFirst();
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i])
                q.removeLast();
            q.addLast(i);
            
            
            
            
            
            
            
            
            
        }
        arr[d1++]=nums[q.peekFirst()];
        return arr;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}