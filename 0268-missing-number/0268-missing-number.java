import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int e=nums.length;
        int sdsum=0;
        int sdtot=e*(e+1)/2;
        for(int u=0;u<e;u++){
             sdsum +=nums[u];
        }
        return sdtot-sdsum;

        
    }
}
