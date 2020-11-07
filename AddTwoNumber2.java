class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=Reverse(l1);
        ListNode head2=Reverse(l2);
        int carry=0;
        int sum=0;
       ListNode n=new ListNode(0);
        ListNode n1=n;
        while(head1!=null || head2!=null)
        {
           int a=(head1!=null)?head1.val:0;
           
             int b=(head2!=null)?head2.val:0;
            
            
            sum=a+b+carry;
            
            carry=sum/10;
            sum=sum%10;
            
            
            
            n1.next=new ListNode(sum);
            if(head1!=null)
            head1=head1.next;
            if(head2!=null)
            head2=head2.next;
            n1=n1.next;
            
        }
        if(carry>0)
        {
            n1.next=new ListNode(carry);
            n1=n1.next;
        }
        return Reverse(n.next) ;
        
        
        
        
        
    }
    public ListNode Reverse(ListNode curr)
    {  ListNode prev=null;
    ListNode head=null;
     ListNode next=null;
     while(curr!=null)
     {
         next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;
         
         
         
     }
     head=prev;
     return head;
        
    }
}