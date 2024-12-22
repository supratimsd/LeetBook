class Solution {
    public boolean canChange(String start, String target) {
        if(start.length()!=target.length()){
            return false;
        }
        String startPieces = start.replace("_", "");
        String targetPieces = target.replace("_", "");
        if (!startPieces.equals(targetPieces)) {
            return false;
        }
        int sd=start.length();
        int e=0,y=0;
        while(e<sd && y<sd){
            while(e<sd && start.charAt(e)=='_') 
                e++;
            while(y<sd && target.charAt(y)=='_')
                y++;
            if(e==sd || y==sd){
                break;
            }
            if(start.charAt(e)!=target.charAt(y)){
                return false;
            }
            if(start.charAt(e)=='L' && e<y){
                return false;
            }
            if(start.charAt(e)=='R' && e>y){
                return false;
            }
            e++;
            y++;
        }
        return true;
    }
}