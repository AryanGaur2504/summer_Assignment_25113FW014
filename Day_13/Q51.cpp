#include <iostream>
using namespace std;
//Input The Array
void input_array(int arr[],int n){
    for(int i = 0;i < n;i++){
       cin >> arr[i]; 
    }   
}
//Finding The Maximum Element Of The Array
int max_array(int arr[],int n){
    int max = arr[0];
    for(int i = 0;i < n;i++){
       if(arr[i] > max) max = arr[i]; 
    }   
    return max;
}
//Finding The Minimum Element Of The Array
int min_array(int arr[],int n){
    int min = arr[0];
    for(int i = 0;i < n;i++){
       if(arr[i] < min) min = arr[i]; 
    }   
    return min;
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
    cout << max_array(arr,n) << endl;
    cout << min_array(arr,n);
    return 0;
}