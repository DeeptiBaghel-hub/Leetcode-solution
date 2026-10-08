class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int b=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(b>0){
                    sb.append(c);
                }
                b++;
            }
            else{
                b--;
                if(b>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

}