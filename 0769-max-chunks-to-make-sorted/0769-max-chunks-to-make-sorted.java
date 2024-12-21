class Solution {
    public int maxChunksToSorted(int[] arr) {
        int u=arr.length;
        int mid=u/2;
        int[] p=new int[mid];
        int[] r=new int[u-mid];
        for(int e=0;e<mid;e++){
            p[e]=arr[e];
        }
        for(int e=mid;e<u;e++){
            r[e-mid]=arr[e];
        }
        Arrays.sort(p);
        Arrays.sort(r);
        
        int sd=0;
        int sm=0;
        
        for(int y=0;y<u;y++){
            sd=Math.max(sd,arr[y]);
            if(sd==y){
                sm++;
            }
        }
        return sm;
    }
}