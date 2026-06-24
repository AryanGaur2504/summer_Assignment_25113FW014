#include<bits/stdc++.h>
using namespace std;

//Function To Remove Duplicate Characters
string remove_duplicate_char(string str){
    string ans = "";
    unordered_set<char> st;

    for(int i = 0;i < str.length();i++){

        //Check Duplicate Character
        if(st.find(str[i]) == st.end()){
            ans += str[i];
            st.insert(str[i]);
        }
    }

    return ans;
}

int main(){
    string str;
    getline(cin,str);

    //Print Result
    cout << remove_duplicate_char(str);

    return 0;
}
