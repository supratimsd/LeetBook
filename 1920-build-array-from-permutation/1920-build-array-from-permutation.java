class Solution {
    public int[] buildArray(int[] nums) {
        int s=nums.length;
        int[] sanju=new int[s];
        for(int u=0;u<s;u++){
            sanju[u]=nums[nums[u]];
        }
        return sanju;
    }
    
}