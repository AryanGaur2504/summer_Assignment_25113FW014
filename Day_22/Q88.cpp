#include <bits/stdc++.h>
using namespace std;

//Remove Spaces
string remove_spaces(string str){
    string ans = "";

    for(int i = 0;i < str.length();i++){
        if(str[i] != ' '){
            ans += str[i];
        }
    }

    return ans;
}

int main(){
    string str;
    getline(cin,str);

    cout << remove_spaces(str);

    return 0;
}
