#include <bits/stdc++.h>
using namespace std;
//Input The Array
void input_array(vector<int> &arr,int n){
    for(int i = 0;i < n;i++) cin >> arr[i];
}
//Display The Array
void display_array(vector<int> &arr,int n){
    for(int i = 0;i < n;i++) cout << arr[i] << "\t";
}
//Performing Bubble Sort
void bubble_sort(vector<int> &arr,int n){
    for(int i = 0;i < n-1;i++){
        int swapped = 0;
        for(int j = 0;j < n-i-1;j++){
            if(arr[j] > arr[j+1]){
                swap(arr[j],arr[j+1]);
                swapped++;
            } 
        }
        //To Stop If Array Sorts Before Complete Iteration
        if(swapped == 0) return;
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
    vector<int> arr(n);
    //Performing Necessary Actions By Calling The Functions
    input_array(arr,n);
    bubble_sort(arr,n);
    display_array(arr,n);
    return 0;
}