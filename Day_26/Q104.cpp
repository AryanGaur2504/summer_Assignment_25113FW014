#include<bits/stdc++.h>
using namespace std;

//Display Question
int display_question(string question,string op1,string op2,string op3,string op4,int ans){
    cout << "\n" << question << "\n";
    cout << "1. " << op1 << "\n";
    cout << "2. " << op2 << "\n";
    cout << "3. " << op3 << "\n";
    cout << "4. " << op4 << "\n";

    cout << "Enter Your Choice :- ";

    int choice;
    cin >> choice;

    if(choice == ans){
        cout << "Correct Answer!\n";
        return 1;
    }

    cout << "Wrong Answer!\n";
    return 0;
}

//Quiz Application
void quiz_application(){
    int score = 0;

    score += display_question(
        "Who Is The Prime Minister Of India?",
        "Narendra Modi",
        "Rahul Gandhi",
        "Amit Shah",
        "Yogi Adityanath",
        1
    );

    score += display_question(
        "Which Language Is Used For Android Development?",
        "Python",
        "C++",
        "Java",
        "HTML",
        3
    );

    score += display_question(
        "What Is The Capital Of Haryana?",
        "Delhi",
        "Chandigarh",
        "Lucknow",
        "Jaipur",
        2
    );

    cout << "\nFinal Score :- " << score << "/3";
}

int main(){
    //Calling The Function
    quiz_application();

    return 0;
}
