#include <bits/stdc++.h>
using namespace std;
    //Input The Matrix
    void input_2D_array(vector<vector<int>> &arr,int row,int col){
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++) cin >> arr[i][j];
        }
    }
    //Display The Matrix
    void display_2D_array(vector<vector<int>> &arr,int row,int col){
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++) cout << arr[i][j] << "\t";
            cout << endl;
        }
    }
    //Checking For Symmetric
    bool is_Symmetric(vector<vector<int>> &matrix,int n){
        for(int i = 0;i <= n/2;i++){
            for(int j = i+1;j < n;j++){
                if(matrix[i][j] != matrix[j][i]) return false;
            }
        }
        return true;
    }
    int main(){
        int n;
        cin >> n;
        //Input Validation
        if(n <= 0){
            cout << "Invalid Input";
            return 0;
        }
            vector<vector<int>> matrix(n,vector<int>(n));
            input_2D_array(matrix, n, n);
            //Result Printing
            if(is_Symmetric(matrix,n)) cout << "Symmetric Matrix";
            else cout << "Not A Symmetric Matrix";
            return 0;
        }
