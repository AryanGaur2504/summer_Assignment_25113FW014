#include <iostream>
using namespace std;
    //Generating The Pattern
    void print_pattern(int n){
        for(int i = 1;i <= n;i++){
            //For Gaps
            for(int j = 0;j < (n-i);j++){
                cout << " ";
            }
            //Forward Pattern
            for(int k = 1;k <= i;k++){
                cout << k;
            }
            //Rev Pattern
            for(int l = i-1;l >= 1;l--){
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