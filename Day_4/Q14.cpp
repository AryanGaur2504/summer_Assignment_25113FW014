#include <iostream>
using namespace std;
//Generating nth Fibonacci Number
int fib(int n){
    if(n <= 1) return(n);
    return fib(n-1) + fib(n-2); 
}
int main(){
    int n;
    cin >> n;
    if(n < 0){
        cout << "Invalid Input";
        return 0;
    }
    //Printing The Result
    cout << fib(n);
    return 0;
}