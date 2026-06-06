#include <bits/stdc++.h>
using namespace std;
//Converting Decimal To Binary
string dec_to_bin(int n){
    if(n == 0) return "0";
    string s = "";
    string rev = "";
    while(n!=0){
        s+= (n%2) + '0';
        n/=2;
    }
    for(int i=s.size()-1;i>=0;i--){
        rev+= s[i];
    }
    return rev;
}
int main(){
     int n;
    cin >> n;
    //Validating Input
    if(n < 0){
        cout << "Invalid Input";
        return 0;
    }
    //Printing Result
    cout << dec_to_bin(n);
    return 0;
}