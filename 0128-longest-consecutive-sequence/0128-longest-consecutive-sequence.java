class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int cnt=1;
        int ans=1;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        
        
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i-1]+1==nums[i]){
                cnt++;
            }else{
                ans=Math.max(cnt,ans);
                cnt=1;
            }
            
        }
        ans=Math.max(cnt,ans);
        return ans;
    }
}