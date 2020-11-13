.........................................................................................................................BFS......................................................................
class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Node head=root;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            
        int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node curr=q.poll();
                if(i==size-1)
                    curr.next=null;
                else
                {
                    curr.next=q.peek();
                }
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            
            
            
            
            
        }
        return root;
        
    }
}
...........................................................................DFS.........................................................................................................
class Solution {
    public Node connect(Node root) {
    if(root==null || root.left==null || root.right==null)
        return root;
        root.left.next=root.right;
        if(root.next!=null)
            root.right.next=root.next.left;
        connect(root.left);
        connect(root.right);
        
        
        
        
        
        
        
      return root;  
        
            
    }
}