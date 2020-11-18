class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
     
        Comparator co=new Comparator<int[]>()
        {
            public int compare(int a[],int b[])
            {
                if(a[0]==b[0])
                    return a[1]-b[1];
                return a[0]-b[0];
            }
        };
        Arrays.sort(intervals,co);
        ArrayList<int[]> a=new ArrayList<>();
        int curr[]=intervals[0];
        a.add(curr);
        
        for(int a1[]:intervals)
        {
            if(curr[1]>=a1[0])//overlapping
            {
                curr[1]=Math.max(a1[1],curr[1]);
            }
            else
            { 
                curr=a1;
                a.add(curr);
            }
            
            
            
            
            
        }
        
            
            
            
            
            
            
        
        int n=a.size();
        int arr[][]=new int [n][2];
        int d=0;
       
        for(int b[]:a)
        {
            arr[d][0]=b[0];
            arr[d][1]=b[1];
            d++;
        }
        return arr;
    }
}