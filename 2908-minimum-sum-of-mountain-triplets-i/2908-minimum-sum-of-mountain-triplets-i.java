class Solution {
    public int minimumSum(int[] nums) {
        int n=nums.length;
        // int ans=0;
        int result=Integer.MAX_VALUE;;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]<nums[j] && nums[k]<nums[j]){
                        int ans =nums[i]+nums[j]+nums[k];
                    
                    if(ans<result){
                         result=ans;
                    
                    }
                    }
                    
                }
            }
        }
        return (result==Integer.MAX_VALUE) ?-1:result;
    }
}