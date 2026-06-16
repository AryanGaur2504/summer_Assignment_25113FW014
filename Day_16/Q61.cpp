#include <bits/stdc++.h>
using namespace std;

// Input Size
int input_size()
{

    int n;

    do
    {

        cout << "Enter Size : ";
        cin >> n;

        if (n <= 0)
        {
            cout << "Invalid Size" << endl;
        }

    } while (n <= 0);

    return n;
}

// Input Array
void input_array(vector<int> &arr)
{

    cout << "Enter Elements" << endl;

    for (int i = 0; i < arr.size(); i++)
    {
        cin >> arr[i];
    }
}

// Finding Missing Number
int find_missing(vector<int> &arr, int n)
{

    int sum = 0;

    int actual_sum = (n * (n + 1)) / 2;

    for (int i = 0; i < arr.size(); i++)
    {
        sum += arr[i];
    }

    return actual_sum - sum;
}

int main()
{

    int n = input_size();

    vector<int> arr(n - 1);

    input_array(arr);

    cout << "Missing Number : " << find_missing(arr, n);

    return 0;
}