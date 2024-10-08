public class Solution {
public String shortestPalindrome(String s) {
    int n = s.length();
    if(n<=1){
        return s;
    }
    int idx = 0;
    for(int center = n/2; center>=0; center--){
        if(valid(s, center, 1)){   //is the longest valid palindrome? (assume length is even)
            idx = 2*center+1;
            break;
        }
        if(valid(s, center, 0)){  //assume length is odd
            idx = 2*center;
            break;
        }
        
    }
    String suffix = s.substring(idx+1);
    StringBuilder b = new StringBuilder(suffix);
    return b.reverse().toString()+s;
}
boolean valid(String s, int center, int shift){
    int i = center, j = center+shift;
    while(i>=0 && j<s.length()){
        if(s.charAt(i)!=s.charAt(j)){
            break;
        }
        i--;
        j++;
    }
    return i<0;
}
}