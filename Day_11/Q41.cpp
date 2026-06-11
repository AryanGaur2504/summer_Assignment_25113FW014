#include <iostream>
using namespace std;
//Calculating Sum Of Two Numbers
int sum(int a,int b){
    return (a+b);
}
int main(){
    int a,b;
    cin >> a >> b;
    //Printing The Result
    cout << sum(a,b);
    return 0;
}