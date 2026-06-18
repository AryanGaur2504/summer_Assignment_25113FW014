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
//Performing Binary Search
int binary_search(vector<int> &arr,int n,int x){
    int lb = 0;
    int ub = n-1;
    int mb = (lb + ub)/2;
    while(lb <= ub){
        if(arr[mb] == x) return mb;
        else if(x < arr[mb]){
            ub = mb - 1;
            mb = (ub + lb)/2;
        }
        else{
            lb = mb + 1;
            mb = (ub + lb)/2;
        }
    }
    return -1;
}
int main(){
    int n,x;
    cin >> n;
    //Input Validation
    if(n <= 0){
        cout << "Invalid Input";
        return 0;
    }
    vector<int> arr(n);
    //Performing Necessary Actions By Calling The Functions
    input_array(arr,n);
    cin >> x;
    cout << binary_search(arr,n,x);
    return 0;
}