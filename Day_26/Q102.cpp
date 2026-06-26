#include<bits/stdc++.h>
using namespace std;

//Check Eligibility
bool is_eligible(int age){
    return age >= 18;
}

int main(){
    int age;
    cin >> age;

    if(age < 0){
        cout << "Invalid Age";
    }
    else if(is_eligible(age)){
        cout << "Eligible To Vote";
    }
    else{
        cout << "Not Eligible For Voting";
    }

    return 0;
}
