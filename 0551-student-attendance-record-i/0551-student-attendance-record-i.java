class Solution {
    public boolean checkRecord(String s) {
        int absent=0,late=0,present=0;
        // int n=s.length();
        for(char ch : s.toCharArray()){
            if(ch=='A'){
                absent++;
                if(absent>=2)
                    return false;
            }
            if(ch=='L'){
                late++;
                if(late>=3)
                    return false;
            }
            else{
                late=0;
            }
        }
        return true;
    }
}