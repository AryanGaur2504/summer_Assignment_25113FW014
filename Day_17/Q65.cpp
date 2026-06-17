#include <bits/stdc++.h>
using namespace std;

void input_array(vector<int> &arr,int n){
    for(int i = 0;i < n;i++) cin >> arr[i];
}

void display_array(vector<int> &arr){
    for(int i = 0;i < arr.size();i++){
        cout << arr[i] << "\t";
    }
    cout << endl;
}

//Merge Two Arrays
vector<int> merge_arrays(vector<int> arr1,vector<int> arr2){
    vector<int> merged;

    //Insert First Array
    for(int i = 0;i < arr1.size();i++){
        merged.push_back(arr1[i]);
    }

    //Insert Second Array
    for(int i = 0;i < arr2.size();i++){
        merged.push_back(arr2[i]);
    }

    return merged;
}

int main(){
    int n1,n2;

    cout << "Enter Size Of First Array : ";
    cin >> n1;

    vector<int> arr1(n1);

    cout << "Enter Elements Of First Array : ";
    input_array(arr1,n1);

    cout << "Enter Size Of Second Array : ";
    cin >> n2;

    vector<int> arr2(n2);

    cout << "Enter Elements Of Second Array : ";
    input_array(arr2,n2);

    vector<int> merged = merge_arrays(arr1,arr2);

    cout << "Merged Array : ";
    display_array(merged);

    return 0;
}
