class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        recsubset(0,nums,ds,ans);
        return ans;
    }
    public void recsubset(int i,int[] nums,List<Integer> ds,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int j=i;j<nums.length;j++){
            if(j!=i && nums[j]==nums[j-1]) continue;
            ds.add(nums[j]);
            recsubset(j+1,nums,ds,ans);
           ds.remove(ds.size() -1);
        }
    }
}