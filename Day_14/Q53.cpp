#include <iostream>
using namespace std;
//Input The Array
void input_array(int arr[],int n){
    for(int i = 0;i < n;i++){
       cin >> arr[i]; 
    }   
}
//Finding Element (n --> Size,x --> Element To Be Found)
int linear_search(int arr[],int n,int x){
    for(int i = 0;i <= n-1;i++){
        if(arr[i] == x) return i; //Returns Index At Which Element Is Present
    }
    return -1;//If Element Is Not Found
}

int main(){
    int n,x;
    cin >> n >> x;
    //Input Validation
    if(n <= 0){
        cout << "Invalid Input";
        return 0;
    }
    int arr[n];
    //Performing Required Actions By Calling The Functions
    input_array(arr,n);
    cout << linear_search(arr,n,x);
    return 0;
}