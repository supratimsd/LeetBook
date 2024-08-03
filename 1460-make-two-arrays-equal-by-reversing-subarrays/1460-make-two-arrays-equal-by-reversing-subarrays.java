class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        if(target.length==arr.length){
            return Arrays.equals(target,arr);
        }
        else{
            return false;
        }
    }
}