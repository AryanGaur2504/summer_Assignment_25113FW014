#include<bits/stdc++.h>
using namespace std;

//Function To Sort Names
void sort_names(vector<string> &arr){

    //Sort Names
    sort(arr.begin(),arr.end());
}

int main(){
    int n;
    cin >> n;

    vector<string> arr(n);

    for(int i = 0;i < n;i++){
        cin >> arr[i];
    }

    sort_names(arr);

    //Print Result
    for(int i = 0;i < n;i++){
        cout << arr[i] << endl;
    }

    return 0;
}