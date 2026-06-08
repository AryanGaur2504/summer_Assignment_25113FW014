#include <iostream>
using namespace std;
    //Generating Half Pyramid
    void half_pyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
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
    half_pyramid(n);
    return 0;
}