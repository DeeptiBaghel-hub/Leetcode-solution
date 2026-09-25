class Solution {
    public int strStr(String haystack, String needle) {
        int idx=haystack.indexOf(needle);
        if(idx!=-1){
            return idx;
        }
        else{
            idx=-1;
        }
        return idx;
    }
}