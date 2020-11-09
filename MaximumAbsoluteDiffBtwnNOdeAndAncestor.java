class Solution {
    int max=Integer.MIN_VALUE;
   int d1=0;
    int d2=0;
    
    public int maxAncestorDiff(TreeNode root) {
       dfs(root);
        return max;
    }
        
        public void dfs(TreeNode root)
        {if(root==null)
           return ;
        
        if(root.left!=null)
             d1=Math.max((Math.abs(dfsmax(root.left)-root.val)),(Math.abs(dfsmin(root.left)-root.val)));
        if(root.right!=null)
             d2=Math.max((Math.abs(dfsmax(root.right)-root.val)),(Math.abs(dfsmin(root.right)-root.val)));
        max=Math.max(Math.max(d1,d2),max);
            
       dfs(root.left);
       dfs(root.right);
        
       
        
        
        
    }
    public int dfsmax(TreeNode root)
    {
        
        return (root==null)?Integer.MIN_VALUE:Math.max(root.val,Math.max(dfsmax(root.left),dfsmax(root.right)));
    }
    public int dfsmin(TreeNode root)
    {
        
        return root==null?Integer.MAX_VALUE: Math.min(root.val,Math.min(dfsmin(root.left),dfsmin(root.right)));
    }
}*/
........................................................................................................o(n).......................................................................................

class Solution {
    int result=Integer.MIN_VALUE;
    
    public int maxAncestorDiff(TreeNode root) {
        dfs(root,root.val,root.val);
        return result;
        
    }
    public void dfs(TreeNode root,int max,int min)
    {
        if(root==null)
            return;
        result=Math.max(result,Math.max(Math.abs(min-root.val),Math.abs(max-root.val)));
        min=Math.min(root.val,min);
        max=Math.max(root.val,max);
        dfs(root.left,max,min);
        dfs(root.right,max,min);
    }
        
        
        
        
        
        
        
    
}


