class Solution {
    public int smallestRepunitDivByK(int k) {
        int n=1;
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        int count=1;
        if(k==1)
            return 1;
       
        while(n!=0)
        { 
           count++;
            n=(n*10+1)%k;
            if(h.contains(n))
                return -1;
            h.add(n);
            
        }
        return count;
    }
}