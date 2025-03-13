import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        int n=strs.length;
        char[] first=strs[0].toCharArray();
        char[] last=strs[n-1].toCharArray();

        for(int s=0;s<first.length;s++){
            if(first[s]!=last[s]){
                break;
            }
            sb.append(first[s]);
        }
        return sb.toString();
    }
}