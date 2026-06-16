#include <bits/stdc++.h>
using namespace std;

//Input Size
int input_size(){

    int n;

    do{

        cout<<"Enter Size : ";
        cin>>n;

        if(n <= 0){
            cout<<"Invalid Size"<<endl;
        }

    }while(n <= 0);

    return n;

}

//Input Array
void input_array(vector<int> &arr){

    cout<<"Enter Elements"<<endl;

    for(int i = 0;i < arr.size();i++){
        cin>>arr[i];
    }

}

//Finding Pair
void pair_sum(vector<int> &arr,int target){

    bool found = false;

    for(int i = 0;i < arr.size();i++){

        for(int j = i + 1;j < arr.size();j++){

            if(arr[i] + arr[j] == target){

                cout<<"Pair Found : "<<arr[i]<<" "<<arr[j]<<endl;

                found = true;

            }

        }

    }

    if(found == false){
        cout<<"No Pair Found";
    }

}

int main(){

    int n = input_size();

    vector<int> arr(n);

    input_array(arr);

    int target;

    cout<<"Enter Target : ";
    cin>>target;

    pair_sum(arr,target);

    return 0;
}