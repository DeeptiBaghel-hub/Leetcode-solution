class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        while(max!=0){
            int temp=max;
            max=min%max;
            min=temp;
        }
        return min;
    }
}