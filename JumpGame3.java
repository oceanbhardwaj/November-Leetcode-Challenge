class Solution {
    
    public boolean canReach(int[] arr, int start) {
        HashSet<Integer> h=new HashSet<>();
      
        
        return call(arr,start,h);
        
    }
    public boolean call(int arr[],int start,HashSet<Integer> h)
    {
        if( h.contains(start) || start<0 || start> arr.length-1)
            return false;
        
       
        int d=start+arr[start];
        int e=start-arr[start];
        
        h.add(start);
                     if(arr[start]==0)
                         return true;
        return call(arr,d,h)||call(arr,e,h);
    }
}
//..................................................................................................................................................
class Solution {
    
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty())
        {
            int n=q.poll();
            if(arr[n]==0)
                return true;
            if(arr[n]<0)
                continue;
            if(n+arr[n]<arr.length)
                q.add(n+arr[n]);
            if(n-arr[n]>=0)
                q.add(n-arr[n]);
            
            arr[n]=-arr[n];
        }
        return false;
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

