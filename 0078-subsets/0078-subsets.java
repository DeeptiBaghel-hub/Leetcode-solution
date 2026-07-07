class Solution {
    void subsequence(int i,int[] nums,List<Integer> temp,List<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[i]);
        subsequence(i+1,nums,temp,res);
        temp.remove(temp.size()-1);
        subsequence(i+1,nums,temp,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        subsequence(0,nums,temp,res);
        return res;
    }
}