#include <bits/stdc++.h>
using namespace std;
// Input The Array
void input_array(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
}
// Finding Duplicate Elements
void duplicates(int arr[], int n)
{
    for (int i = 0; i <= n - 1; i++)
    {
        for (int j = i + 1; j <= n - 1; j++)
        {
            if (arr[j] == arr[i])
            {
                cout << arr[j] << "\t";
                break;
            }
        }
    }
}

int main()
{
    int n;
    cin >> n;
    // Input Validation
    if (n <= 0)
    {
        cout << "Invalid Input";
        return 0;
    }
    int arr[n];
    // Performing Required Actions By Calling The Functions
    input_array(arr, n);
    duplicates(arr, n);
    return 0;
}