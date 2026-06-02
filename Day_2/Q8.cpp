#include <iostream>
using namespace std;
//Calculating Reverse
int reverse(int n){
    int rev = 0;
    while(n!=0){
        rev = (rev*10) + (n%10);
        n/=10;
    }
    return rev;
}
//Checking For Palindrome
bool is_palindrome(int n){
    if(n == reverse(n)) return true;
    return false;
}
int main(){
    int n;
    cin >> n;
    //Printing Result
    if(is_palindrome(n)) cout << n << " Is A Palindrome Number";
    else cout << n << " Is Not A Palindrome Number";
    return 0;
}