class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0,max_length=0;
        List<Character>list =new ArrayList<>();
        int n=s.length();
        while(end<n){
            char currentChar = s.charAt(end);
            if(!list.contains(currentChar)){
                list.add((Character)currentChar);
                end++;
                max_length=Math.max(max_length,list.size());
            }
            else{
                while(list.contains(currentChar)){
                    list.remove((Character)s.charAt(start));
                    start++;
                }
            }
        }
        return max_length;
    }
}



