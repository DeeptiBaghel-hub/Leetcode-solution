class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median=nums[nums.length/2];
        int m=0;
        for(int i=0;i<nums.length;i++){
            m+=Math.abs(nums[i]-median);
        }
        return m;
    }
}