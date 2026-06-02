#include <iostream>
using namespace std;
int reverse(int n){
    //Calculating Reverse
    int rev = 0;
    while(n!=0){
        rev = (rev*10) + (n%10);
        n/=10;
    }
    return rev;
}
int main(){
    int n;
    cin >> n;
    //Printing Result
    cout << "The Reverse Of " << n << " Is " << reverse(n);
    return 0;
}