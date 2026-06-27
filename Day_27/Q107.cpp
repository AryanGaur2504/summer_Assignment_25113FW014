#include<bits/stdc++.h>
using namespace std;

//Structure To Store Salary Details
struct Employee{
    int id;
    string name;
    float basic_salary,bonus,total_salary;
};

//Function To Input Salary Details
void input_salary(Employee &e){

    cout << "Enter Employee ID : ";
    cin >> e.id;

    cin.ignore();

    cout << "Enter Employee Name : ";
    getline(cin,e.name);

    cout << "Enter Basic Salary : ";
    cin >> e.basic_salary;

    cout << "Enter Bonus : ";
    cin >> e.bonus;

    //Calculate Total Salary
    e.total_salary = e.basic_salary + e.bonus;
}

//Function To Display Salary Details
void display_salary(Employee &e){

    cout << "\nEmployee ID : " << e.id << endl;
    cout << "Employee Name : " << e.name << endl;
    cout << "Basic Salary : " << e.basic_salary << endl;
    cout << "Bonus : " << e.bonus << endl;
    cout << "Total Salary : " << e.total_salary << endl;
}

int main(){

    int n;

    //Input Number Of Employees
    cout << "Enter Number Of Employees : ";
    cin >> n;

    //Vector Of Structure
    vector<Employee> emp(n);

    //Input Salary Records
    for(int i = 0;i < n;i++){

        cout << "\nEnter Details Of Employee " << i + 1 << endl;

        input_salary(emp[i]);
    }

    //Display Salary Records
    cout << "\n----- Salary Records -----\n";

    for(int i = 0;i < n;i++){
        display_salary(emp[i]);
    }

    return 0;
}