#include <bits/stdc++.h>
using namespace std;

//Structure For Bank Account
struct Bank{
    int accNo;
    string name;
    float balance;
};

//Create New Account
void createAccount(vector<Bank> &acc){

    Bank b;

    cout << "Enter Account Number : ";
    cin >> b.accNo;

    cin.ignore();

    cout << "Enter Name : ";
    getline(cin,b.name);

    cout << "Enter Balance : ";
    cin >> b.balance;

    acc.push_back(b);

    cout << "Account Created Successfully\n";
}

//Deposit Money In Account
void depositMoney(vector<Bank> &acc){

    int no;
    float amount;

    cout << "Enter Account Number : ";
    cin >> no;

    cout << "Enter Amount : ";
    cin >> amount;

    for(int i = 0;i < acc.size();i++){

        if(acc[i].accNo == no){

            acc[i].balance += amount;

            cout << "Money Deposited\n";
            return;
        }
    }

    cout << "Account Not Found\n";
}

//Display All Accounts
void displayAccounts(vector<Bank> acc){

    if(acc.size() == 0){
        cout << "No Account Available\n";
        return;
    }

    for(int i = 0;i < acc.size();i++){

        cout << "\nAccount Number : " << acc[i].accNo << endl;
        cout << "Name : " << acc[i].name << endl;
        cout << "Balance : " << acc[i].balance << endl;
    }
}

int main(){

    vector<Bank> acc;
    int choice;

    do{

        //Menu Driven Program
        cout << "\n1. Create Account";
        cout << "\n2. Deposit Money";
        cout << "\n3. Display Accounts";
        cout << "\n4. Exit";
        cout << "\nEnter Choice : ";
        cin >> choice;

        if(choice == 1) createAccount(acc);

        else if(choice == 2) depositMoney(acc);

        else if(choice == 3) displayAccounts(acc);

    }while(choice != 4);

    return 0;
}
