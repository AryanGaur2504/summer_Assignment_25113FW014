#include <bits/stdc++.h>
using namespace std;
//Input The 2D-Array
void input_array(vector<vector<int>> &arr,int rows,int col){
    for(int i = 0;i < rows;i++){
        for(int j = 0;j < col;j++) cin >> arr[i][j];
    }
}
//Display The 2D-Array
void display_array(vector<int> &arr,int n){
    for(int i = 0;i < n;i++) cout << arr[i] << "\t";
    }
//Calculating The Primary & Secondary & Total Diagonal Sum
vector<int> diag_sum(vector<vector<int>> &arr,int n){
    int primary_diag_sum = 0;
    int secondary_diag_sum = 0;
    int total_sum = 0;
    for(int i = 0;i < n;i++){
        primary_diag_sum+= arr[i][i];
        secondary_diag_sum+= arr[i][n-i-1];
    }
    total_sum = primary_diag_sum + secondary_diag_sum;
    if(n % 2 != 0) total_sum-= arr[n/2][n/2];
    return {total_sum,primary_diag_sum,secondary_diag_sum};
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
    //Performing Necessary Actions By Calling The Functions
    input_array(matrix,n,n);
    vector<int> diagonal_sum = diag_sum(matrix,n);
    display_array(diagonal_sum,diagonal_sum.size());
    return 0;
}