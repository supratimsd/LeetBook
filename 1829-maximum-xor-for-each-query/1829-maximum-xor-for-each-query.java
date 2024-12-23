class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int s=nums.length;
        int[] sd=new int[s];
        
        int sdxor=0;
        int maxXor = (1 << maximumBit) - 1; 
        if(s==1 ){
                sd[0]=nums[0]^maxXor;
                return sd;
        }
        for(int y=0;y<s;y++){
            
            sdxor ^=nums[y];
            sd[y]=sdxor^maxXor;
        }
        
        
        
        int left=0;
        int right=s-1;
        while(left<right){
            int temp=sd[left];
            sd[left]=sd[right];
            sd[right]=temp;
            left++;
            right--;
        }
        
        return sd;
        
        
    }
}