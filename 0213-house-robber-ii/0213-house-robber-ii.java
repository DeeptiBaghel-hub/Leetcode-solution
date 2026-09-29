class Solution {
    int f(int[] nums,int st,int end){
        int prev=0;
        int prev2=0;
        for(int i=st;i<=end;i++){
            int take=nums[i];
            if(i>1) take+=prev2;
            int nottake=prev;
            int curr=Math.max(take,nottake);
            prev2=prev;
            prev=curr;
        }
        return prev;

    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(f(nums,0,n-2),f(nums,1,n-1));
    }
}