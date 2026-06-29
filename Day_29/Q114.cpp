#include <bits/stdc++.h>
using namespace std;

//Input The Array
void input_array(vector<int> &arr){
    int n = arr.size();
    for(int i = 0;i < n;i++) cin >> arr[i];
}

//Display The Array
void display_array(vector<int> &arr){
    int n = arr.size();
    for(int i = 0;i < n;i++) cout << arr[i] << "\t";
    cout << endl;
}

//Insert Element
void insert_element(vector<int> &arr){
    int pos,val;
    cout << "Enter position and value: ";
    cin >> pos >> val;
    if(pos < 0 || pos > arr.size()) cout << "Invalid position" << endl;
    else arr.insert(arr.begin() + pos,val);
}

//Delete Element
void delete_element(vector<int> &arr){
    int pos;
    cout << "Enter position: ";
    cin >> pos;
    if(pos < 0 || pos >= arr.size()) cout << "Invalid position" << endl;
    else arr.erase(arr.begin() + pos);
}

//Search Element
void search_element(vector<int> &arr){
    int key;
    cout << "Enter element to search: ";
    cin >> key;
    for(int i = 0;i < arr.size();i++){
        if(arr[i] == key){
            cout << "Element found at position " << i << endl;
            return;
        }
    }
    cout << "Element not found" << endl;
}

//Sort Array
void sort_array(vector<int> &arr){
    sort(arr.begin(),arr.end());
    cout << "Array sorted successfully" << endl;
}

//Menu
void menu(){
    cout << "\n1. Display Array" << endl;
    cout << "2. Insert Element" << endl;
    cout << "3. Delete Element" << endl;
    cout << "4. Search Element" << endl;
    cout << "5. Sort Array" << endl;
    cout << "6. Exit" << endl;
    cout << "Enter your choice: ";
}

int main(){
    int n,choice;
    cout << "Enter size of array: ";
    cin >> n;
    vector<int> arr(n);
    input_array(arr);
    do{
        menu();
        cin >> choice;
        switch(choice){
            case 1: display_array(arr); break;
            case 2: insert_element(arr); break;
            case 3: delete_element(arr); break;
            case 4: search_element(arr); break;
            case 5: sort_array(arr); break;
            case 6: cout << "Program ended" << endl; break;
            default: cout << "Invalid choice" << endl;
        }
    }while(choice != 6);
    return 0;
}
