#include <iostream>
using namespace std;
// Calculating The Factorial
int factorial(int n)
{
    int fact = 1;
    for (int i = 1; i <= n; i++)
    {
        fact *= i;
    }
    return fact;
}
int main()
{
    int n;
    cin >> n;
    // Printing The Result
    if(n < 0) //Checking For Valid Input
    {
        cout << "Invalid Input";
        return 0;
    } 
    cout << "The Factorial Of " << n << " Is " << factorial(n);
    return 0;
}