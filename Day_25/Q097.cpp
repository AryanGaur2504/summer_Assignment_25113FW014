#include<bits/stdc++.h>
using namespace std;

//Function To Merge Two Sorted Arrays
vector<int> merge_sorted_arrays(vector<int> &arr1,vector<int> &arr2){
    vector<int> ans;

    int i = 0;
    int j = 0;

    //Merge Arrays
    while(i < arr1.size() && j < arr2.size()){

        if(arr1[i] < arr2[j]){
            ans.push_back(arr1[i]);
            i++;
        }
        else{
            ans.push_back(arr2[j]);
            j++;
        }
    }

    //Remaining Elements
    while(i < arr1.size()){
        ans.push_back(arr1[i]);
        i++;
    }

    while(j < arr2.size()){
        ans.push_back(arr2[j]);
        j++;
    }

    return ans;
}

int main(){
    int n1,n2;
    cin >> n1;

    vector<int> arr1(n1);

    for(int i = 0;i < n1;i++) cin >> arr1[i];

    cin >> n2;

    vector<int> arr2(n2);

    for(int i = 0;i < n2;i++) cin >> arr2[i];

    vector<int> ans = merge_sorted_arrays(arr1,arr2);

    //Print Result
    for(int i = 0;i < ans.size();i++){
        cout << ans[i] << " ";
    }

    return 0;
}