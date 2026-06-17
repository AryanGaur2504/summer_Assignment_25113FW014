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

//Find Common Elements
vector<int> common_elements(vector<int> arr1,vector<int> arr2){

    vector<int> common;

    for(int i = 0;i < arr1.size();i++){

        for(int j = 0;j < arr2.size();j++){

            if(arr1[i] == arr2[j]){
                common.push_back(arr1[i]);
                break;
            }
        }
    }

    return common;
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

    vector<int> common = common_elements(arr1,arr2);

    cout << "Common Elements : ";
    display_array(common);

    return 0;
}
