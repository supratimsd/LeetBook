class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char,int>m;
        m['I'] = 1;
        m['V'] = 5;
        m['X'] = 10;
        m['L'] = 50;
        m['C'] = 100;
        m['D'] = 500;
        m['M'] = 1000;
    
    int ans=0;
    for(int i = 0; i < s.size(); i++){
        if(m[s[i]]<m[s[i+1]]){
            ans -= m[s[i]];
        }
        else{
            ans += m[s[i]];
        }
    }
    return ans;
}
};

// class Solution {
// public:
//     int romanToInt(string s) {
//         int ans=0;
//         unordered_map <char,int> mp{
//         {'I',1},{'V',5},{'X',10},{'L',50},{'C',100},{'D',500},{'M',1000}};

//     for(int i=0;i<s.size();i++){
//         if(mp[s[i]]<mp[s[i+1]]){
//             //for cases such as IV,CM, XL, etc...
//             ans=ans-mp[s[i]];
//         }
//         else{
//             ans=ans+mp[s[i]];
//         }
//     }
//         return ans;
//     }
// };
