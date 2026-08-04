class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet hs=new HashSet();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!hs.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}