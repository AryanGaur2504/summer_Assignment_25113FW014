#include<bits/stdc++.h>
using namespace std;

//Structure To Store Employee Details
struct Employee{
    int id;
    string name;
    float salary;
};

//Function To Input Employee Details
void input_employee(Employee &e){

    cout << "Enter Employee ID : ";
    cin >> e.id;

    cin.ignore();

    cout << "Enter Employee Name : ";
    getline(cin,e.name);

    cout << "Enter Salary : ";
    cin >> e.salary;
}

//Function To Display Employee Details
void display_employee(Employee &e){

    cout << "\nEmployee ID : " << e.id << endl;
    cout << "Employee Name : " << e.name << endl;
    cout << "Salary : " << e.salary << endl;
}

int main(){

    int n;

    //Input Number Of Employees
    cout << "Enter Number Of Employees : ";
    cin >> n;

    //Vector Of Structure
    vector<Employee> emp(n);

    //Input Employee Records
    for(int i = 0;i < n;i++){

        cout << "\nEnter Details Of Employee " << i + 1 << endl;

        input_employee(emp[i]);
    }

    //Display Employee Records
    cout << "\n----- Employee Records -----\n";

    for(int i = 0;i < n;i++){
        display_employee(emp[i]);
    }

    return 0;
}