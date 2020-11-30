class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> res=new ArrayList<>();
        List<int[]> heights=new ArrayList<>();
        for(int []b:buildings)
        {
            heights.add(new int[]{b[0],-b[2]});//start
            heights.add(new int[]{b[1],b[2]});//end
        }
        Comparator co=new Comparator<int[]>()
        {public int compare(int a[],int b[])
        {
           if(a[0]!=b[0])
               return a[0]-b[0];
            return a[1]-b[1];
        }
            
        };
      Collections.sort(heights,co);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(0);
        int prev=0;
        for(int h[]:heights)
        {
            if(h[1]<0)
                pq.add(-h[1]);
            else
                pq.remove(h[1]);
           int curr=pq.peek();
            if(curr!=prev)
            {
                List<Integer> a=new ArrayList<>();
                a.add(h[0]);
                a.add(curr);
                res.add(a);
                prev=curr;
            }
            
        }
        return res;
        
        
    }
}