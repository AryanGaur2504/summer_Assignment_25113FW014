#include<bits/stdc++.h>
using namespace std;

//Comparator Function
bool cmp(string a,string b){
    return a.length() < b.length();
}

//Function To Sort Words By Length
void sort_by_length(vector<string> &arr){

    //Sort Words
    sort(arr.begin(),arr.end(),cmp);
}

int main(){
    int n;
    cin >> n;

    vector<string> arr(n);

    for(int i = 0;i < n;i++){
        cin >> arr[i];
    }

    sort_by_length(arr);

    //Print Result
    for(int i = 0;i < n;i++){
        cout << arr[i] << endl;
    }

    return 0;
}