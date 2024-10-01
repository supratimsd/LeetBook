class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        int maxFreq=0;
        int result=-1;
        // Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int cnt=0;
            if(nums[i]%2==0){
                for(int j=0;j<n;j++){
                    if(nums[i]==nums[j]){
                        cnt++;
                    }
                }
                if(cnt>maxFreq || cnt==maxFreq && nums[i]<result){
                    maxFreq=cnt;
                    result=nums[i];
                }
                // else{
                //     return -1;
                // }
            }
        }
        return result;
    }
}