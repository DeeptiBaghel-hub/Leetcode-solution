class Solution {
	static String postToInfix(String s) {
		// code here
		Stack<String> st = new Stack<>();
		
		for (int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetterOrDigit(c)){
			    st.push(String.valueOf(c));
			}
			else{
			    String t1=st.pop();
			    String t2=st.pop();
			    
			    String res='('+t2+c+t1+')';
			    st.push(res);
			}
		}
		return st.peek();
	}
}
