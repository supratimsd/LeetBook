class Solution {
    public String sortSentence(String s) {
        String[] r=s.split(" ");
        String[] d=new String[r.length];
        for(String e:r){
            int pos=e.charAt(e.length()-1)-'0'-1;
            d[pos]=e.substring(0,e.length()-1);
        }
        return String.join(" ",d);
    }
}