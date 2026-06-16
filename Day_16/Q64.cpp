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

//Removing Duplicates
int remove_duplicates(vector<int> &arr,vector<int> &temp){

    int k = 0;

    for(int i = 0;i < arr.size();i++){

        bool duplicate = false;

        for(int j = 0;j < k;j++){

            if(arr[i] == temp[j]){
                duplicate = true;
                break;
            }

        }

        if(duplicate == false){
            temp[k] = arr[i];
            k++;
        }

    }

    return k;

}

//Printing Array
void print_array(vector<int> &temp,int size){

    for(int i = 0;i < size;i++){
        cout<<temp[i]<<" ";
    }

}

int main(){

    int n = input_size();

    vector<int> arr(n);

    vector<int> temp(n);

    input_array(arr);

    int size = remove_duplicates(arr,temp);

    cout<<"Array After Removing Duplicates : ";

    print_array(temp,size);

    return 0;
}