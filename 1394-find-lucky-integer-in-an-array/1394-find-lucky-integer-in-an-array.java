class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        int majority=1;
        int count1=1;
        int count2=-1;
        int res=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if( i<n-1 && arr[i]==arr[i+1]){
                count1++;
            }else{
                
            if(count1==arr[i]){
            // System.out.println(" "+count);
            count2= arr[i];
            
            }
            count1=1;
        
        
        
    }
        }
    return count2;
    }
}