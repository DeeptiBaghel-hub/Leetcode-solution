class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int l=0;
        int ans=n+1;
        int win=0;
        for(int r=0;r<n;r++){
            win+=nums[r];
            while(win>=target){
                ans=Math.min(ans,r-l+1);
                win-=nums[l];
                l++;
            }
        }
        if(ans==n+1){
            return 0;
        }
        else{
            return ans;
        }
    }
}