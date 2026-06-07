#include <iostream>
using namespace std;
//Calculating Factorial
int fact(int n){
    if(n == 0 || n == 1) return 1;
    return(n*fact(n-1));
}
    int main(){
        int n;
        cin >> n;
        //Validating Input
        if(n < 0 ) {
            cout << "Invalid Input";
            return 0;
        }
        //Printing Result
        cout << fact(n);
        return 0;
    }