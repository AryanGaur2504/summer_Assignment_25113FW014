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
   while(strt < end){
    swap(arr[strt],arr[end]);
    strt++;
    end--;
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
    reverse_array(arr,0,n-1);
    display_arr(arr,n);

}