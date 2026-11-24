class Solution {
    public int largestRectangleArea(int[] heights) {
        int nse[]=findNextSmaller(heights);
        int pse[]=findPreviousSmaller(heights);
        int max=0;
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,(heights[i]*(nse[i]-pse[i]-1)));
        }
        return max;
    }
    public int[] findNextSmaller(int arr[]){
        Stack<Integer> st=new Stack<>();
        int nse[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        return nse;
    }
    public int[] findPreviousSmaller(int arr[]){
        Stack<Integer> st=new Stack<>();
        int pse[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return pse;
    }
    
}