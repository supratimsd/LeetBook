class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
	        int flag=0;
	        for(int j=0;j<n;j++){
	            if(i!=j && nums[i]==nums[j]){
	                flag=2;
	                break;
	            }
	        }
	        if (flag==0) {
                return nums[i];
                // break; 
            }
	    }
	    return -1;
    }
}