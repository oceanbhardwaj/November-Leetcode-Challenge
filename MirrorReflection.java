class Solution {    //ext*p=ref*q
    public int mirrorReflection(int p, int q) {
        int ref=p;
        int ext=q;
        while(ref%2==0 && ext%2==0)
        {
            ref=ref/2;
            ext=ext/2;
        }
        if(ref%2==0 && ext%2!=0)
            return 2;
        if(ref%2!=0 && ext%2==0)
            return 0;
        if(ref%2!=0 && ext%2!=0)
            return 1;
        return -1;
        
    }
}