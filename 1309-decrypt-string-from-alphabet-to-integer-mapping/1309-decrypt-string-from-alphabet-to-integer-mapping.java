class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sd=new StringBuilder();
        int e=s.length();
        for(int u=0;u<e;u++){
            if(u+2<e && s.charAt(u+2)=='#'){
                int sm=(s.charAt(u)-'0')*10+(s.charAt(u+1)-'0');
                sd.append((char)('a'+sm-1));
                u+=2;
            }else{
                sd.append((char)('a'+(s.charAt(u)-'0')-1));
                
            }
        }
        return sd.toString();
    }
}