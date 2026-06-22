#include <bits/stdc++.h>
using namespace std;

//Character Frequency
void character_freq(string str){
    unordered_map<char,int> mp;

    for(int i = 0;i < str.length();i++){
        mp[str[i]]++;
    }

    for(auto it : mp){
        cout << it.first << " -> " << it.second << endl;
    }
}

int main(){
    string str;
    getline(cin,str);

    character_freq(str);

    return 0;
}
