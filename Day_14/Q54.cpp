#include <bits/stdc++.h>
using namespace std;
//Input The Array
void input_array(int arr[],int n){
    for(int i = 0;i < n;i++){
       cin >> arr[i]; 
    }   
}
//Finding Frequency Of Element (n --> Size,x --> Element)
int frequency(int arr[],int n,int x){
    unordered_map <int,int> hash;
    for(int i = 0;i <= n-1;i++){
        hash[arr[i]]++; 
    }
    //Fetching
    return hash[x];
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
    cout << frequency(arr,n,x);
    return 0;
}