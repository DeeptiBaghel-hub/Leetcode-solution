class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int l=0;
        int r=x/2;
        while(l<=r){
            int mid=l+(r-l)/2;
            long s=(long) mid*mid;
            if(s==x){
                return mid;
            }
            else if(s<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return r;
        
    }
}