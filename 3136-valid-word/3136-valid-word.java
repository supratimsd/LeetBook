class Solution {
    public boolean isValid(String word) {
        word=word.toLowerCase();
        int n=word.length();
        String vowelMap="aeiou";
        String consonantMap="bcdfghjklmnpqrstvwxyz";
        int vowel=0,consonant=0,digitCount=0;
        if(n>=3){
            
        for(char ch : word.toCharArray()){
            if(Character.isDigit(ch)){
                digitCount++;
            }
            else if(vowelMap.contains(String.valueOf(ch))){
                vowel++;
            }
            else if(consonantMap.contains(String.valueOf(ch))){
                consonant++;
            }
            else{
                return false;
            }
        }
            
            
        }
        return vowel>=1 && consonant>=1;
                
    }
}