class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int majority=n/3;
        int cnt=1;
        int i;
        if(n==1){
            ans.add(nums[0]);
            return ans;
        }
        if(n==2){
            if(nums[0]==nums[1]){
                ans.add(nums[0]);
            }else{
                ans.add(nums[0]);
                ans.add(nums[1]);
            }
            return ans;
        }
        for(i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                cnt++;
            }else{
                cnt=1;
            }
            if(cnt>majority && (ans.isEmpty() || ans.get(ans.size()-1) != nums[i])){
            ans.add(nums[i]);
        }
        }
        
        return ans;
        
    }
}