#include <iostream>
using namespace std;
//Calculating The Sum Of Proper Divisor Of A Number
int factor_sum(int n){
    int sum = 0;
    for(int i=1;i*i<=n;i++){
        if(n%i == 0 && i!=n){
            sum+=i;
            if(i != (n/i) && (n/i)!=n) sum+=(n/i);
        }
    }
    return sum;
}
//Checking For Perfect Number --> Sum Of Proper Divisor Of No. = Number
bool is_perfect(int n){
    return(n == factor_sum(n));
}
int main(){
    int n;
    cin >> n;
    //Input Validation
    if(n <= 0){
     cout << "Inavlid Input";
     return 0;   
    }
    //Printing Result
    if(is_perfect(n)) cout << n << " Is A Perfect Number";
    else cout << n << " Is Not A Perfect Number";
    return 0;
}