class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        for(int i=0;i<nums.length;i++){
            m+=max-nums[i];
        }
        return m;
    }
}