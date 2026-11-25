
class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        // Step 1: Traverse the string
        for (int i = 0; i < num.length(); i++) {

            // Step 2: Remove larger digits
            while (!st.isEmpty() && k > 0 &&
                    st.peek() > num.charAt(i)) {

                st.pop();
                k--;
            }

            st.push(num.charAt(i));
        }

        // Step 3: Remove remaining k digits
        while (k > 0) {
            st.pop();
            k--;
        }

        // Step 4: If stack is empty
        if (st.isEmpty()) {
            return "0";
        }

        // Step 5: Construct result
        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        // Step 6: Remove trailing zeros
        while (res.length() > 0 &&
                res.charAt(res.length() - 1) == '0') {
            res.deleteCharAt(res.length() - 1);
        }

        // Step 7: Reverse
        res.reverse();

        if (res.length() == 0) {
            return "0";
        }

        return res.toString();
    }
}
