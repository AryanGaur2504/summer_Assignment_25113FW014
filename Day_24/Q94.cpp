#include<bits/stdc++.h>
using namespace std;

//Function To Compress String
string compress_string(string str){
    string ans = "";

    for(int i = 0;i < str.length();i++){

        int count = 1;

        //Count Same Characters
        while(i < str.length() - 1 && str[i] == str[i + 1]){
            count++;
            i++;
        }

        ans += str[i];
        ans += to_string(count);
    }

    return ans;
}

int main(){
    string str;
    getline(cin,str);

    //Print Result
    cout << compress_string(str);

    return 0;
}