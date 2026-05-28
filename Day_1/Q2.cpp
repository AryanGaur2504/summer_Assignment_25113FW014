#include <iostream>
using namespace std;
// Printing Upto Multiple Of 10
void table(int n)
{
    for (int i = 1; i <= 10; i++)
    {
        cout << n << " * " << i << " = " << (n * i) << endl;
    }
}
int main()
{
    int n;
    cout << "Enter The Number :- " << endl;
    cin >> n;
    table(n);
    return 0;
}