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
//         int e=nums.length;
//         Arrays.sort(nums);
//         // int p=0;
//         if(e==1 && nums[e-1]==0){
//             return 1;
//         }
//         if(e==1 && nums[e-1]==1){
//             return 0;
//         }
        
//         for(int s=0;s<e-1;s++){
//             if((nums[s]+1)!=nums[s+1]){
//                  return nums[s]+1;
                
//             }
//         }
//         return e;
        
    }
}