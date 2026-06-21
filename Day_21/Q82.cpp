#include <bits/stdc++.h>
using namespace std;
//Reversing The String
void reverse_string(string &str){
    int length = str.length();
    for(int i = 0;i < length/2;i++){
        swap(str[i],str[length-i-1]);
    }
}
int main(){
    string str;
    cin >> str;
    reverse_string(str);
    //Printing The Result
    cout << str;
    return 0;
}