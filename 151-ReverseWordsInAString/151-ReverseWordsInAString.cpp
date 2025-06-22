// Last updated: 6/22/2025, 11:04:43 AM
class Solution {
public:
    string reverseWords(string s) {
        string word, res;
        istringstream stream(s); 

        while (stream >> word) { 
            if (!res.empty()) {
                res = " " + res;
            }
            res = word + res;
        }

        return res; 
    }
};
