#include<bits/stdc++.h>
using namespace std;

const int MAX = 100;

struct Employee{
    int employee_id;
    string name;
    string department;
    double salary;
};

//Finds employee index using employee ID
int search_employee(Employee employees[],int count,int employee_id){
    for(int i = 0;i < count;i++){
        if(employees[i].employee_id == employee_id) return i;
    }
    return -1;
}

//Adds a new employee record
void add_employee(Employee employees[],int &count){
    if(count == MAX){
        cout << "Employee record is full\n";
        return;
    }

    int employee_id;
    cout << "Enter Employee ID: ";
    cin >> employee_id;

    if(search_employee(employees,count,employee_id) != -1){
        cout << "Employee ID already exists\n";
        return;
    }

    employees[count].employee_id = employee_id;
    cin.ignore(numeric_limits<streamsize>::max(),'\n');

    cout << "Enter Employee Name: ";
    getline(cin,employees[count].name);

    cout << "Enter Department: ";
    getline(cin,employees[count].department);

    cout << "Enter Salary: ";
    cin >> employees[count].salary;

    count++;
    cout << "Employee added successfully\n";
}

//Displays one employee record
void display_employee(Employee employee){
    cout << "Employee ID : " << employee.employee_id << endl;
    cout << "Name        : " << employee.name << endl;
    cout << "Department  : " << employee.department << endl;
    cout << "Salary      : " << employee.salary << endl;
}

//Displays all employee records
void display_all_employees(Employee employees[],int count){
    if(count == 0){
        cout << "No employee records found\n";
        return;
    }

    for(int i = 0;i < count;i++){
        cout << "\nEmployee " << i + 1 << endl;
        display_employee(employees[i]);
    }
}

//Searches and displays an employee
void find_employee(Employee employees[],int count){
    int employee_id;
    cout << "Enter Employee ID: ";
    cin >> employee_id;

    int index = search_employee(employees,count,employee_id);
    if(index == -1) cout << "Employee not found\n";
    else display_employee(employees[index]);
}

//Updates employee department and salary
void update_employee(Employee employees[],int count){
    int employee_id;
    cout << "Enter Employee ID: ";
    cin >> employee_id;

    int index = search_employee(employees,count,employee_id);
    if(index == -1){
        cout << "Employee not found\n";
        return;
    }

    cin.ignore(numeric_limits<streamsize>::max(),'\n');
    cout << "Enter New Name: ";
    getline(cin,employees[index].name);

    cout << "Enter New Department: ";
    getline(cin,employees[index].department);

    cout << "Enter New Salary: ";
    cin >> employees[index].salary;

    cout << "Employee record updated\n";
}

//Deletes an employee by shifting records
void delete_employee(Employee employees[],int &count){
    int employee_id;
    cout << "Enter Employee ID: ";
    cin >> employee_id;

    int index = search_employee(employees,count,employee_id);
    if(index == -1){
        cout << "Employee not found\n";
        return;
    }

    for(int i = index;i < count - 1;i++) employees[i] = employees[i + 1];
    count--;
    cout << "Employee record deleted\n";
}

//Controls the employee management system
void run_system(){
    Employee employees[MAX];
    int count = 0;
    int choice;

    do{
        cout << "\n--- EMPLOYEE MANAGEMENT SYSTEM ---\n";
        cout << "1. Add Employee\n";
        cout << "2. Display All Employees\n";
        cout << "3. Search Employee\n";
        cout << "4. Update Employee\n";
        cout << "5. Delete Employee\n";
        cout << "6. Exit\n";
        cout << "Enter Choice: ";
        cin >> choice;

        switch(choice){
            case 1: add_employee(employees,count); break;
            case 2: display_all_employees(employees,count); break;
            case 3: find_employee(employees,count); break;
            case 4: update_employee(employees,count); break;
            case 5: delete_employee(employees,count); break;
            case 6: cout << "Program ended\n"; break;
            default: cout << "Invalid choice\n";
        }
    }while(choice != 6);
}

int main(){
    run_system();
    return 0;
}
