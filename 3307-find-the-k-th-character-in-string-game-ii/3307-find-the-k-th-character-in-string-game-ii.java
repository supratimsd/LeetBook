class Solution {
    public char kthCharacter(long k, int[] operations) {
        long shifts = 0;
        while (k != 1) {
            int i = 63 - Long.numberOfLeadingZeros(k);
            if ((1L << i) == k) i--;
            k -= (1L << i);
            if (operations[i] == 1) shifts++;
        }
        return (char)((shifts % 26) + 97);
    }
}