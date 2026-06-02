#include <iostream>
using namespace std;
//Calculating Sum Of Digits
int sum_digits(int n){
    int sum=0;
    if(n < 0) n = -n;//Handling Negative Numbers
    while(n > 0){
        sum+=n%10;
        n/=10;
    }
    return sum;
}
int main(){
    int n;
    cin >> n;
    //Printing Result
    cout << "The Sum Of Digits Of "<< n << " Is " <<sum_digits(n);
    return 0;
}