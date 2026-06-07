#include <iostream>
using namespace std;
    int rev = 0; // Global Variable To Store Reverse
    //Calculating Reverse Of A Number
    int rev_num(int n){
        if(n >= -9 && n <= 9) return (rev*10 + n);
        rev = (rev*10)+n%10;
        return rev_num(n/10);
    }
int main(){
    int n;
    cin >> n;
    //Printing The Result
    cout << rev_num(n);
    return 0;
}