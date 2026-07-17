class Solution {
    public boolean isPalindrome(int x) {
        String n=Integer.toString(x);
        int m=x;
        String s=new StringBuilder(Integer.toString(m)).reverse().toString();
        return n.equals(s);
    }
}