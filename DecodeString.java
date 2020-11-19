class Solution {
    public String decodeString(String s) {
        if(s.length()==0)
            return "";
        String res="";
        Stack<Integer> c1=new Stack<>();
        Stack<String> s1=new Stack<>();
        
        for(int i=0;i<s.length();)
        {
         if(Character.isDigit(s.charAt(i)))
         { int count=0;
             while(Character.isDigit(s.charAt(i)))
             {
                 count=count*10+s.charAt(i)-'0';
                 i++;
             }
             c1.push(count);
         }
            else if(s.charAt(i)=='[')
            {
               s1.push(res);
                res="";
                i++;
            }
            else if(s.charAt(i)==']')
            {
                StringBuilder temp=new StringBuilder(s1.pop());
                int size=c1.pop();
                for(int j=0;j<size;j++)
                {
                    temp.append(res);
                }
                res=temp.toString();
                i++;
                //s1.push(res);
                
                
                
                
                
            }
            else
            {
            res+=s.charAt(i);
                i++;
            
            
            
            }
        
        
        
        
        
        
        }
        return res;
        
    }
}