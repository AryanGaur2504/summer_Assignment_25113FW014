#include <iostream>
using namespace std;
    //Generating The Pattern
    void print_pattern(int n){
        for(char i = 'A';i < 'A'+ n;i++){
            for(char j = 'A';j <= i;j++){
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