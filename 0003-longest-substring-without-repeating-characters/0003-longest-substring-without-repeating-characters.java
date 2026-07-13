class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[]=new int[128];
        int n=s.length();
        Arrays.fill(hash,-1);
        int l=0,maxlen=0;
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            if(hash[ch]!=-1){
                if(hash[ch]>=l){
                    l=hash[ch]+1;
                }
            }
            maxlen=Math.max(maxlen,r-l+1);
            hash[ch]=r;
        }
        return maxlen;
    }
}