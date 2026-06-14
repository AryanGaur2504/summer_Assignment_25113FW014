#include <bits/stdc++.h>
using namespace std;
//Input The Array
void input_array(int arr[],int n){
    for(int i = 0;i < n;i++){
       cin >> arr[i]; 
    }   
}
//Finding Second Largest Element
int second_largest(int arr[],int n){
    int larg = arr[0];
    int slarg = INT_MIN;
    for(int i = 1;i < n;i++){
         if(arr[i] > larg){
            slarg = larg;
            larg = arr[i];
         }
         else if(arr[i] < larg && arr[i] > slarg) slarg = arr[i];
    }
    return slarg;
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
    cout << second_largest(arr,n);
    return 0;
}