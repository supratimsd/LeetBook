class Solution {
    public int[] buildArray(int[] nums) {
        int s=nums.length;
        int[] ans=new int[s];
        for(int u=0;u<s;u++){
            ans[u]=nums[nums[u]];
        }
        return ans;
    }
    
}