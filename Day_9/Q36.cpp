#include <iostream>
using namespace std;
    //Generating The Pattern
    void print_pattern(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1) cout << "*";
                else cout << " ";
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