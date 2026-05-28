#include <iostream>
using namespace std;
// Calculating And Printing The Factorial
void factorial(int n)
{
    int fact = 1;
    for (int i = 1; i <= n; i++)
    {
        fact *= i;
    }
    cout << "The Factorial Of " << n << " Is " << fact;
}
int main()
{
    int n, fact = 1;
    cout << "Enter The Number :- " << endl;
    cin >> n;
    factorial(n);
    return 0;
}