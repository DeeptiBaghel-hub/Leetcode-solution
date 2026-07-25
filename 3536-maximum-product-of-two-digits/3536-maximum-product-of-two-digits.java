class Solution {
    public int maxProduct(int n) {
        int m1=-1,m2=-1;
        while(n!=0){
            int r=n%10;
            if(m1<=r){
                m2=m1;
                m1=r;
            }
            else if(m2<r){
                m2=r;
            }
            n/=10;
        }
        return m1*m2;
    }
}