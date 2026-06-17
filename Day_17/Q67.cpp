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

//Check Element Present
bool is_present(vector<int> arr,int target){

    for(int i = 0;i < arr.size();i++){
        if(arr[i] == target){
            return true;
        }
    }

    return false;
}

//Intersection Of Arrays
vector<int> intersection_array(vector<int> arr1,vector<int> arr2){

    vector<int> inter;

    for(int i = 0;i < arr1.size();i++){

        bool found = false;

        //Check In Second Array
        for(int j = 0;j < arr2.size();j++){

            if(arr1[i] == arr2[j]){
                found = true;
                break;
            }
        }

        //Avoid Duplicate Elements
        if(found == true && is_present(inter,arr1[i]) == false){
            inter.push_back(arr1[i]);
        }
    }

    return inter;
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

    vector<int> inter = intersection_array(arr1,arr2);

    cout << "Intersection Array : ";
    display_array(inter);

    return 0;
}
