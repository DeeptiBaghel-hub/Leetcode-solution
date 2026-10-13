class Solution {
	public static String infixToPostfix(String s) {
		// code here
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = s.length();
		for (int i = 0; i<n; i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
				sb.append(c);
			}
			else if (c == '(') {
				st.push(c);
			}
			else if (c == ')') {
				while (!st.isEmpty() && st.peek() != '(') {
					sb.append(st.pop());
				}
				if (!st.isEmpty()) {
					st.pop();
				}
				
			}
			else {
				
				while (!st.isEmpty() && st.peek() != '(' &&
				(priority(c) < priority(st.peek()) ||
				(priority(c) == priority(st.peek()) && c != '^'))) {
					sb.append(st.pop());
				}
				st.push(c);
				
			}
		}
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.toString();
	}
	static int priority(char ch) {
		if (ch == '^')
			return 3;
		if (ch == '*' || ch == '/')
			return 2;
		if (ch == '+' || ch == '-')
			return 1;
		return 0;
	}
}
