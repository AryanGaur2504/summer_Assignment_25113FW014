#include <bits/stdc++.h>
using namespace std;

//Check Palindrome
bool palindrome(string str){
    int start = 0;
    int end = str.length() - 1;

    while(start < end){
        if(str[start] != str[end]) return false;

        start++;
        end--;
    }

    return true;
}

int main(){
    string str;
    cin >> str;

    if(palindrome(str)) cout << "Palindrome";
    else cout << "Not Palindrome";

    return 0;
}
