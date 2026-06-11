#include <iostream>
using namespace std;
    //Checking For Prime (Factors == 2)
    bool is_prime(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count ++;
                if((n/i)!=i) count ++;
            }
        }
        if(count == 2) return true;
        return false;
    }
int main(){
    int n;
    cin >> n;
    //Input Validation
    if(n < 0) 
    {
        cout << "Invalid Input";
        return 0;
    }
    //Printing All Prime Numbers In Range 1-n
    if(is_prime(n)){
        cout << n << " Is A Prime Number";
        return 0;
    }
    cout << n << " Is Not A Prime Number";
    return 0;
}