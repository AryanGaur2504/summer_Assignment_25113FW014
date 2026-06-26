#include<bits/stdc++.h>
using namespace std;

//Initializing The Account
void input_bank_details(int arr[]){
    cout << "Enter Current Bank Balance :- ";
    cin >> arr[0];

    cout << "Enter Pin :- ";
    cin >> arr[1];
}

//Performing Withdrawal
void withdraw_amount(int arr[]){
    cout << "Enter Amount To Be Withdrawn :- ";

    int with_amt;
    cin >> with_amt;

    if(with_amt <= 0){
        cout << "Invalid Amount\n";
        return;
    }

    if(with_amt > arr[0]){
        cout << "Withdrawal Amount Exceeds Balance!\n";
        return;
    }

    cout << "Enter The Pin :- ";

    int pass;
    cin >> pass;

    if(pass != arr[1]){
        cout << "Invalid Pin\n";
        return;
    }

    arr[0] -= with_amt;

    cout << "Withdrawal Successful\n";
}

//Display Balance
void show_balance(int arr[]){
    cout << "Current Bank Balance :- " << arr[0] << "\n";
}

//ATM Simulation
void atm_simulation(int arr[]){
    int choice;

    do{
        cout << "\n===== ATM MENU =====\n";
        cout << "1. Check Bank Balance\n";
        cout << "2. Withdraw Amount\n";
        cout << "3. Exit\n";

        cout << "Enter Your Choice :- ";
        cin >> choice;

        switch(choice){
            case 1:
                show_balance(arr);
                break;

            case 2:
                withdraw_amount(arr);
                break;

            case 3:
                cout << "Thank You For Using Our ATM Services!\n";
                break;

            default:
                cout << "Invalid Input\n";
        }

    }while(choice != 3);
}

int main(){
    int arr[2];

    input_bank_details(arr);

    atm_simulation(arr);

    return 0;
}
