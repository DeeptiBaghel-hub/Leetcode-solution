class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 1;

        for (int i = 0; i < n; i++) {
            long pro = 1;
            long gcd = 0;
            long lcm = 1;

            for (int j = i; j < n; j++) {
                pro *= nums[j];

                gcd = arrayGcd(gcd, nums[j]);
                lcm = arrayLcm(lcm, nums[j]);

                if (pro == gcd * lcm) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    public long arrayGcd(long a, long b) {
        if (b == 0) return a;
        return arrayGcd(b, a % b);
    }

    public long arrayLcm(long a, long b) {
        return (a / arrayGcd(a, b)) * b;
    }
}