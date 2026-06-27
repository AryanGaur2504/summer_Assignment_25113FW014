#include<bits/stdc++.h>
using namespace std;

//Structure To Store Student Marksheet
struct Student{
    int roll;
    string name;
    float sub1,sub2,sub3,total,percentage;
};

//Function To Input Student Details
void input_student(Student &s){

    cout << "Enter Roll No : ";
    cin >> s.roll;

    cin.ignore();

    cout << "Enter Name : ";
    getline(cin,s.name);

    //Input Subject Marks
    cout << "Enter Subject 1 Marks : ";
    cin >> s.sub1;

    cout << "Enter Subject 2 Marks : ";
    cin >> s.sub2;

    cout << "Enter Subject 3 Marks : ";
    cin >> s.sub3;

    //Calculate Total Marks
    s.total = s.sub1 + s.sub2 + s.sub3;

    //Calculate Percentage
    s.percentage = s.total / 3;
}

//Function To Display Marksheet
void display_marksheet(Student &s){

    cout << "\n----- Marksheet -----\n";

    cout << "Roll No : " << s.roll << endl;
    cout << "Name : " << s.name << endl;

    cout << "Subject 1 : " << s.sub1 << endl;
    cout << "Subject 2 : " << s.sub2 << endl;
    cout << "Subject 3 : " << s.sub3 << endl;

    cout << "Total Marks : " << s.total << endl;
    cout << "Percentage : " << s.percentage << "%" << endl;
}

int main(){

    //Create Structure Variable
    Student s;

    //Input Student Details
    input_student(s);

    //Display Student Marksheet
    display_marksheet(s);

    return 0;
}