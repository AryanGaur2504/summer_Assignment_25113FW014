#include <iostream>
using namespace std;
//Calculating nth Fibonacci Number
int fib(int n){
    if(n == 0 || n == 1) return n;
    return (fib(n-1) + fib(n-2));
}
int main(){
    int n;
    cin >> n;
    //Validating Input
    if(n < 0){
        cout << "Invalid Input";
        return 0;
    }
    //Printing The Series For i --> [0,n]
    for(int i = 0;i<=n;i++){
        cout << fib(i) << "\t";
    }
    return 0;
}