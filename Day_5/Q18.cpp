#include <iostream>
using namespace std;
//Calculating Factorial Of Each Digit
int fact(int n){
    if(n <= 1) return 1; //-ve Values Are Handeled Through Main
    int fact = 1;
    for(int i=1;i<=n;i++){
        fact *= i;
    }
    return fact;
}
//Summation Of Factorial Of Digits
int fact_sum(int n){
    int sum = 0;
    while(n > 0){
        sum+=fact(n%10);
        n/=10;
    }
    return sum;
}   
    //Checking For Strong Number --> Sum Of Factorial Of Each Digit = Number
    bool is_strong(int n){
        if(n == 0) return false;
        return (n == fact_sum(n));
    }
int main(){
    int n;
    cin >> n;
    //Validating Input
    if(n < 0) {
        cout << "Invalid Input";
        return 0;
    }
    //Printing Result
    if(is_strong(n)) cout << n << " Is A Strong Number";
    else cout << n << " Is Not A Strong Number";
    return 0;
}