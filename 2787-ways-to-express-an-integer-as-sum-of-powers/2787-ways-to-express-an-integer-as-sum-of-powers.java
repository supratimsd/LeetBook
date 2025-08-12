class Solution {
    ArrayList<Integer> list;
    static final int MOD = 1_000_000_007;
    Integer[][] memo;
    /*1^1, 1^2, 2^2, 3^2
       1    2    4  , 9   */
    public int numberOfWays(int n, int x) {
        int temp = 1;
        list = new ArrayList<>();

        while(Math.pow(temp,x) <= n){
            list.add((int) Math.pow(temp,x));
            temp++;
        }
        memo = new Integer[list.size()+1][n+1];

        return  dfs(0,n);
    }

    public int dfs(int index,int target){
         if(target == 0){
            return 1;
        }
          if(target <0 )
            return 0;
        if(index >= list.size())
            return 0;
       // System.out.println("index"+index+ " target"+target);
        if(memo[index][target] != null)
            return memo[index][target];
        int pick = dfs(index+1, target - list.get(index));
        int notpick = dfs(index+1, target);

        int ans = (pick + notpick) % MOD;
        return memo[index][target] = ans;
    }
}