class Solution {
    public char kthCharacter(int k) {
        // Alice starts with her trusty letter "a"
        StringBuilder s = new StringBuilder("a");

        // Bob keeps asking for more until the string is long enough
        while (s.length() < k) {
            int n = s.length();
            // Alice creates a new string by shifting each letter
            for (int i = 0; i < n; i++) {
                char next = (char)('a' + ((s.charAt(i) - 'a' + 1) % 26));
                s.append(next); // She appends the next letter to the end
            }
        }
        // Bob finally gets his answer!
        return s.charAt(k - 1);
    }
}