#include<bits/stdc++.h>
using namespace std;

//Structure To Store Student Details
struct Student{
    int roll;
    string name;
    float marks;
};

//Function To Input Student Details
void input_student(Student &s){

    cout << "Enter Roll No : ";
    cin >> s.roll;

    cin.ignore();

    cout << "Enter Name : ";
    getline(cin,s.name);

    cout << "Enter Marks : ";
    cin >> s.marks;
}

//Function To Display Student Details
void display_student(Student &s){

    cout << "\nRoll No : " << s.roll << endl;
    cout << "Name : " << s.name << endl;
    cout << "Marks : " << s.marks << endl;
}

int main(){

    int n;

    //Input Number Of Students
    cout << "Enter Number Of Students : ";
    cin >> n;

    //Vector Of Structure
    vector<Student> s(n);

    //Input Student Records
    for(int i = 0;i < n;i++){

        cout << "\nEnter Details Of Student " << i + 1 << endl;

        input_student(s[i]);
    }

    //Display Student Records
    cout << "\n----- Student Records -----\n";

    for(int i = 0;i < n;i++){
        display_student(s[i]);
    }

    return 0;
}