#include <iostream>
using namespace std;
//Calculating a^b
double power(double a,double b){
    double poww = 1;
    for(int i=1;i<=b;i++){
        poww*=a;
    }
    return poww;
}
int main(){
    double a,b;
    cin >> a >> b;
    //Checking If Power Is >= 1
    if(b < 1){
        cout << "Invalid Input";
        return 0;
    }
    //Printing Result
    cout << power(a,b);
    return 0;
}