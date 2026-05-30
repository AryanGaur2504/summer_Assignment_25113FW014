#include <iostream>
using namespace std;
// Using gcd(a,b) * lcm(a,b) = a*b
int lcm(int a,int b){
    int lcm = a*b;
    while(a!=0 && b!=0){
        if(a>b) a = a % b;
        else b = b % a;
    }
    if(a == 0) lcm/=b;
    else lcm/=a;
    return lcm;
}
int main(){
    int a,b;
    cout << "Enter The Numbers :-" << endl;
    cin >> a >> b;
    //Printing The Result
    cout << "The LCM Of " << a << " And " << b << " Is " << lcm(a,b);
    return 0;
}