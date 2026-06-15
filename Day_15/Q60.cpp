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
//Moving The Zeroes To The End
void zeroes_to_end(int arr[],int n){
    int j = 0;
    for(int i = 0;i < n;i++){
    if(arr[i] != 0){
        swap(arr[i],arr[j]);
        j++;
    }
   }
}
int main(){
    int n;
    cin >> n;
    if(n <= 0){
        cout << "Invalid Input";
        return 0;
    }
    int arr[n];
    //Performing Required Tasks By Calling The Functions
    input_arr(arr,n);
    zeroes_to_end(arr,n);
    display_arr(arr,n);

}