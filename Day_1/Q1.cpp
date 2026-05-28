#include <iostream>
using namespace std;
// Calculating And Printing The Sum
void sum_N(int n)
{
    cout << "The Sum Of First " << n << " Natural Numbers Is " << (n * (n + 1) / 2);
}
int main()
{
    int n;
    cin >> n;
    sum_N(n);
    return 0;
}
