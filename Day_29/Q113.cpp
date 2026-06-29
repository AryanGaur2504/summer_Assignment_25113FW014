#include <bits/stdc++.h>
using namespace std;

//Addition
void addition(){
    double a,b;
    cout << "Enter two numbers: ";
    cin >> a >> b;
    cout << "Sum = " << a + b << endl;
}

//Subtraction
void subtraction(){
    double a,b;
    cout << "Enter two numbers: ";
    cin >> a >> b;
    cout << "Difference = " << a - b << endl;
}

//Multiplication
void multiplication(){
    double a,b;
    cout << "Enter two numbers: ";
    cin >> a >> b;
    cout << "Product = " << a * b << endl;
}

//Division
void division(){
    double a,b;
    cout << "Enter two numbers: ";
    cin >> a >> b;
    if(b == 0) cout << "Division by zero is not possible" << endl;
    else cout << "Quotient = " << a / b << endl;
}

//Menu
void menu(){
    cout << "\n1. Addition" << endl;
    cout << "2. Subtraction" << endl;
    cout << "3. Multiplication" << endl;
    cout << "4. Division" << endl;
    cout << "5. Exit" << endl;
    cout << "Enter your choice: ";
}

int main(){
    int choice;
    do{
        menu();
        cin >> choice;
        switch(choice){
            case 1: addition(); break;
            case 2: subtraction(); break;
            case 3: multiplication(); break;
            case 4: division(); break;
            case 5: cout << "Program ended" << endl; break;
            default: cout << "Invalid choice" << endl;
        }
    }while(choice != 5);
    return 0;
}
