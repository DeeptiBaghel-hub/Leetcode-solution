class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int sorted[]=arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer,Integer> hm=new HashMap<>();
        int curr=1;
        for(int v:sorted){
            if(!hm.containsKey(v)){
                hm.put(v,curr++);
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}