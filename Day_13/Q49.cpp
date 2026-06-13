#include <iostream>
using namespace std;
//Input The Array
void input_array(int arr[],int n){
    for(int i = 0;i < n;i++){
       cin >> arr[i]; 
    }   
}
//Displaying The Array
void display_array(int arr[],int n){
    for(int i = 0;i < n;i++){
       cout << arr[i] << "\t"; 
    }   
}

int main(){
    int n;
    cin >> n;
    //Input Validation
    if(n <= 0){
        cout << "Invalid Input";
        return 0;
    }
    int arr[n];
    //Performing Required Actions By Calling The Functions
    input_array(arr,n);
    display_array(arr,n);
    return 0;
}