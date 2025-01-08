class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private boolean isPrefixAndSuffix(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        
        if (n > m) {
            return false;
        }
        
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != str2.charAt(m - n + i)) {
                return false;
            }
        }
        
        return true;
    }
}
