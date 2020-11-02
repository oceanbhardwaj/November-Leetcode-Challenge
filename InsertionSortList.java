/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null)
            return null;
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
           count++;
            curr=curr.next;
        }
        curr=head;
        int arr[]=new int[count];
        int d=0;
        while(curr!=null)
        {
            arr[d++]=curr.val;
            curr=curr.next;
        }
        for(int i=1;i<count;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        curr=head;
        d=0;
        while(curr!=null)
        {
           curr.val=arr[d++];
            curr=curr.next;
        }
        
       return head; 
    }
}*/


class Solution {
    public ListNode insertionSortList(ListNode head) {
        //mergesort
        if(head==null || head.next==null)
            return head;
        //find middle
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        
        ListNode left=insertionSortList(head);
        ListNode right=insertionSortList(slow);
       return  merge(left,right);
        
        
        
        
        
        
        
        
        
        
        
    }
    private ListNode merge(ListNode left,ListNode right)
    {
        ListNode dummy=new ListNode();
        ListNode d=dummy;
        while(left!=null && right!=null)
        {
            if(left.val<=right.val)
            {  d.next=left;
             left=left.next;}
            else if(right.val<left.val)
            {
                d.next=right;
                right=right.next;
            }
            d=d.next;
        }
            if(left!=null)
            {
                  d.next=left;
             
            }
            if(right!=null)
            {
                d.next=right;
               
            }
            
            return dummy.next;
            
            
            
            
            
        
        
        
        
        
        
    }  
        
}











