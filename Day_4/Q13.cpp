#include <iostream>
using namespace std;
//Generating nth Fibonacci Number
int fib(int n){
    if(n <= 1) return(n);
    return fib(n-1) + fib(n-2); 
}
int main(){
    int a,b;
    cin >> a >> b;
    if(a < 0 || b < 0 || a > b){
        cout << "Invalid Input";
        return 0;
    }
    //Looping And Printing Fibonacci Number For All i ∈ [a,b]
    for(int i = a;i<=b;i++){
        cout << fib(i) << "\t";
    }
    return 0;
}