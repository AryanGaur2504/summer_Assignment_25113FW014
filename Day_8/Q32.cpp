#include <iostream>
using namespace std;
    //Generating The Pattern
    void print_pattern(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                cout << i;
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