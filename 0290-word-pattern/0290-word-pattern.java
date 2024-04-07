class Solution {
    public boolean wordPattern(String pattern, String s) {
       HashMap<Character,String> map=new HashMap<Character,String>(); //for mapping
        HashSet<String>set=new HashSet<String>();  //for creating a set
        String[] arr=s.split(" ");
        int n=arr.length;
        if(n!=pattern.length()){
            return false;
        }
        else{
            for(int i=0;i<n;i++){
                String word=arr[i];
                char ch=pattern.charAt(i);
                if(map.containsKey(ch)){
                    if(!map.get(ch).equals(word)){
                       return false; 
                    }
                }
               else{
                   if(set.contains(word)){
                       return false;
                   }
                   else{
                       map.put(ch,word);
                       set.add(word);
                   }
               } 
            }
            return true;
        }
    }
}