#include <iostream>
using namespace std;
//Using Euclidean Algorithm :- gcd(a,b) = gcd(a-b,b) [a>b]
int gcd(int a,int b){
    while(a!=0 && b!=0){
        if(a>b) a = a%b;
        else b = b % a;
    }
    if(a == 0) return b;
    return a;
}
int main(){
    int a,b;
    cin >> a >> b;
    //Printing Result
    cout << "The Gcd Of " << a << " And " << b << " Is " << gcd(a,b);
    return 0;
}