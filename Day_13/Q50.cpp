#include <iostream>
using namespace std;
//Input The Array
void input_array(int arr[],int n){
    for(int i = 0;i < n;i++){
       cin >> arr[i]; 
    }   
}
//Calculating Sum Of The Array Elements
int sum_array(int arr[],int n){
    int sum = 0;
    for(int i = 0;i < n;i++){
       sum += arr[i]; 
    }   
    return sum;
}
//Calculating Average Of The Array Elements
double avg_array(int arr[],int n){
    double avg = ((double)sum_array(arr,n))/n;
    return avg;
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
    cout << sum_array(arr,n) << endl;
    cout << avg_array(arr,n);
    return 0;
}