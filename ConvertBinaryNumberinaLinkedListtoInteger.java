class Solution {
    public int getDecimalValue(ListNode head) {
        String s="";
        if(head==null)
            return 0;
        while(head!=null)
        {
            s=s+head.val+"";
            head=head.next;
        }
        int base=1;
        int sum=0;
        for(int i=s.length()-1;i>=0;i--)
        {
           sum=sum+base*Integer.parseInt(s.charAt(i)+"");
            base=base*2;
        }
        return sum;
    }
}