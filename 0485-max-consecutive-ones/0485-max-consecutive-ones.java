class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                cnt1++;
            }
            else{
                if(cnt2<cnt1){
                    cnt2=cnt1;
                    
                }
                cnt1=0;
            }
            
            
        }
        if(cnt2<cnt1){
                    cnt2=cnt1;
                    
                }
        return cnt2;
    }
}