#include<bits/stdc++.h>
using namespace std;

//Function To Find First Non-Repeating Character
char first_non_repeating(string str){
    unordered_map<char,int> freq;

    //Count Frequency
    for(int i = 0;i < str.length();i++){
        freq[str[i]]++;
    }

    //Find First Non-Repeating Character
    for(int i = 0;i < str.length();i++){
        if(freq[str[i]] == 1){
            return str[i];
        }
    }

    return '\0';
}

int main(){
    string str;
    getline(cin,str);

    char ans = first_non_repeating(str);

    //Print Result
    if(ans != '\0') cout << ans;
    else cout << "No Non-Repeating Character";

    return 0;
}
