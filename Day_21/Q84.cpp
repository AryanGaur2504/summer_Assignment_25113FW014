#include <bits/stdc++.h>
using namespace std;
//Converting The String To Upper Case
void to_upper_case(string &str){
    for(int i = 0;i < str.length();i++){
        char ch = str[i];
        if((int)ch >= 97 && (int)ch <= 122){
            str[i] = ch - 32; //Converting To UpperCase By Using Ascii Values
        }
    }
}
int main(){
    string str;
    cin >> str;
    to_upper_case(str);
    //Printing The Result
    cout << str;
    return 0;
}