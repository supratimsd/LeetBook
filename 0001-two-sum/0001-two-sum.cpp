class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        for(int num1=0;num1<nums.size();num1++){
            for(int num2=num1+1;num2<nums.size();num2++){
                if(nums[num1]+nums[num2]==target){
                    return {num1,num2};
                }
            }
        }
        return {};
    }
};