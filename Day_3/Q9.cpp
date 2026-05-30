#include <iostream>
using namespace std;
//Checking For Prime
bool is_prime(int n){
    int count = 0;
    for(int i=1;i*i<=n;i++){
        if(n%i==0) {
            count++;
            if((n/i)!= i) count ++;
        }
    }
    if(count == 2) return true;
    return false;
}
int main(){
    int n;
    cin >> n;
    //Printing The Result
    if(is_prime(n)) cout << n << " Is A Prime Number";
    else cout << n << " Is Not A Prime Number";
    return 0;
}