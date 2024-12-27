class Solution {
    public int maximumGain(String s, int x, int y) {
        if(y>x)
        {
           return helper(s,y,x,'b','a');
        }
        else
        {
          return helper(s,x,y,'a','b');
        }
    }

   public int helper(String s,int high,int low,char first,char second)
    {
        StringBuilder sb=new StringBuilder();
        int total=0;

        for(char c:s.toCharArray())
        {
            if(sb.length()>0 && sb.charAt(sb.length()-1)==first && c==second)
            {
                sb.deleteCharAt(sb.length()-1);
                total+=high;
            }
            else {
                sb.append(c);
            }
        }
        StringBuilder result=new StringBuilder();
        for(char c:sb.toString().toCharArray())
        {
            if(result.length()>0 && result.charAt(result.length()-1)==second && c==first)
            {
                result.deleteCharAt(result.length()-1);
                total+=low;
            }
            else {
                result.append(c);
            }
        }

        return total;
    }
}
