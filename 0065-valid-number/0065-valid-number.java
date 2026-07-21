class Solution {
    public boolean isNumber(String s) {
        int l=s.length();
        boolean exp=false;
        boolean dec=false;
        boolean num=false;
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(!isValidChar(c)) return false;
            if(Character.isDigit(c)){
                num=true;
                continue;
            }
            if((c=='+' || c=='-')){
                if(i==l-1 || (i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E')){
                    return false;
                }
                continue;
            }
            if(c=='e' || c=='E'){
                if(i==0 || i==l-1 ||!num || exp){
                    return false;
                }
                exp=true;
                continue;
            }
            if(c=='.'){
                if(dec || exp ||l==1||(i==l-1 && i>0 && !Character.isDigit(s.charAt(i-1)))){
                    return false;
                }
                dec=true;
            }
        }
        return true;
    }
    private boolean isValidChar(char c){
        return Character.isDigit(c)||c=='-'||c=='+'||c=='.'||c=='e'||c=='E';
    }
}