#include <iostream>
using namespace std;
    //Generating The Pattern
    void print_pattern(int n){
        for(int i = 1;i <= n;i++){
            //For Gaps
            for(int j = 0;j < (n-i);j++){
                cout << " ";
            }
            //Forward Characters
            for(char k = 'A';k < 'A' + i;k++){
                cout << k;
            }
            //Reverse Characters
            for(char l = 'A'+(i-2);l >= 'A';l--){
                cout << l;
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