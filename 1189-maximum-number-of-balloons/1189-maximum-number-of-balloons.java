class Solution {
    public int maxNumberOfBalloons(String text) {
        int b_count=0;
        int a_count=0;
        int l_count=0;
        int o_count=0;
        int n_count=0;
        for(char ch:text.toCharArray()){
            if(ch=='b'){
                b_count++;
            }
            else if(ch=='a'){
                a_count++;
            }
            else if(ch=='l'){
                l_count++;
            }
            else if(ch=='o'){
                o_count++;
            }
            else if(ch=='n'){
                n_count++;
            }
        }
        int count=Math.min(Math.min(Math.min(Math.min(b_count,a_count),n_count),l_count/2),o_count/2);
        return count;
    }
}