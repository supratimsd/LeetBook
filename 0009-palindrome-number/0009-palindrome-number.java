class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        int ans=0;
        // int res=0;
        
        boolean isPalin=false;
        if(x<0){
            return false;
        }
        while(x!=0){
            int rem=x%10;
            ans=(ans*10)+rem;
            x/=10;
        }
        if(ans==org){
            isPalin=true;
        }
        return isPalin;
    }
}