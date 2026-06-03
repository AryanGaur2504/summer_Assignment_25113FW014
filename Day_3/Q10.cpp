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
    //Printing All Prime Numbers In Range 1-n
    for(int i=1;i<=n;i++){
        if(is_prime(i)) cout << i << endl;
    }
    return 0;
}