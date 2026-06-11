#include <iostream>
using namespace std;
// Calculating The Factorial
int factorial(int n)
{
    if(n == 0 || n == 1) return 1;
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
    //Input Validation
    if(n < 0) 
    {
        cout << "Invalid Input";
        return 0;
    } 
    // Printing The Result
    cout << "The Factorial Of " << n << " Is " << factorial(n);
    return 0;
}