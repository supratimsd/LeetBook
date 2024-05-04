class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder str=new StringBuilder(s.replaceAll("-","").toUpperCase());
        StringBuilder str1=new StringBuilder();
        str.reverse();
        int n=str.length();
        for(int i=0;i<n;i=i+k){
            if(i+k<=n){
                str1.append(str.substring(i,i+k));
                
            }
            else{
                str1.append(str.substring(i));
            }
            if(i+k<n){
                str1.append("-");
            }
        }
        return str1.reverse().toString();
    }
}