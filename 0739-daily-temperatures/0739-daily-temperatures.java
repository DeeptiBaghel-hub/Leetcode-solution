class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int arr[]=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int pinndex=st.pop();
                arr[pinndex]=i-pinndex;

            }
            st.push(i);
        }
        return arr;

    }
}