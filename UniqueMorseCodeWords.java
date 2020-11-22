class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String s[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> h=new HashSet<>();
        for(String w:words)
        {   String g="";
            for(int i=0;i<w.length();i++)
            {
                g=g+s[(int)w.charAt(i)-97];
            }
         h.add(g);
        }
        return h.size();
        
    }
}