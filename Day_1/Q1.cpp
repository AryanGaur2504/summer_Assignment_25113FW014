#include <iostream>
using namespace std;
// Calculating The Sum
int sum_N(int n)
{
    return (n*(n+1))/2;
}
int main()
{
    int n;
    cin >> n;
    //If Input Is Not Valid 
    if(n <= 0){
        cout << "Invalid Input";
        return 0;
    }
    //Printing The Result
    cout << "The Sum Of First " << n << " Natural Numbers Is " << sum_N(n);
    return 0;
}
