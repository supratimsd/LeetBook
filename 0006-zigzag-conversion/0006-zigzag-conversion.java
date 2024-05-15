class Solution {
    public String convert(String s, int numRows) {
        String res="";
        String[] ans=new String[numRows];
        for(int i=0;i<numRows;i++){
            ans[i]="";
            
        }
        int i=0;
        int counter;
        while(i<s.length()){
            for(counter=0;counter<numRows && i<s.length();counter++){
                ans[counter]+=s.charAt(i++);
                
            }
            for(counter=numRows-2;counter>0 && i<s.length();counter--){
                ans[counter]+=s.charAt(i++);
                
            }
        }
            for(String str : ans){
                res+=str;
            }
                 return res;

        
    }
}