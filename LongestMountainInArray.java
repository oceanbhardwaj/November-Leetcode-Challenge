class Solution {
    public int longestMountain(int[] A) {
        if(A.length<3)
            return 0;
        int max=Integer.MIN_VALUE;
        int flag1=0;
        int flag2=0;
        
        for(int i=0;i<A.length;i++)
        {   int j=i;
         int count=1;
                 int d=A[j];
           
             j++;
            while(j<A.length && d<A[j])
            {flag1=1;
                count++;
             d=A[j];
             j++;
            }
         while(j<A.length && d>A[j] && count>1)
         { flag2=1;
             count++;
           d=A[j];
          j++;
         
         }
          max=Math.max(max,count);  
            
            
        }
        return (max>=3 && flag1==1 && flag2==1)?max:0;
        
    }
}*/

class Solution {
    public int longestMountain(int[] A) {
     if(A.length<3)
         return 0;
        int max=Integer.MIN_VALUE;
       int left[]=new int[A.length];
        int right[]=new int[A.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        
        for(int i=1;i<A.length;i++)
        {if(A[i]>A[i-1])
                left[i]=left[i-1]+1;}
        
        for(int i=A.length-2;i>=0;i--)
        {
            if(A[i]>A[i+1])
                right[i]=right[i+1]+1;
            
        }
        
        for(int i=1;i<A.length-1;i++)
        {
            if(A[i]>A[i-1] && A[i]>A[i+1])
                max=Math.max(left[i-1]+right[i+1]+1,max);
        }
        
        
        return max>0?max:0;
        
        
        
        
        
        
        
        
        
        
        
    }
}






