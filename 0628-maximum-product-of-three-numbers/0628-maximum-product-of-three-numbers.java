class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=nums[0]*nums[1]*nums[n-1];
        int maxp=nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(max,maxp);
    }
}