```java
import java.util.Stack;

class Solution {
    static String postToPre(String s) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                st.push(String.valueOf(c));
            } else {
                String b = st.pop();
                String a = st.pop();

                st.push(c + a + b);
            }
        }

        return st.pop();
    }
}
```
