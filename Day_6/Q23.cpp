#include <iostream>
using namespace std;
//Calculating No. Of Set Bits 
int set_bits(int n){
    if(n == 0) return 0;
    int sbits = 0;
    while(n != 0){
        if(n%2 == 1) sbits++;
        n/= 2;
    }
    return sbits;
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
    cout << set_bits(n);
    return 0;
}