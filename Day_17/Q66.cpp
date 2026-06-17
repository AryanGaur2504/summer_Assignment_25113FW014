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

//Union Of Arrays
vector<int> union_array(vector<int> arr1,vector<int> arr2){
    vector<int> uni;

    //Insert First Array
    for(int i = 0;i < arr1.size();i++){
        uni.push_back(arr1[i]);
    }

    //Insert Unique Elements Of Second Array
    for(int i = 0;i < arr2.size();i++){

        bool found = false;

        for(int j = 0;j < uni.size();j++){
            if(arr2[i] == uni[j]){
                found = true;
                break;
            }
        }

        if(found == false){
            uni.push_back(arr2[i]);
        }
    }

    return uni;
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

    vector<int> uni = union_array(arr1,arr2);

    cout << "Union Array : ";
    display_array(uni);

    return 0;
}
