#include <iostream>
using namespace std;
// Counting Digits
int digits(int n)
{
    if(n == 0) return 1;
    if(n < 0) n = -n; // To Handle Negative Numbers
    int digits = 0;
    while (n > 0)
    {
        digits++;
        n /= 10;
    }
    return digits;
}
int main()
{
    int n;
    cin >> n;
    //Printing The Result
    cout << n << " Contains " << digits(n) << " Digits";
    return 0;
}