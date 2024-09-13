class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        long max=Integer.MIN_VALUE;
        
        long sum=0;
        for(int i=0;i<n;i++){
            // int sum=0;
            // for(int j=i;j<n;j++){
                // int sum=0;
                // for(int k=i;k<=j;k++){
                    sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
                    
                // }
            // }
            
        }
        
        return (int)max;
    }
}