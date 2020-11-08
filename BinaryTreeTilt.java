class Solution {
    int sum=0;
    public int findTilt(TreeNode root) {
        if(root==null)
            return 0;
       sum+=Math.abs(dfs(root.left)-dfs(root.right));
        findTilt(root.left);
        findTilt(root.right);
        
        return sum;
        
        
    }
    public int dfs(TreeNode root)
    {
        if(root==null)
            return 0;
        return root.val+dfs(root.left)+dfs(root.right);
    }
   
        
        
        
        
        
    
}