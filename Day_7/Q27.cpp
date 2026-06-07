#include <iostream>
using namespace std;
//Calculating Sum Of Digits Of The Number
int sum_of_digits(int n){
    if(n < 0) n = -n;
    if(n <= 9) return n;
    return ((n%10)+sum_of_digits(n/10));
}
int main(){
    int n;
    cin >> n;
    //Printing The Result
    cout << sum_of_digits(n);
    return 0;
}