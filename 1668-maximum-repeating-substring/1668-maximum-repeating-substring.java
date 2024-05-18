class Solution {
    public int maxRepeating(String sequence, String word) {
        int counter=0;
        StringBuilder sb=new StringBuilder(word);
        while(sequence.contains(sb)){
            counter++;
            sb.append(word);
        }
        return counter;
    }
}