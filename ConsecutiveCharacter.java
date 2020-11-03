/*class Solution {
    public int maxPower(String s) {
        if(s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;
      HashMap<Character,Integer> h=new HashMap<>();
        h.put(s.charAt(0),1);
        int max=Integer.MIN_VALUE;
        for(int i=1;i<s.length();i++)
        {
            if(h.containsKey(s.charAt(i)) && s.charAt(i-1)==s.charAt(i))
            {
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
                
            }
            else if(!h.containsKey(s.charAt(i)))
            h.put(s.charAt(i),1);
             
            else if(h.containsKey(s.charAt(i)) && s.charAt(i-1)!=s.charAt(i))
            {
                h.put(s.charAt(i),1);
                
            }
            max=Math.max(h.get(s.charAt(i)),max);
            
        }
        return max;
        
    }
}*/


class Solution {
    public int maxPower(String s) {
        if(s.length()==0)
            return 0;
        int count=1;
        int max=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            { count++;
                max=Math.max(max,count);
            }
            else
            {
                count=1;
            }
        }
        
       return max; 
        
        
        
        
        
        
        
    }
}





