class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        perm(nums,0,a);
        return a;
    }
    public void perm(int nums[],int st,List<List<Integer>> a)
    {
        if(st==nums.length-1)
        {List d=ArryToList(nums);
            if(!a.contains(d))
                a.add(d);
        }
        for(int i=st;i<nums.length;i++)
        {
            swap(nums,st,i);
            perm(nums,st+1,a);
            swap(nums,st,i);
        }
    }
    public void swap(int nums[],int st,int i){
        int temp=nums[i];
        nums[i]=nums[st];
        nums[st]=temp;
    }
    public List<Integer> ArryToList(int nums[])
    {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i:nums)
            res.add(i);
        
        return res;
    }
}