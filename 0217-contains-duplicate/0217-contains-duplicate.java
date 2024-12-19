import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int u=nums.length;
        int sd=1;
        boolean isDuplicate=false;
        for(int m=0;m<u-1;m++){
            if(nums[m]==nums[m+1]){
                sd++;
            }
        }
        if(sd>=2){
            isDuplicate=true;
        }
        return isDuplicate;
    }
}