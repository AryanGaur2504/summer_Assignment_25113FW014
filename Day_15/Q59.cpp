#include <bits/stdc++.h>
using namespace std;
//Input The Array Elements
void input_arr(int arr[],int n){
    for(int i = 0;i < n;i++) cin >> arr[i];
}
//Display The Array
void display_arr(int arr[],int n){
    for(int i = 0;i < n;i++) cout << arr[i] << "\t";
}
//Reverse The Array
void reverse_array(int arr[],int strt,int end){
    int n = (end - strt + 1);
    int mid = (strt+end)/2;
    for(int i = 0;i <= mid - strt;i++){
        swap(arr[strt + i],arr[end - i]);
    }
}
//Left Rotate By 'd'
void rotate_left_by_d(int arr[],int n,int d){
    d = d % n;
    reverse_array(arr,0,d-1);
    reverse_array(arr,d,n-1);
    reverse_array(arr,0,n-1);
}
int main(){
    int n;
    cin >> n;
    int d;
    cin >> d;
    if(n <= 0 || d < 0){
        cout << "Invalid Input";
        return 0;
    }
    int arr[n];
    // Calculating Left Shifts Equivalent From Right Shift
    int left_shift_equivalent = n-d;
    //Performing Required Tasks By Calling The Functions
    input_arr(arr,n);
    rotate_left_by_d(arr,n,left_shift_equivalent);
    display_arr(arr,n);
    return 0;
}