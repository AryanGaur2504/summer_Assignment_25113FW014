#include <iostream>
using namespace std;
//Calculating Maximum Of Two Numbers
int maximum(int a,int b){
    int max = (a > b) ? a : b;
    return max;
}
int main(){
    int a,b;
    cin >> a >> b;
    //Printing The Result
    cout << maximum(a,b);
    return 0;
}