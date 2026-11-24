class Solution {
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMax(nums) - sumSubarrayMin(nums);
    }
    public long sumSubarrayMax(int arr[]){
        int n=arr.length;
        int l[]=new int [n];
        int r[]=new int [n];
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            l[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            r[i]=st.isEmpty()?n-i:st.peek()-i;
            st.push(i);
        }
        long tsum=0;
        for(int i=0;i<n;i++){
            long contri=(long) arr[i]*l[i]*r[i];
            tsum+=contri;
        }
        return tsum;
    }
    public long sumSubarrayMin(int arr[]){
        int n=arr.length;
        int l[]=new int [n];
        int r[]=new int [n];
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            l[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            r[i]=st.isEmpty()?n-i:st.peek()-i;
            st.push(i);
        }
        long tsum=0;
        for(int i=0;i<n;i++){
            long contri=(long) arr[i]*l[i]*r[i];
            tsum+=contri;
        }
        return tsum;
    }
}