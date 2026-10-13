class Solution {
	static String preToInfix(String s) {
		// code here
		Stack<String> st = new Stack<>();
		
		for (int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				st.push(String.valueOf(c));
			}
			else {
				String t1 = st.pop();
				String t2 = st.pop();
				
				String res = '(' + t1 + c+t2 + ')';
				st.push(res);
			}
		}
		return st.peek();
	}
}
