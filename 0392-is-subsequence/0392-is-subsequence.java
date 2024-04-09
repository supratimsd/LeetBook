class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        int n=s.length();
        int m=t.length();
        if(n<1)
            return true;
        for(int i=0;i<m;i++){
            if(s.charAt(j)==t.charAt(i))
                j++;
        
        if(j==n)
            return true;
                
    }
        return false;
    
    }
}

