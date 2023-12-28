class Solution {
public:
    vector<vector<int>>ans;
    void permutationSolve(int i, vector<int>&nums){
        int n=nums.size();
        if(i>=(n-1)){
            ans.push_back(nums);
            return;
        }
        for(int k=i;k<n;k++){
            swap(nums[i],nums[k]);
            permutationSolve(i+1,nums);
            swap(nums[i],nums[k]);
        }
    }
    vector<vector<int>> permute(vector<int>& nums) {
        permutationSolve(0,nums);
        return ans;
    }
};