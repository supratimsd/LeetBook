import java.util.Arrays;
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n=nums.length;
        int result=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                result^=nums[i];
                i++;
            }
        }
        return result;
    }
}