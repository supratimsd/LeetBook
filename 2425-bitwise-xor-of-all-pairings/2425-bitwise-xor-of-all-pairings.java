class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int d=nums1.length;
        int u=nums2.length;
        int xornum1=0;
        int xornum2=0;
        int result=0;
        for(int s:nums1){
            xornum1^=s;
        }
        for(int e:nums2){
            xornum2^=e;
        }

        if(d%2 != 0){
            result^=xornum2;
        }
        if(u%2 != 0){
            result^=xornum1;
        }
        return result;
    }
}