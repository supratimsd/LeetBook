class Solution {
    public long countGood(int[] nums, int k) {
        long count=0;
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int start=0;
        int paircount=0;
        for(int i=0;i<n;i++){
            k-=hm.getOrDefault(nums[i],0);
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            while(k<=0){
                hm.put(nums[start],hm.get(nums[start])-1);
                k+=hm.get(nums[start++]);
            }
            count+=start;
        }
        return count;
    }
}