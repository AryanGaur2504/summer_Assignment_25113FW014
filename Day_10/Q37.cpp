#include <iostream>
using namespace std;
    //Generating The Pattern
    void print_pattern(int n){
        for(int i = 1;i <= n;i++){
            //For Gaps
            for(int j = 1;j <= (n-i);j++){
                cout << " ";
            }
            //For *
            for(int k = 0;k < (2*i-1);k++){
                cout << "*";
            }
            cout << endl;
        }
    }
int main(){
    int n;
    cin >> n;
    //Validating Input
    if(n <= 0){
        cout << "Invalid Input";
        return 0;
    }
    //Printing The Result By Calling The Function
    print_pattern(n);
    return 0;
}