class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        int max=nums[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            pre[i]=gcd(max,nums[i]);
        }
        Arrays.sort(pre);
        long sum=0;
        int li=0;
        int ri=n-1;
        while(li<ri){
            sum+=gcd(pre[li],pre[ri]);
            li++;
            ri--;
        }
        return sum;
    }
    public static int gcd(int x,int y){
        while(y!=0){
            int c=y;
            y=x%y;
            x=c;
        }
            return x;
    }
}