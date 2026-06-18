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
//Performing Selection Sort
void selection_sort(vector<int> &arr,int n){
    for(int i = 0;i < n-1;i++){
        int min = i;
        for(int j = i + 1;j < n;j++){
            if(arr[j] < arr[min]) min = j;  
        }
        swap(arr[i],arr[min]);
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
    selection_sort(arr,n);
    display_array(arr,n);
    return 0;
}