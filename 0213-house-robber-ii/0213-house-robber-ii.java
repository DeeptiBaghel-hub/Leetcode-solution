class Solution {
    long f(int[] nums){
        int n=nums.length;
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1){
                take+=prev2;
            }
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
        int [] temp1=new int[n-1];
        int [] temp2=new int[n-1];
        for(int i=0;i<n-1;i++){
            temp1[i]=nums[i];
            temp2[i]=nums[i+1];
        }
        return (int)Math.max(f(temp1),f(temp2));
    }
}