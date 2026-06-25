#include<bits/stdc++.h>
using namespace std;

//Function To Find Common Characters
string common_chars(string str1,string str2){
    string ans = "";
    unordered_set<char> st;

    for(int i = 0;i < str1.length();i++){
        st.insert(str1[i]);
    }

    for(int i = 0;i < str2.length();i++){

        //Check Common Character
        if(st.find(str2[i]) != st.end()){
            ans += str2[i];
            st.erase(str2[i]);
        }
    }

    return ans;
}

int main(){
    string str1,str2;

    getline(cin,str1);
    getline(cin,str2);

    //Print Result
    cout << common_chars(str1,str2);

    return 0;
}