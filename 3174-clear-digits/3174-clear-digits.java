class Solution {
    public String clearDigits(String s) {
        String ans="";
        //StringBuilder sb=new StringBuilder();
        for(int j=0;j<s.length();j++){
            if(Character.isDigit(s.charAt(j))){
                ans=ans.substring(0,ans.length()-1);
            }
            else{
                ans+=s.charAt(j);
            }
                
        
        
               
    
    }
        return ans;
    }
}


