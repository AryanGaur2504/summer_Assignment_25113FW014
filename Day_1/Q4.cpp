#include <iostream>
using namespace std;
// Printing Digits Of A Number
void digits(int n)
{
    int x = n;
    int digits = 0;
    while (x != 0)
    {
        digits++;
        x /= 10;
    }
    cout << n << " Contains " << digits << " Digits";
}
int main()
{
    int n;
    cin >> n;
    digits(n);
    return 0;
}