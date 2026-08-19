class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
       int n=nums.length;
       for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       } 
       for(int e:hm.keySet()){
            if(hm.get(e)>n/2){
                return e;
            }
       }
       return -1;
    }
}