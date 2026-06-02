#include <iostream>
using namespace std;
//Calculating Product Of Digits
int prod_digits(int n){
    if(n == 0) return 0; //Handling Zero
    int pro = 1;
    while(n!=0){
        pro*=(n%10);
        n/=10;
    }
    return pro;
}
int main(){
    int n;
    cin >> n;
    //Printing Result
    cout << "The Product Of Digits Of " << n << " Is " << prod_digits(n);
    return 0;
}