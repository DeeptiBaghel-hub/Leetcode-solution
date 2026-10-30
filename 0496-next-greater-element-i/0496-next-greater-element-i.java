class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums2){
            while(!st.isEmpty() && num>st.peek()){
                int smaller=st.pop();
                map.put(smaller,num);
            }
            st.push(num);
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=map.get(nums1[i]);
        }
        return arr;
    }
}