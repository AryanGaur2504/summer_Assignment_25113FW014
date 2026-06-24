#include<bits/stdc++.h>
using namespace std;

//Function To Check String Rotation
bool check_rotation(string str1,string str2){

    //Length Check
    if(str1.length() != str2.length()) return false;

    string temp = str1 + str1;

    //Check Rotation
    return temp.find(str2) != string::npos;
}

int main(){
    string str1,str2;

    getline(cin,str1);
    getline(cin,str2);

    //Print Result
    if(check_rotation(str1,str2)) cout << "Rotation String";
    else cout << "Not Rotation String";

    return 0;
}
