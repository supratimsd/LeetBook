class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i-1]==nums[i]) continue;
            for(int j=i+1;j<n;j++){
                if(j!=i+1 && nums[j-1]==nums[j]) continue;
                
                int left=j+1;
                int right=n-1;
                while(left<right){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[left];
                    sum+=nums[right];
                    
                    if(sum==target){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        ans.add(temp);
                        left++;
                        right--;
                       while(left<right && nums[left]==nums[left-1])
                        left++;
                    while(left<right && nums[right]==nums[right+1])
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}