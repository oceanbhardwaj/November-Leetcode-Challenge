class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        for(int a[]:A)
        {
            int i=0;
            int j=a.length-1;
            while(i<j)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                // if(A[i][j]==1)
                //     A[i][j]=0;
                // else
                //     A[i][j]=1;
                
                A[i][j]=A[i][j]^1;
            }
        }
        return A;
        
    }
}*/
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        for(int i=0;i<A.length;i++)
        {  int left=0;
         int right=A[i].length-1;
            while(left<=right)
            {
                if(A[i][left]==A[i][right])
                {
                    A[i][left]=1^A[i][left];
                    A[i][right]=A[i][left];
                }
                left++;
                right--;
            }
            
        }
        return A;
        
    }
}