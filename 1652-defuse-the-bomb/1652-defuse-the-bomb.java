class Solution {
    public int[] decrypt(int[] code, int k) {
        int s=code.length;
        int[] sd=new int[s];
        for(int e=0;e<s;e++){
            int sm=0;
            if(k>0){
                for(int u=1;u<=k;u++){
                    sm += code[(e+u)%s];
                }
            }else{
                for(int u=1;u<=-k;u++){
                    sm+=code[(e-u+s)%s];
                }
            }
            sd[e]=sm;
        }
        return sd;
    }
}