class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];
        int max=-1;
        System.out.println(arr[n-1]);
        for(int i=n-1;i>=0;i--){
            // boolean leader=true;
                ans[i]=max;                     
                if(arr[i]>max){
                    // System.out.println(arr[i]);
                    max=arr[i];
                    
                }
                
            
            
        }
        return ans;
    }
}