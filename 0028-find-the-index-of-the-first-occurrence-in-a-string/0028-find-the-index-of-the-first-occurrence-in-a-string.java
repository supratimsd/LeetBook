class Solution {
    public int strStr(String haystack, String needle) {
        int s=haystack.length();
        int u=needle.length();
        if(u==1 && s==1){
            return 0;
        }
        for(int p=0;p<=s-u;p++){
            if(haystack.substring(p,p+u).equals(needle)){
                return p;
            }
        }
        return -1;
    }
}