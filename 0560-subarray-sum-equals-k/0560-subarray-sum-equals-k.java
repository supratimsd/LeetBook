class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n=nums.length;
        // int left=0;
        // int right=0;
        // int sum=0;
        // int maxLen=0;
        // while(right<n){
        //     sum+=nums[right];
        //     while(left<=right && sum>k){
        //         sum-=nums[left];
        //         left++;
        //     }
        //     if(sum==k){
        //         maxLen=Math.max(maxLen,right-left+1);
        //     }
        //     right++;
        //     // if(right<n){
        //     //     sum+=nums[right];
        //     // }
        // }
        // return maxLen;
        int n = nums.length; // size of the given array.
        int cnt = 0; // Number of subarrays:

        for (int i = 0 ; i < n; i++) { // starting index i
            int sum = 0;
            for (int j = i; j < n; j++) { // ending index j
                // calculate the sum of subarray [i...j]
                // sum of [i..j-1] + arr[j]
                sum +=nums[j];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    }
}
        
         