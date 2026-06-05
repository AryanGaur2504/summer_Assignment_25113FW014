#include <iostream>
using namespace std;
//Checking For Prime
bool is_prime(int n){
    int count = 0;
    for(int i = 1;i*i <= n;i++){
        if(n%i == 0){
            count++;
            if(i != (n/i)) count++;
        }    
    }
    return (count == 2); 
}
//Finding The Largest Prime Factor
int largest_prime_factor(int n){
    int max = 0;
    for(int i = 1;i*i <= n;i++){
        if(n % i == 0){
            if(i > max && is_prime(i)) max = i;
            if(i != (n/i)){
                if((n/i) > max && is_prime(n/i)) max = n/i;
            }
        }
    }
    return max;
}
int main(){
    int n;
    cin >> n;
    //Validating Input
    if(n <= 0) cout << "Invalid Input";
    //Printing Result
    else cout << "Largest Prime Factor Of " << n << " Is :- " << largest_prime_factor(n);
    return 0;
}