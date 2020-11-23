class Solution {
    int d1=0;
    int d2=0;
    HashMap<Integer,Integer> h=new HashMap<>();
    public int rob(TreeNode root) {
        if(root==null)
            return 0;
        if(h.containsKey(root.val))
            return h.get(root.val);
       int val=0;
        if(root.left!=null)
            val+=rob(root.left.left)+rob(root.left.right);
        if(root.right!=null)
            val+=rob(root.right.left)+rob(root.right.right);
        int ans= Math.max(val+root.val,rob(root.left)+rob(root.right));  //not rob
        h.put(root.val,ans);
        return ans;
        
    }
}