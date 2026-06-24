#include<bits/stdc++.h>
using namespace std;

//Function To Find Longest Word
string longest_word(string str){
    string word = "";
    string ans = "";

    for(int i = 0;i < str.length();i++){

        if(str[i] != ' '){
            word += str[i];
        }
        else{
            //Check Longest Word
            if(word.length() > ans.length()){
                ans = word;
            }

            word = "";
        }
    }

    //Last Word Check
    if(word.length() > ans.length()){
        ans = word;
    }

    return ans;
}

int main(){
    string str;
    getline(cin,str);

    //Print Result
    cout << longest_word(str);

    return 0;
}
