#include <iostream>
using namespace std;
//Input The Array
void input_array(int arr[],int n){
    for(int i = 0;i < n;i++){
       cin >> arr[i]; 
    }   
}
//Calculating Number Of Even Elements In The Array
int even_array(int arr[],int n){
    int even = 0;
    for(int i = 0;i < n;i++){
       if(arr[i] % 2 == 0) even++; 
    }   
    return even;
}
//Calculating Number Of Even Elements In The Array
int odd_array(int arr[],int n){
    int odd = 0;
    for(int i = 0;i < n;i++){
       if(arr[i] % 2 != 0) odd++; 
    }   
    return odd;
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
    cout << even_array(arr,n) << endl;
    cout << odd_array(arr,n);
    return 0;
}