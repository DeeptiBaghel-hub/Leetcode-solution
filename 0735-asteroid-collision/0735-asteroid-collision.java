import java.util.*;

class Solution{
    public int[] asteroidCollision(int[] asteroids){
        Stack<Integer> st=new Stack<>();
        for(int v:asteroids){
            boolean c=true;
            while(!st.isEmpty()&&v<0&&st.peek()>0){
                if(Math.abs(st.peek())<Math.abs(v)){
                    st.pop();
                    continue;
                }
                else if(Math.abs(st.peek())==Math.abs(v)){
                    st.pop();
                }
                c=false;
                break;
            }
            if(c){
                st.push(v);
            }
        }
        int[] res=new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}