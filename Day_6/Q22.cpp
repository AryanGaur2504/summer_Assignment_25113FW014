#include <bits/stdc++.h>
using namespace std;
//Checking IF Number Is Binary Or Not
bool is_binary(int n){
    if(n == 0) return true;
    int count = 0,digits = 0;
    while(n!=0){
        if(n%10 == 0 || n%10 == 1) count++;
        digits++;
        n/=10;
    }
    return (count == digits);
}
//Converting Binary To Decimal
int bin_to_dec(int n){
    if(n == 0) return 0;
    int dec = 0,count = 0;
    while(n!=0){
        dec+= (n%10)*pow(2,count);
        count++;
        n/=10;
    }
    return dec;
}
int main(){
    int n;
    cin >> n;
    //Input Validation And Printing Result
    if(is_binary(n)){
        cout << bin_to_dec(n);
        return 0;
    }
    cout << "Invalid Input";
    return 0;
}