class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int mod=(int) (1e9+7);
        Deque<Integer> st=new ArrayDeque<>();
        int left[]=new int[n];
        int right[]=new int[n];
        //next smaller
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            left[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        st.clear();
        //previous smaller
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            right[i]=st.isEmpty()?n-i:st.peek()-i;
            st.push(i);
        }

        //total sum
        long tsum=0;
        for(int i=0;i<n;i++){
            long contri=(long)left[i]*right[i]*arr[i];
            tsum=(tsum+contri)%mod;
        }
        return (int)tsum;

    }
}