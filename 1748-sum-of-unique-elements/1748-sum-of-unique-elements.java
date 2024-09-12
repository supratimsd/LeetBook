class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        int majority=1;
        int count=1;
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i<n-1 && nums[i]==nums[i+1]){
                count++;
            }else{
                
            if(count==majority){
            // System.out.println("Try programiz.pro"+count);
            res+=nums[i];
            
            }
            count=1;
        }
        
        
    }
    return res;
    }
}