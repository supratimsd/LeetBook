class Solution {
    public boolean isCircularSentence(String sentence) {
        int u=sentence.length();
        if(sentence.charAt(0)!=sentence.charAt(u-1)){
            return false;
        }
        for(int e=1;e<u;e++){
            if(sentence.charAt(e)==' '){
                if(sentence.charAt(e-1)!=sentence.charAt(e+1)){
                    return false;
                }
            }
        }
        return true;
    }
}