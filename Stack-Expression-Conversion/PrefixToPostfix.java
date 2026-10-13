```java
import java.util.Stack;

class Solution {
    static String preToPost(String s) {
        Stack<String> st = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                st.push(String.valueOf(c));
            } else {
                String a = st.pop();
                String b = st.pop();

                st.push(a + b + c);
            }
        }

        return st.pop();
    }
}
```
