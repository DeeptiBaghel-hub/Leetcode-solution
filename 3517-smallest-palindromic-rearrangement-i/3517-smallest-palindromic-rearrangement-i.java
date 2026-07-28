class Solution {
    public String smallestPalindrome(String s) {
        int [] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }
        String l="";
        String m="";
        for(int i=0;i<26;i++){
            if(freq[i]%2==1){
                if(!m.equals("")) return "";
                m=(char)('a'+i)+"";
            }
            for(int j=0;j<freq[i]/2;j++){
                l+=(char)('a'+i);
            }
        }
        String r=new StringBuilder(l).reverse().toString();
        return l+m+r;
    }
}  