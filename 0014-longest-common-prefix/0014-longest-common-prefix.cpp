class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int n=strs.size();
        if(n==0)
            return "";
        string ans="";
        sort(begin(strs),end(strs));
        string f=strs[0];
        string l=strs[n-1];
        for(int i=0;i<f.size();i++){
            if(f[i]==l[i]){
                ans+=f[i];
            }
            else{
                break;
            }
        }
        return ans;
    }
};
