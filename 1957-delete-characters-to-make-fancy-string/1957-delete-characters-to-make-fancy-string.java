class Solution {
    public String makeFancyString(String s) {
        int cnt=1;
        
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
                
            }else{
                cnt=1;
            }if(cnt<3){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}