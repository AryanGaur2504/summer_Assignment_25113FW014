#include<bits/stdc++.h>
using namespace std;

//Function To Check Anagram
bool check_anagram(string str1,string str2){

    //Length Check
    if(str1.length() != str2.length()) return false;

    sort(str1.begin(),str1.end());
    sort(str2.begin(),str2.end());

    //Compare Both Strings
    return str1 == str2;
}

int main(){
    string str1,str2;

    getline(cin,str1);
    getline(cin,str2);

    //Print Result
    if(check_anagram(str1,str2)) cout << "Anagram Strings";
    else cout << "Not Anagram Strings";

    return 0;
}
