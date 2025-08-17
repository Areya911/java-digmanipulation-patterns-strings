class Solution {
    public int myAtoi(String s) {
        int index = 0, total = 0, sign = 1;

        // Step 1: Handle empty string
        if (s.length() == 0) return 0;

        // Step 2: Skip leading spaces
        while (index < s.length() && s.charAt(index) == ' ') index++;

        // Edge case: only spaces
        if (index == s.length()) return 0;

        // Step 3: Handle sign
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        // Step 4: Convert digits
        while (index < s.length()) {
            int digit = s.charAt(index) - '0';

            // Not a digit → stop parsing
            if (digit < 0 || digit > 9) break;

            // Step 5: Check for overflow
            if (Integer.MAX_VALUE / 10 < total || 
               (Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Step 6: Build number
            total = total * 10 + digit;
            index++;
        }

        return total * sign;
    }
}
