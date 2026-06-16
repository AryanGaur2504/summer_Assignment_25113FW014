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

//Finding Maximum Frequency Element
int max_frequency(vector<int> &arr){

    int max_freq = 0;

    int ans = arr[0];

    for(int i = 0;i < arr.size();i++){

        int count = 0;

        for(int j = 0;j < arr.size();j++){

            if(arr[i] == arr[j]){
                count++;
            }

        }

        if(count > max_freq){
            max_freq = count;
            ans = arr[i];
        }

    }

    return ans;

}

int main(){

    int n = input_size();

    vector<int> arr(n);

    input_array(arr);

    cout<<"Maximum Frequency Element : "<<max_frequency(arr);

    return 0;
}