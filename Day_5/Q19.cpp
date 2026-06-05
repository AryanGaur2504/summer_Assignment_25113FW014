#include <iostream>
using namespace std;
//Printing The Factors Of The Number
void print_factors(int n){
    for(int i = 1;i*i <= n;i++){
        if(n % i == 0) {
            cout << i << "\t";
            if(i != (n/i)) cout << (n/i) << "\t";
        }
    }
}
int main(){
    int n;
    cin >> n;
    //Validating Input
    if(n <= 0) cout << "Invalid Input";
    else print_factors(n);
    return 0;
}