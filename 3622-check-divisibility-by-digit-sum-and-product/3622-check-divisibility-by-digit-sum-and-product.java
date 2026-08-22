class Solution {
    public boolean checkDivisibility(int n) {
        int m=n;
        int sum=0;
        int pro=1;
        while(n!=0){
            int d=n%10;
            sum+=d;
            pro*=d;
            n=n/10;
        }
        return m%(sum+pro)==0 ;
    }
}