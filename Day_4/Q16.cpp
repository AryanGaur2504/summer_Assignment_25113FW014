#include <iostream>
#include <cmath>
using namespace std;
//Calculating Digits
int digits(int n){
    if(n == 0) return 1;
    int digits = 0;
    while(n!=0){
        n/=10;
        digits++;
    }
    return digits;
}
//Power Function Because Built In Is Giving Floating Point Errors eg 153 ≠ 152.9999999999999999
int int_power(int a,int b){
    int power = 1;
    for(int i = 0;i < b;i++){
        power*=a;
    }
    return power;
}
//Checking For Amrs (If Sum Of Each Digit Raised To The Power No. Of Digits = Origional Number)
bool is_armstrong(int n){
    int arms = 0;
    int x = n;
    int d = digits(n);
    while (x!=0)
    {
        arms+=int_power((x%10),d);
        x/=10;
    }
    if(arms == n) return true;
    return false;
}

int main(){
    int lb,ub;
    cin >> lb >> ub;
    if(lb < 0 || ub < 0 || lb > ub){
        cout << "Invalid Input";
        return 0;
    }
    //Printing The Result In Range [lb,ub]
    for (int i = lb; i <= ub; i++)
    {
        if(is_armstrong(i)) cout << i << "\t";
    }
    return 0;
}