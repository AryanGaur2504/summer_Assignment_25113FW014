#include <bits/stdc++.h>
using namespace std;
//Calculating The Length Of The String
int string_length(string str){
    int length = 0;
    while(str[length++] != '\0'){}
    return length-1;
}
int main(){
    string str;
    cin >> str;
    //Printing The Result
    cout << string_length(str);
    return 0;
}