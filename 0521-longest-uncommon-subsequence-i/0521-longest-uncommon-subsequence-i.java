class Solution {
    public int findLUSlength(String a, String b) {
        int n=a.length();
        int m=b.length();
        
        if(a.equals(b)){
            return -1;
        }
        else if(n>m){
            return n;
        }
        else{
            return m;
        }
    }
}