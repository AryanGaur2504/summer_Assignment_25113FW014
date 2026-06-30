#include<bits/stdc++.h>
using namespace std;

const int MAX = 100;

struct Student{
    int roll_no;
    string name;
    string course;
    float marks;
};

//Finds student index using roll number
int search_student(Student students[],int count,int roll_no){
    for(int i = 0;i < count;i++){
        if(students[i].roll_no == roll_no) return i;
    }
    return -1;
}

//Adds a new student record
void add_student(Student students[],int &count){
    if(count == MAX){
        cout << "Student record is full\n";
        return;
    }

    int roll_no;
    cout << "Enter Roll Number: ";
    cin >> roll_no;

    if(search_student(students,count,roll_no) != -1){
        cout << "Roll number already exists\n";
        return;
    }

    students[count].roll_no = roll_no;
    cin.ignore(numeric_limits<streamsize>::max(),'\n');

    cout << "Enter Name: ";
    getline(cin,students[count].name);

    cout << "Enter Course: ";
    getline(cin,students[count].course);

    cout << "Enter Marks: ";
    cin >> students[count].marks;

    count++;
    cout << "Student added successfully\n";
}

//Displays one student record
void display_student(Student student){
    cout << "Roll Number : " << student.roll_no << endl;
    cout << "Name        : " << student.name << endl;
    cout << "Course      : " << student.course << endl;
    cout << "Marks       : " << student.marks << endl;
}

//Displays all student records
void display_all_students(Student students[],int count){
    if(count == 0){
        cout << "No student records found\n";
        return;
    }

    for(int i = 0;i < count;i++){
        cout << "\nStudent " << i + 1 << endl;
        display_student(students[i]);
    }
}

//Searches and displays a student
void find_student(Student students[],int count){
    int roll_no;
    cout << "Enter Roll Number: ";
    cin >> roll_no;

    int index = search_student(students,count,roll_no);
    if(index == -1) cout << "Student not found\n";
    else display_student(students[index]);
}

//Updates the selected student record
void update_student(Student students[],int count){
    int roll_no;
    cout << "Enter Roll Number: ";
    cin >> roll_no;

    int index = search_student(students,count,roll_no);
    if(index == -1){
        cout << "Student not found\n";
        return;
    }

    cin.ignore(numeric_limits<streamsize>::max(),'\n');
    cout << "Enter New Name: ";
    getline(cin,students[index].name);

    cout << "Enter New Course: ";
    getline(cin,students[index].course);

    cout << "Enter New Marks: ";
    cin >> students[index].marks;

    cout << "Student record updated\n";
}

//Deletes a student by shifting remaining records
void delete_student(Student students[],int &count){
    int roll_no;
    cout << "Enter Roll Number: ";
    cin >> roll_no;

    int index = search_student(students,count,roll_no);
    if(index == -1){
        cout << "Student not found\n";
        return;
    }

    for(int i = index;i < count - 1;i++) students[i] = students[i + 1];
    count--;
    cout << "Student record deleted\n";
}

//Controls the complete student record system
void run_system(){
    Student students[MAX];
    int count = 0;
    int choice;

    do{
        cout << "\n--- STUDENT RECORD SYSTEM ---\n";
        cout << "1. Add Student\n";
        cout << "2. Display All Students\n";
        cout << "3. Search Student\n";
        cout << "4. Update Student\n";
        cout << "5. Delete Student\n";
        cout << "6. Exit\n";
        cout << "Enter Choice: ";
        cin >> choice;

        switch(choice){
            case 1: add_student(students,count); break;
            case 2: display_all_students(students,count); break;
            case 3: find_student(students,count); break;
            case 4: update_student(students,count); break;
            case 5: delete_student(students,count); break;
            case 6: cout << "Program ended\n"; break;
            default: cout << "Invalid choice\n";
        }
    }while(choice != 6);
}

int main(){
    run_system();
    return 0;
}
